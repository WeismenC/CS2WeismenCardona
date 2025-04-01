package app.adapters.medicalRecord.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import app.adapters.pet.entity.PetEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medicalrecords")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Medical_id", nullable = false, updatable = false)
	private long medicalId;

	@Column(name = "Pet_id", nullable = false)
	private long petId;

	@Column(name = "RecordDate", nullable = false)
	private Date recordDate;

	@Column(name = "Veterinarian_id", nullable = false)
	private long veterinarianId;

	@Column(name = "Reason", nullable = false)
	private String reason;

	@Column(name = "Symptoms", nullable = false)
	private String symptoms;

	@Column(name = "Diagnosis", nullable = false)
	private String diagnosis;

	@Column(name = "procedureDetails", nullable = false)
	private String procedureDetails;

	@Column(name = "Medication")
	private String medication;

	@Column(name = "Dosage")
	private String dosage;

	@Column(name = "Order_id")
	private String orderId;

	@Column(name = "VaccinationHistory")
	private String vaccinationHistory;

	@Column(name = "Allergies")
	private String allergies;

	@Column(name = "IsOrderCancelled", nullable = false)
	private boolean isOrderCancelled;

	public MedicalRecordEntity(long petId, Object o, String reason, String symptoms, String diagnosis,
			String procedureDetails, String medication, String dosage, Object o1, Object o2, Object o3, Object o4,
			Object o5, boolean b) {
	}

    public MedicalRecordEntity() {
		// TODO Auto-generated constructor stub
	}

	public void setPet(PetEntity petEntity) {
    }

	public void setDate(LocalDateTime now) {
	}

	public String getDate() {
		return allergies;
	}

	public void setReason(String reason2) {
		// TODO Auto-generated method stub
		
	}

	public void setSymptoms(String symptoms2) {
		// TODO Auto-generated method stub
		
	}

	public String getReason() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSymptoms() {
		// TODO Auto-generated method stub
		return null;
	}
}
