package app.domain.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Sale {
    public Sale(String orderId, String petId, String ownerId, String medicationName, int quantity, double totalPrice) {
    this.setPetId(orderId);
    this.setProductName(ownerId);
    this.setDate(medicationName);
    this.setQuantity(quantity);
    this.setTotalPrice(totalPrice);
}

	public Sale(Sale sale) {
		// TODO Auto-generated constructor stub
	}

	public Sale(String petId, String ownerId, String productName, String date, int quantity, String totalPrice) {
		// TODO Auto-generated constructor stub
	}

	public Sale(String petId, String ownerId, String productName, String date, String quantity, String totalPrice) {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("null")
	public String getPetId() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("null")
	public String getOwnerId() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("null")
	public String getProductName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPetId(String orderId) {
	}

	public void setProductName(String ownerId) {
	}

	public void setDate(String medicationName) {
	}

	public void setQuantity(int quantity) {
	}

	public void setTotalPrice(double totalPrice) {
	}

	public String getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTotalPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}

