package app.adapters.pet;

import app.adapters.pet.entity.PetEntity;
import app.domain.models.Pet;

public class AdpPet {
    public static Pet toModel(PetEntity entity) {
        return new Pet(
                entity.getPetId(),
                entity.getName(),
                entity.getOwnerId(),
                entity.getAge(),
                0, entity.getSpecies(),
                entity.getBreed(),
                entity.getWeight()
        );
    }

    public static PetEntity toEntity(Pet model) {
        PetEntity entity = new PetEntity();
        entity.setPetId(model.getId());
        entity.setName(model.getName());
        entity.setOwnerId(model.getOwnerId());
        entity.setAge(model.getAge());
        entity.setSpecies(model.getSpecies());
        entity.setBreed(model.getBreed());
        entity.setCharacteristics(model.getCharacteristics());
        entity.setWeight(model.getWeight());

        return entity;
    }
}

