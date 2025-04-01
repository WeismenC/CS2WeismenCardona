package app.adapters.medicalRecord;

import app.adapters.medicalRecord.entity.MedicalRecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.adapters.medicalRecord.repository.MedicalRecordRepository;
import app.domain.models.MedicalRecord;
import app.ports.MedicalRecordPort;

@Service
public class AdpMedicalRecord implements MedicalRecordPort {

	private final MedicalRecordRepository medicalRecordRepository;

	@Autowired
	public AdpMedicalRecord(MedicalRecordRepository medicalRecordRepository) {
		this.medicalRecordRepository = medicalRecordRepository;
	}

	public AdpMedicalRecord() {
		this.medicalRecordRepository = null;
		
	}

	@Override
	public void saveMedicalRecord(MedicalRecord record) {
		MedicalRecordEntity entity = new MedicalRecordEntity(
				record.getPetId(),
				null, record.getReason(),
				record.getSymptoms(),
				record.getDiagnosis(),
				record.getProcedure(),
				record.getMedication(),
				record.getDosage(), null, null, null, null, null, false
		);
		medicalRecordRepository.save(entity);
	}

	@Override
	public MedicalRecordEntity findByPetId(long petId) {
		return medicalRecordRepository.findById(petId).orElse(null);
	}
}

