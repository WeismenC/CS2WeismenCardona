package app.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Getter
@Setter
public class Invoice {
    private String id;
    private String petId;
    private String ownerId;
    private String productName;
    private double price;
    private int quantity;
    private Date invoiceDate;

	public Invoice() {
	}

    public Invoice(String id, String petId, String ownerId, String orderId, String productName, double price, int quantity, Date invoiceDate) {
        this.setId(id);
        this.setPetId(petId);
        this.setOwnerId(ownerId);
        this.setOrderId(orderId);
        this.setProductName(productName);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setInvoiceDate(invoiceDate);
    }

	public String getOrderId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public void setOrderId(String orderId) {
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceId() {
		return null;
	}
}
