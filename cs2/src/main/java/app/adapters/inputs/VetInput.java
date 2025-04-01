package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapters.inputs.utils.Utils;
import app.adapters.medicalRecord.AdpMedicalRecord;
import app.domain.services.VetService;
import app.ports.InputPort;

@Component
public class VetInput implements InputPort{
    @Autowired
    private VetService vetService;

    private final String MENU = "Ingrese la opción:" +
            "\n1. Registrar historia clínica" +
            "\n2. Crear orden médica" +
            "\n3. Anular orden médica" +
            "\n4. Salir";

    public void menu() throws Exception {
        while (true) {
            System.out.println(MENU);
            String option = Utils.getReader().nextLine();
            switch (option) {
                case "1":
                    registerMedicalHistory();
                    break;
                case "2":
                    createMedicalOrder();
                    break;
                case "3":
                    cancelMedicalOrder();
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void registerMedicalHistory() {
        System.out.println("Ingrese el ID de la mascota:");
        String petId = Utils.getReader().nextLine();

        System.out.println("Ingrese el motivo de la consulta:");
        String reason = Utils.getReader().nextLine();

        System.out.println("Ingrese los síntomas:");
        String symptoms = Utils.getReader().nextLine();

        System.out.println("Ingrese el diagnóstico:");
        String diagnosis = Utils.getReader().nextLine();

        System.out.println("Ingrese el procedimiento (si aplica, deje vacío si no):");
        String procedure = Utils.getReader().nextLine();

        System.out.println("Ingrese el medicamento recetado (si aplica, deje vacío si no):");
        String medication = Utils.getReader().nextLine();

        System.out.println("Ingrese la dosis del medicamento (si aplica, deje vacío si no):");
        String dosage = Utils.getReader().nextLine();

        AdpMedicalRecord record = new AdpMedicalRecord();
        vetService.registerMedicalRecord(record);

        System.out.println("Historia clínica registrada con éxito.");
    }

    private void createMedicalOrder() {
        System.out.println("Ingrese el ID de la mascota:");
        String petId = Utils.getReader().nextLine();

        System.out.println("Ingrese el ID del dueño:");
        String ownerId = Utils.getReader().nextLine();

        System.out.println("Ingrese el medicamento:");
        String medication = Utils.getReader().nextLine();

        System.out.println("Ingrese la dosis:");
        String dosage = Utils.getReader().nextLine();

        String orderId = vetService.generateUniqueOrderId();

        MedicalOrder order = new MedicalOrder(orderId, petId, ownerId, medication, dosage);
        vetService.createMedicalOrder(order);

        System.out.println("Orden médica creada con éxito. ID: " + orderId);
    }

    private void cancelMedicalOrder() throws Exception {
        System.out.println("Ingrese el ID de la orden a anular:");
        String orderId = Utils.getReader().nextLine();

        boolean success = vetService.cancelMedicalOrder(orderId);
        if (success) {
            System.out.println("Orden médica anulada con éxito.");
        } else {
            System.out.println("No se encontró una orden con ese ID o ya fue anulada.");
        }
    }
}