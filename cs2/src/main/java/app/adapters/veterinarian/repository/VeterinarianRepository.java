package app.adapters.veterinarian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.veterinarian.entity.VeterinarianEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarianRepository extends JpaRepository <VeterinarianEntity, Long> {

}
