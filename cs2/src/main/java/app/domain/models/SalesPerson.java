package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SalesPerson extends User {
    private String salesPersonId;
    public SalesPerson(long idCard, String name, int age, String userName, String password) {
        super(idCard, name.toCharArray(), age, "SalesPerson", userName, password);
    }

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getIdCard() {
		// TODO Auto-generated method stub
		return String.valueOf(0);
	}

	public String getSalesPersonId() {
		return salesPersonId;
	}

	public void setSalesPersonId(String salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
}
