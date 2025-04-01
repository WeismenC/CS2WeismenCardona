package app.adapters.veterinarian.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Veterinarian")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VeterinarianEntity {
	@Id
	@Column(name = "veterinarian_id")
	private long veterinarianId;

    public void setIdCard(long idCard) {
    }

	public void setName(String name) {
	}

	public void setAge(int age) {
	}

	public Object getIdCard() {
		return null;
	}

	public Object getName() {
		return null;
	}

	public Object getAge() {
		return null;
	}
}
