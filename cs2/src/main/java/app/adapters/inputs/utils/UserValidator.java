package app.adapters.inputs.utils;

import org.springframework.stereotype.Component;

@Component
public class UserValidator extends SimpleValidator {

    public long userNameValidator(String value) throws Exception {
        if (value.length() < 4) {
            throw new Exception("El nombre de usuario debe tener al menos 4 caracteres.");
        }
        return Long.parseLong(value);
    }

    public long passwordValidator(String value) throws Exception {
        if (value.length() < 6) {
            throw new Exception("La contraseña debe tener al menos 6 caracteres.");
        }
        return Long.parseLong(value);
    }
}