package app.ports;

import app.domain.models.MedicalOrder;
import app.domain.models.MedicalRecord;

public interface VeterinarianPort {
    
    void createMedicalRecord(String petId, String reason, String symptoms);
    
    MedicalRecord getMedicalRecord(String petId);
    
    void createMedicalOrder(String petId, String ownerId, String vetId, String medicine, String dose);
    
    MedicalOrder getMedicalOrder(String orderId);
}
