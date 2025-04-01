package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapters.inputs.utils.Utils;
import app.domain.services.MedicalRecordService;

@Component
public class MedicalRecordInput {
    @Autowired
    private MedicalRecordService medicalRecordService;

    public void menu() {
        System.out.println("1. Crear historia clínica\n2. Consultar historia clínica\n3. Salir");
        String option = Utils.getReader().nextLine();

        switch (option) {
            case "1":
                createMedicalRecord();
                break;
            case "2":
                consultMedicalRecord();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void createMedicalRecord() {
        System.out.println("Ingrese ID de la mascota:");
        long petId = Long.parseLong(Utils.getReader().nextLine());
        System.out.println("Ingrese motivo de consulta:");
        String reason = Utils.getReader().nextLine();
        System.out.println("Ingrese síntomas:");
        String symptoms = Utils.getReader().nextLine();

        MedicalRecordService.createMedicalRecord(String.valueOf(petId), reason, symptoms);
        System.out.println("Historia clínica creada.");
    }

    private void consultMedicalRecord() {
        System.out.println("Ingrese ID de la mascota:");
        long petId = Long.parseLong(Utils.getReader().nextLine());

        System.out.println(medicalRecordService.getMedicalRecord(String.valueOf(petId)));
    }
}
