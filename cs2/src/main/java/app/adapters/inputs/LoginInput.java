package app.adapters.inputs;

import java.util.HashMap;
import java.util.Map;
import app.ports.InputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapters.inputs.utils.UserValidator;
import app.adapters.inputs.utils.Utils;
import app.domain.services.LoginService;
import app.domain.models.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class LoginInput implements InputPort {
	private Map<String, InputPort> inputs;
	@Setter
    @Getter
    @Autowired
	private AdminInput adminInput;
	@Setter
    @Getter
    @Autowired
	private SellerInput sellerInput;
	@Setter
    @Getter
    @Autowired
	private VetInput vetInput;
	@Autowired
	private UserValidator userValidator;
	@Autowired
	private LoginService loginService;
	private final String MENU = "Ingrese la opcion que desea:\n 1. iniciar sesion \n 2. salir";

	public LoginInput(AdminInput adminInput, SellerInput sellerInput, VetInput vetInput) {
		super();
		this.setAdminInput(adminInput);
		this.setSellerInput(sellerInput);
		this.setVetInput(vetInput);
		this.inputs = new HashMap<String, InputPort>();
		inputs.put("vet", vetInput);
		inputs.put("seller", sellerInput);
		inputs.put("admin", adminInput);

	}

	private void setVetInput(VetInput vetInput2) {
		// TODO Auto-generated method stub
		
	}

	private void setSellerInput(SellerInput sellerInput2) {
		// TODO Auto-generated method stub
		
	}

	private void setAdminInput(AdminInput adminInput2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menu() throws Exception {
		boolean sesion = true;
        while (sesion) {
            sesion = options();
        }
    }

	private boolean options() throws Exception {
		try {
			System.out.println(MENU);
			String option = Utils.getReader().nextLine();
			switch (option) {
			case "1": {
				this.login();
				return true;
			}
			case "2": {
				System.out.println("Hasta una proxima ocación");
				return false;
			}
			default: {
				System.out.println("ha elegido una opción invalida");
				return true;
			}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
	}

	private void login() {
		try {
			System.out.println("ingrese su usuario");
			String userName = String.valueOf(userValidator.userNameValidator(Utils.getReader().nextLine()));
			System.out.println("ingrese su contraseña");
			String password = String.valueOf(userValidator.passwordValidator(Utils.getReader().nextLine()));
			int age = 0;
			long idCard = 0;
			String role = null;
			String name = null;
			User user = new User(idCard, name.toCharArray(), age, role, userName, password);
			user.setUserName(userName);
			user.setPassword(password);
			user = loginService.login(user);
			InputPort inputPort = inputs.get(user.getRole());
			inputPort.menu();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}