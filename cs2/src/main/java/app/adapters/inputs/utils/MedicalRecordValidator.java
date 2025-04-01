package app.adapters.inputs.utils;

import org.springframework.stereotype.Component;

@Component
public class MedicalRecordValidator extends SimpleValidator {

    public long reasonValidator(String value) throws Exception {
        return longValidator(value, "motivo de consulta");
    }

    public long symptomsValidator(String value) throws Exception {
        return longValidator(value, "síntomas");
    }

    public long diagnosisValidator(String value) throws Exception {
        return longValidator(value, "diagnóstico");
    }
}
