package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class MedicalRecord {

    private String allergies;
    private Date date;
    private String diagnosis;
    private String dosage;
    private boolean isOrderCancelled;
    private String medication;
    private String procedureDetails;
    private String reason;
    private String symptoms;
    private String vaccinationHistory;
    private String veterinarianId;
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public boolean isOrderCancelled() {
		return isOrderCancelled;
	}
	public void setOrderCancelled(boolean isOrderCancelled) {
		this.isOrderCancelled = isOrderCancelled;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public long getOrderId() {
		return 0;
	}
	public void setOrderId(long orderId) {
	}
	public long getPetId() {
		return 0;
	}
	public void setPetId(long petId) {
	}
	public String getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(String procedureDetails) {
		this.procedureDetails = procedureDetails;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getVaccinationHistory() {
		return vaccinationHistory;
	}
	public void setVaccinationHistory(String vaccinationHistory) {
		this.vaccinationHistory = vaccinationHistory;
	}
	public String getVeterinarianId() {
		return veterinarianId;
	}
	public void setVeterinarianId(String veterinarianId) {
		this.veterinarianId = veterinarianId;
	}
	public String getProcedure() {
		// TODO Auto-generated method stub
		return null;
	}
}
