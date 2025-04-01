package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Veterinarian extends User {
    private String veterinarianId;
    public Veterinarian(long idCard, String name, int age, String userName, String password) {
        super(idCard, name.toCharArray(), age, "Veterinarian", userName, password);
    }

    public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getIdCard() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getVeterinarianId() {
		return veterinarianId;
	}

	public void setVeterinarianId(String veterinarianId) {
		this.veterinarianId = veterinarianId;
	}

}
