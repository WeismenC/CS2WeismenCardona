package app.adapters.medicalRecord.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.medicalRecord.entity.MedicalRecordEntity;
import app.domain.models.MedicalRecord;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecordEntity, Long> {
    Optional<MedicalRecordEntity> findByPetId(long l);
}

