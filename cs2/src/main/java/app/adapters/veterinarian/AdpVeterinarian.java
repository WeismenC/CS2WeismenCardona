package app.adapters.veterinarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.domain.models.Veterinarian;
import app.domain.services.VeterinarianService;

@Component
public class AdpVeterinarian {
    @Autowired
    private VeterinarianService veterinarianService;

    public void registerVeterinarian(long idCard, String name, int age, String username, String password) {
        Veterinarian veterinarian = new Veterinarian(idCard, name, age, username, password);
        veterinarianService.registerVeterinarian(veterinarian);
        System.out.println("Veterinario registrado exitosamente.");
    }

    public Veterinarian getVeterinarianById(long idCard) {
        return veterinarianService.getVeterinarianById(idCard);
    }
}
