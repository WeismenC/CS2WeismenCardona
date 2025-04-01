package app.adapters.inputs;

import app.domain.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapters.inputs.utils.PersonValidator;
import app.adapters.inputs.utils.UserValidator;
import app.adapters.inputs.utils.Utils;
import app.domain.services.AdminService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import app.ports.InputPort;

@Setter
@Getter
@NoArgsConstructor
@Component
public class AdminInput implements InputPort {
    @Autowired
    private PersonValidator personValidator;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private AdminService adminService; 

    private final String MENU = "Ingrese la opción:" +
            "\n1. Registrar vendedor" +
            "\n2. Registrar veterinario" +
            "\n3. Salir";

    public void menu() {
        System.out.println(MENU);
        String option = Utils.getReader().nextLine();
        switch (option) {
            case "1":
                registerPerson("vendedor");
                break;
            case "2":
                registerPerson("veterinario");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void registerPerson(String role) {
        try {
            System.out.println("Ingrese el nombre:");
            String name = String.valueOf(personValidator.nameValidator(Utils.getReader().nextLine()));
            System.out.println("Ingrese la cédula:");
            long document = personValidator.documentValidator(Utils.getReader().nextLine());
            System.out.println("Ingrese la edad:");
            int age = Integer.parseInt(Utils.getReader().nextLine());
            System.out.println("Ingrese el usuario:");
            String username = String.valueOf(userValidator.userNameValidator(Utils.getReader().nextLine()));
            System.out.println("Ingrese la contraseña:");
            String password = String.valueOf(userValidator.passwordValidator(Utils.getReader().nextLine()));

            User user = new User(document, name.toCharArray(), age, role, username, password);
            user.setIdCard(document);
            user.setName(name);
            user.setAge(age);
            user.setRole(role);
            user.setUserName(username);
            user.setPassword(password);

            adminService.registerPerson(user);

            System.out.println(role + " registrado con éxito.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
