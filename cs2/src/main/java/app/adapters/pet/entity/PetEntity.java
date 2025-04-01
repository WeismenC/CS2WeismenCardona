package app.adapters.pet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "pets")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PetEntity {
	@Id
	@Column(name = "Pet_id")
	private long petId;

	@Column(name = "name_pet")
	private String name;
	
	@Column(name = "owner_id")
	private long ownerId;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "species")
	private String species;
	
	@Column(name = "breed")
	private String breed;
	
	@Column(name = "characteristics")
	private String characteristics;
	
	@Column(name = "weight_pet")
	private double weight;
	
	
	public long getPetId() {
		return 0;
	}
	public String getName() {
		return null;
	}
	public long getOwnerId() {
		return 0;
	}
	public int getAge() {
		return 0;
	}
	public String getSpecies() {
		return null;
	}
	public String getBreed() {
		return null;
	}
	public String getCharacteristics() {
		return null;
	}
	public double getWeight() {
		return 0;
	}
	public void setPetId(long id) {
		
	}
	public void setName(String name2) {
		
	}
	public void setAge(int age2) {
		
	}
	public void setSpecies(String species2) {
		
	}
	public void setBreed(String breed2) {
		
	}
	public void setCharacteristics(Object characteristics2) {
		
	}
	public void setWeight(double weight2) {
		
	}
	public void setOwnerId(long ownerId2) {
		// TODO Auto-generated method stub
		
	}
}
