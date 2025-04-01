package app.domain.services;

import app.domain.models.User;
import app.domain.models.Veterinarian;
import app.domain.models.Pet;
import app.domain.models.SalesPerson;
import app.ports.PersonPort;
import app.ports.UserPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Setter
@Getter
@NoArgsConstructor
@Service
public class AdminService {

    @Autowired
    private PersonPort personPort;

    @Autowired
    private UserPort userPort;

    public AdminService(PersonPort personPort, UserPort userPort) {
        this.personPort = personPort;
        this.userPort = userPort;
    }

    public void registerVeterinarian(Veterinarian veterinarian) throws Exception {
        if (PersonPort.existsPerson(String.valueOf(veterinarian.getIdCard()))) {
            throw new Exception("Ya existe una persona con esa cédula.");
        }
        if (userPort.existsByUsername(veterinarian.getUserName())) {
            throw new Exception("Ya existe un usuario con ese nombre.");
        }
        personPort.savePerson(veterinarian);
        userPort.saveUser(veterinarian);
        System.out.println("Veterinario registrado exitosamente.");
    }

    public void registerSalesPerson(SalesPerson salesperson) throws Exception {
        if (PersonPort.existsPerson(salesperson.getIdCard())) {
            throw new Exception("Ya existe una persona con esa cédula.");
        }
        if (userPort.existsByUsername(salesperson.getUserName())) {
            throw new Exception("Ya existe un usuario con ese nombre.");
        }
        personPort.savePerson(salesperson);
        userPort.saveUser(salesperson);
        System.out.println("Vendedor registrado exitosamente.");
    }

    public void registerPerson(User user) {
        personPort.savePerson(user);
        System.out.println("Persona registrada exitosamente.");
    }

    public void registerUser(User user) {
        userPort.saveUser(user);
        System.out.println("Usuario registrado exitosamente.");
    }

    public void registerPet(Pet pet) {
        personPort.savePet(pet);
        System.out.println("Mascota registrada exitosamente.");
    }
}
