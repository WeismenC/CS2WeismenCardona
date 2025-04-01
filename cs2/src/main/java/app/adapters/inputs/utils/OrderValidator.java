package app.adapters.inputs.utils;

import org.springframework.stereotype.Component;

@Component
public class OrderValidator extends SimpleValidator {

    public long petIdValidator(String value) throws Exception {
        return longValidator(value, "ID de la mascota");
    }

    public long vetIdValidator(String value) throws Exception {
        return longValidator(value, "ID del veterinario");
    }

    public long medicationValidator(String value) throws Exception {
        return longValidator(value, "nombre del medicamento");
    }

    public long dosageValidator(String value) throws Exception {
        return longValidator(value, "dosis del medicamento");
    }
}