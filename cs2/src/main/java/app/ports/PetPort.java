package app.ports;

import app.domain.models.Pet;

public interface PetPort {
    public void savePet(Pet pet);
    
    public Pet findById(long petId);
    
    public boolean existsPet(long petId);
}
