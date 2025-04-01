package app.adapters.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.pet.entity.PetEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository <PetEntity, Long> {

}
