package app.adapters.inputs.utils;

public class SimpleValidator {

    protected long longValidator() throws Exception {
        throw new Exception("Se requiere un valor para validar.");
    }

    protected long longValidator(String value, String field) throws Exception {
        if (value == null || value.trim().isEmpty()) {
            throw new Exception("El campo " + field + " no puede estar vacío.");
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            throw new Exception("El campo " + field + " debe ser un número válido.");
        }
    }
}
