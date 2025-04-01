package app.ports;

import app.adapters.medicalRecord.entity.MedicalRecordEntity;
import app.domain.models.MedicalRecord;

public interface MedicalRecordPort {
    public void saveMedicalRecord(MedicalRecord record);
    
    public MedicalRecordEntity findByPetId(long petId);
}
