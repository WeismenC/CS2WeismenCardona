package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@NoArgsConstructor
public class Order {
    @Getter
    @Setter
    private long orderId;
    @Getter
    private long petId;
    @Getter
    private long ownerId;
    @Getter
    private long veterinarianId;
    @Getter
    private String medication;
    @Getter
    private String dosage;
    @Getter
    private Date orderDate;
    private boolean isCancelled;

    public Order(long orderId, long petId, long ownerId, long veterinarianId, String medication, String dosage, Date orderDate) {
        this.orderId = orderId;
        this.petId = petId;
        this.ownerId = ownerId;
        this.veterinarianId = veterinarianId;
        this.medication = medication;
        this.dosage = dosage;
        this.orderDate = orderDate;
        this.isCancelled = false;
    }

    public long getId() {
        return orderId; 
    }

    public boolean isCancelled() {
        return isCancelled; 
    }
    
    public void cancelOrder() {
        this.isCancelled = true;
    }

	public void cancelMedicalOrder() {
		// TODO Auto-generated method stub
		
	}

	public Object getOrderId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPetId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOwnerId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getVeterinarianId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMedication() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDosage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOrderDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
