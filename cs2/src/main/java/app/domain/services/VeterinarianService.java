package app.domain.services;

import org.springframework.stereotype.Service;
import app.adapters.veterinarian.entity.VeterinarianEntity;
import app.adapters.veterinarian.repository.VeterinarianRepository;
import app.domain.models.Veterinarian;

import java.util.Optional;

@Service
public class VeterinarianService {

	private final VeterinarianRepository veterinarianRepository;

	public VeterinarianService(VeterinarianRepository veterinarianRepository) {
		this.veterinarianRepository = veterinarianRepository;
	}

	public void registerVeterinarian(Veterinarian veterinarian) {
		VeterinarianEntity entity = new VeterinarianEntity();
		entity.setIdCard(veterinarian.getIdCard());
		entity.setName(veterinarian.getName());
		entity.setAge(veterinarian.getAge());

		veterinarianRepository.save(entity);
		System.out.println("Veterinario registrado con éxito.");
	}

	public Veterinarian getVeterinarianById(long idCard) {
		Optional<VeterinarianEntity> optionalVeterinarian = veterinarianRepository.findById(idCard);

		if (optionalVeterinarian.isEmpty()) {
			throw new IllegalArgumentException("No se encontró el veterinario con cédula: " + idCard);
		}

		VeterinarianEntity entity = optionalVeterinarian.get();
		return new Veterinarian((long) entity.getIdCard(), (String) entity.getName(), (Integer) entity.getAge(), null, null);
	}
}
