package app.domain.services;

import app.adapters.inputs.MedicalOrder;
import app.adapters.medicalRecord.AdpMedicalRecord;
import app.domain.models.MedicalRecord;
import app.domain.models.Order;
import app.ports.MedicalRecordPort;
import app.ports.OrderPort;
import org.springframework.stereotype.Service;

@Service
public class VetService {
    private final MedicalRecordPort medicalRecordPort;
    private final OrderPort orderPort;

    public VetService(MedicalRecordPort medicalRecordPort, OrderPort orderPort) {
        this.medicalRecordPort = medicalRecordPort;
        this.orderPort = orderPort;
    }

    public void registerMedicalHistory(MedicalRecord record) {
        medicalRecordPort.saveMedicalRecord(record);
        System.out.println("Historia clínica registrada exitosamente.");
    }

    public void createMedicalOrder(Order order) {
        orderPort.saveOrder(order);
        System.out.println("Orden médica creada exitosamente.");
    }

    public boolean cancelMedicalOrder(String orderId) throws Exception {
        Order order = orderPort.findOrderById(orderId);
        if (order == null) {
            throw new Exception("Orden no encontrada.");
        }
        order.cancelMedicalOrder();
        orderPort.updateOrder(order);
        System.out.println("Orden médica anulada exitosamente.");
		return false;
    }

	public void registerMedicalRecord(AdpMedicalRecord record) {
		// TODO Auto-generated method stub
		
	}

	public String generateUniqueOrderId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createMedicalOrder(MedicalOrder order) {
		// TODO Auto-generated method stub
		
	}

	public void createMedicalOrder(long petId, long ownerId, long vetId, String medicine, String dose) {
		// TODO Auto-generated method stub
		
	}
}
