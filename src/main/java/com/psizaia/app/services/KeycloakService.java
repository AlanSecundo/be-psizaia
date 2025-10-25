package com.psizaia.app.services;

import jakarta.ws.rs.core.Response;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeycloakService {

    private final Keycloak keycloak;
    private final String realm;

    public KeycloakService(final Keycloak keycloak, @Value("${keycloak.realm}") final String realm) {
        this.keycloak = keycloak;
        this.realm = realm;
    }

    public String createUser(final String fullName, final String email, final String password) {
        final RealmResource realmResource = keycloak.realm(realm);
        final UsersResource usersResource = realmResource.users();

        final CredentialRepresentation credential = new CredentialRepresentation();
        credential.setType(CredentialRepresentation.PASSWORD);
        credential.setTemporary(false);
        credential.setValue(password);

        final UserRepresentation user = new UserRepresentation();
        user.setEnabled(true);
        user.setUsername(email);
        user.setEmail(email);
        user.setFirstName(fullName);
        user.setCredentials(List.of(credential));

        final Response response = usersResource.create(user);
        if (response.getStatus() >= 200 && response.getStatus() < 300) {
            final String location = response.getLocation().getPath();
            final String id = location.substring(location.lastIndexOf('/') + 1);
            response.close();
            return id;
        }
        try {
            final String error = response.readEntity(String.class);
            throw new RuntimeException("Failed to create user in Keycloak: " + response.getStatus() + " - " + error);
        } finally {
            response.close();
        }
    }
}


