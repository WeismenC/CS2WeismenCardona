package app.domain.services;

import org.springframework.stereotype.Service;
import app.adapters.order.entity.OrderEntity;
import app.adapters.order.repository.OrderRepository;
import app.adapters.pet.repository.PetRepository;
import app.adapters.veterinarian.repository.VeterinarianRepository;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	private final PetRepository petRepository;
	private final VeterinarianRepository veterinarianRepository;

	public OrderService(OrderRepository orderRepository, PetRepository petRepository, VeterinarianRepository veterinarianRepository) {
		this.orderRepository = orderRepository;
		this.petRepository = petRepository;
		this.veterinarianRepository = veterinarianRepository;
	}

	public void createOrder(String petId, String vetId, String medication, String dosage) {
		var pet = petRepository.findById(Long.valueOf(petId));
		var vet = veterinarianRepository.findById(Long.valueOf(vetId));

		if (pet.isEmpty()) {
			throw new IllegalArgumentException("No se encontró la mascota con ID: " + petId);
		}
		if (vet.isEmpty()) {
			throw new IllegalArgumentException("No se encontró el veterinario con ID: " + vetId);
		}

		OrderEntity order = new OrderEntity();
		order.setPet(pet.get());
		order.setVeterinarian(vet.get());
		order.setMedication(medication);
		order.setDosage(dosage);
		order.setDate(LocalDateTime.now());
		order.setActive(true);

		orderRepository.save(order);
		System.out.println("Orden creada con éxito.");
	}

	public void cancelOrder(String orderId) {
		Optional<OrderEntity> orderOptional = orderRepository.findById(Long.valueOf(orderId));

		if (orderOptional.isEmpty()) {
			throw new IllegalArgumentException("No se encontró la orden con ID: " + orderId);
		}

		OrderEntity order = orderOptional.get();
		order.setActive(false);
		orderRepository.save(order);

		System.out.println("Orden cancelada con éxito.");
	}
}
