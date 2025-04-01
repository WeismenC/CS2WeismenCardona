package app.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {
    private long petId;
    @Getter
    private String name;
    @Getter
    private long ownerId;
    @Getter
    private int age;
    @Getter
    private long characteristics;
    @Getter
    private String species;
    @Getter
    private String breed;
    @Getter
    private double weight;

	public Pet(long petId, String name, long ownerId, long characteristics, int age, String species, String breed, double weight) {
		this.petId = petId;
		this.name = name;
		this.ownerId = ownerId;
		this.characteristics = characteristics;
		this.age = age;
		this.species = species;
		this.breed = breed;
		this.weight = weight;
	}


	public long getId() {
        return petId; 
    }

    public Object getCharacteristics() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCharacteristics(String characteristics) {
	}


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	public long getOwnerId() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getSpecies() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getBreed() {
		// TODO Auto-generated method stub
		return null;
	}


	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
