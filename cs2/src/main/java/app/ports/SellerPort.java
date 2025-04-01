package app.ports;

import app.domain.models.Invoice;
import app.domain.models.MedicalOrder;

public interface SellerPort {
    
    void generateInvoice(String petId, String ownerId, String orderId, String product, double price, int quantity);
    
    Invoice getInvoice(String invoiceId);
    
    boolean validateMedicalOrder(String orderId);
    
    MedicalOrder getMedicalOrder(String orderId);
}
