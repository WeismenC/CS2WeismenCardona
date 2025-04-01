package app.adapters.order.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import app.adapters.pet.entity.PetEntity;
import app.adapters.veterinarian.entity.VeterinarianEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="orders")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
	@Id
	@Column(name = "Order_id")
	private long orderId;
	
	@Column(name = "Pet_id")
	private long petId;
	
	@Column(name = "Owner_id")
	private long ownerId;
	
	@Column(name = "Veterinarian_id")
	private long veterinarianId;
    @Column(name = "Medication")
	private String medication;
    
	@Column(name = "Dosage")
	private String dosage;
	
	@Column(name = "OrderDate")
	private  Date orderDate;
	
	@Column(name = "IsCancelled")
	private boolean isCancelled;
	
	
	public long getOrderId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public long getPetId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public long getOwnerId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public long getVeterinarianId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getMedication() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDosage() {
		// TODO Auto-generated method stub
		return null;
	}
	public Date getOrderDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}
	public void setOrderId(Object orderId2) {
		// TODO Auto-generated method stub
		
	}
	public void setPetId(Object petId2) {
		// TODO Auto-generated method stub
		
	}
	public void setOwnerId(Object ownerId2) {
		// TODO Auto-generated method stub
		
	}
	public void setVeterinarianId(Object veterinarianId2) {
		// TODO Auto-generated method stub
		
	}
	public void setMedication(Object medication2) {
		// TODO Auto-generated method stub
		
	}
	public void setDosage(Object dosage2) {
		// TODO Auto-generated method stub
		
	}
	public void setOrderDate(Object orderDate2) {
		// TODO Auto-generated method stub
		
	}
	public void setCancelled(boolean cancelled) {
		// TODO Auto-generated method stub
		
	}

    public void setPet(PetEntity petEntity) {
    }

	public void setVeterinarian(VeterinarianEntity veterinarianEntity) {
	}

	public void setDate(LocalDateTime now) {
	}

	public void setActive(boolean b) {
	}
}
