package app.domain.services;

import app.adapters.medicalRecord.entity.MedicalRecordEntity;
import app.adapters.medicalRecord.repository.MedicalRecordRepository;
import app.adapters.pet.repository.PetRepository;
import app.adapters.pet.entity.PetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class MedicalRecordService {
	private static MedicalRecordRepository medicalRecordRepository = null;
	private static PetRepository petRepository = null;

	@Autowired
	public MedicalRecordService(MedicalRecordRepository medicalRecordRepository, PetRepository petRepository) {
		this.medicalRecordRepository = medicalRecordRepository;
		this.petRepository = petRepository;
	}

	public static void createMedicalRecord(String petId, String reason, String symptoms) {
		Optional<PetEntity> petOptional = petRepository.findById(Long.parseLong(petId));
		if (petOptional.isPresent()) {
			MedicalRecordEntity record = new MedicalRecordEntity();
			record.setPet(petOptional.get());
			record.setReason(reason);
			record.setSymptoms(symptoms);
			record.setDate(LocalDateTime.now());
			medicalRecordRepository.save(record);
		} else {
			throw new IllegalArgumentException("La mascota con ID " + petId + " no existe.");
		}
	}

	public String getMedicalRecord(String petId) {
		Optional<MedicalRecordEntity> recordOptional = medicalRecordRepository.findByPetId(Long.parseLong(petId));
		return recordOptional.map(record -> "Fecha: " + record.getDate() + "\nMotivo: " + record.getReason() + "\nSíntomas: " + record.getSymptoms())
				.orElse("No se encontró un historial para la mascota con ID " + petId);
	}
}
