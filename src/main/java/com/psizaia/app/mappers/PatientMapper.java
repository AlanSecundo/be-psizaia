package com.psizaia.app.mappers;

import com.psizaia.app.domains.*;
import com.psizaia.app.domains.Patient;
import com.psizaia.app.dtos.*;

public final class PatientMapper {

	private PatientMapper() {}

    public static Patient toEntity(final PatientCreateRequest request) {
        final Patient patient = new Patient();

        final IdentificationInfo identificationInfo = request.identification();
        final Identification identification = new Identification();
        identification.setFullName(identificationInfo.fullName());
        identification.setSocialName(identificationInfo.socialName());
        identification.setBirthDate(identificationInfo.birthDate());
        identification.setGender(identificationInfo.gender());
        identification.setMaritalStatus(identificationInfo.maritalStatus());
        identification.setCpf(identificationInfo.cpf());
        identification.setOver18(identificationInfo.over18());
        patient.setIdentification(identification);

        final ContactInfo contactInfo = request.contact();
        final Contact contact = new Contact();
        contact.setEmail(contactInfo.email());
        contact.setPhone(contactInfo.phone());
        contact.setAddress(contactInfo.address());
        contact.setPreferredContactMethod(contactInfo.preferredContactMethod());
        patient.setContact(contact);

        final EmergencyContactInfo emergencyInfo = request.emergencyContact();
        if (emergencyInfo != null) {
            final EmergencyContact emergencyContact = new EmergencyContact();
            emergencyContact.setEmergencyContactName(emergencyInfo.emergencyContactName());
            emergencyContact.setEmergencyContactRelationship(emergencyInfo.emergencyContactRelationship());
            emergencyContact.setEmergencyContactPhone(emergencyInfo.emergencyContactPhone());
            patient.setEmergencyContact(emergencyContact);
        }

        final ClinicalInfo clinicalInfo = request.clinical();
        if (clinicalInfo != null) {
            final Clinical clinical = new Clinical();
            clinical.setInitialComplaint(clinicalInfo.initialComplaint());
            clinical.setCurrentMedications(clinicalInfo.currentMedications());
            clinical.setCurrentPhysicianName(clinicalInfo.currentPhysicianName());
            clinical.setCurrentPhysicianSpecialty(clinicalInfo.currentPhysicianSpecialty());
            clinical.setCurrentPhysicianPhone(clinicalInfo.currentPhysicianPhone());
            patient.setClinical(clinical);
        }

        final BillingInfo billingInfo = request.billing();
        if (billingInfo != null) {
            final Billing billing = new Billing();
            billing.setPaymentMethod(billingInfo.paymentMethod());
            billing.setReceiptDocument(billingInfo.receiptDocument());
            billing.setDueDay(billingInfo.dueDay());
            billing.setSessionPrice(billingInfo.sessionPrice());
            billing.setSessionsPerMonth(billingInfo.sessionsPerMonth());
            patient.setBilling(billing);
        }

        final InsuranceInfo insuranceInfo = request.insurance();
        if (insuranceInfo != null) {
            final Insurance insurance = new Insurance();
            insurance.setHasInsurance(insuranceInfo.hasInsurance());
            insurance.setInsurancePlan(insuranceInfo.insurancePlan());
            insurance.setInsuranceCardNumber(insuranceInfo.insuranceCardNumber());
            patient.setInsurance(insurance);
        }

        final OriginNotesInfo originNotesInfo = request.originNotes();
        if (originNotesInfo != null) {
            final OriginNotes originNotes = new OriginNotes();
            originNotes.setOrigin(originNotesInfo.origin());
            originNotes.setInternalNotes(originNotesInfo.internalNotes());
            patient.setOriginNotes(originNotes);
        }

        return patient;
    }

    public static PatientResponse toResponse(final Patient patient) {
        final Identification id = patient.getIdentification();
        final IdentificationInfo identification = new IdentificationInfo(
                id != null ? id.getFullName() : null,
                id != null ? id.getSocialName() : null,
                id != null ? id.getBirthDate() : null,
                id != null ? id.getGender() : null,
                id != null ? id.getMaritalStatus() : null,
                id != null ? id.getCpf() : null,
                id != null ? id.getOver18() : null
        );

        final Contact c = patient.getContact();
        final ContactInfo contact = new ContactInfo(
                c != null ? c.getEmail() : null,
                c != null ? c.getPhone() : null,
                c != null ? c.getAddress() : null,
                c != null ? c.getPreferredContactMethod() : null
        );

        final EmergencyContact e = patient.getEmergencyContact();
        final EmergencyContactInfo emergencyContact = new EmergencyContactInfo(
                e != null ? e.getEmergencyContactName() : null,
                e != null ? e.getEmergencyContactRelationship() : null,
                e != null ? e.getEmergencyContactPhone() : null
        );

        final Clinical cl = patient.getClinical();
        final ClinicalInfo clinical = new ClinicalInfo(
                cl != null ? cl.getInitialComplaint() : null,
                cl != null ? cl.getCurrentMedications() : null,
                cl != null ? cl.getCurrentPhysicianName() : null,
                cl != null ? cl.getCurrentPhysicianSpecialty() : null,
                cl != null ? cl.getCurrentPhysicianPhone() : null
        );

        final Billing b = patient.getBilling();
        final BillingInfo billing = new BillingInfo(
                b != null ? b.getPaymentMethod() : null,
                b != null ? b.getReceiptDocument() : null,
                b != null ? b.getDueDay() : null,
                b != null ? b.getSessionPrice() : null,
                b != null ? b.getSessionsPerMonth() : null
        );

        final Insurance ins = patient.getInsurance();
        final InsuranceInfo insurance = new InsuranceInfo(
                ins != null ? ins.getHasInsurance() : null,
                ins != null ? ins.getInsurancePlan() : null,
                ins != null ? ins.getInsuranceCardNumber() : null
        );

        final OriginNotes on = patient.getOriginNotes();
        final OriginNotesInfo originNotes = new OriginNotesInfo(
                on != null ? on.getOrigin() : null,
                on != null ? on.getInternalNotes() : null
        );

        return new PatientResponse(
                patient.getId(),
                identification,
                contact,
                emergencyContact,
                clinical,
                billing,
                insurance,
                originNotes
        );
    }
}

