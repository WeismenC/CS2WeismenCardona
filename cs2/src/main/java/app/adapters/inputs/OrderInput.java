package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapters.inputs.utils.Utils;
import app.domain.services.OrderService;

@Component
public class OrderInput {
    @Autowired
    private OrderService orderService;

    public void menu() {
        System.out.println("1. Crear orden médica\n2. Anular orden médica\n3. Salir");
        String option = Utils.getReader().nextLine();

        switch (option) {
            case "1":
                createOrder();
                break;
            case "2":
                cancelOrder();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void createOrder() {
        System.out.println("Ingrese ID de la mascota:");
        String petId = Utils.getReader().nextLine();
        System.out.println("Ingrese ID del veterinario:");
        String vetId = Utils.getReader().nextLine();
        System.out.println("Ingrese medicamento:");
        String medication = Utils.getReader().nextLine();
        System.out.println("Ingrese dosis:");
        String dosage = Utils.getReader().nextLine();

        orderService.createOrder(petId, vetId, medication, dosage);
        System.out.println("Orden médica creada.");
    }

    private void cancelOrder() {
        System.out.println("Ingrese ID de la orden:");
        long orderId = Long.parseLong(Utils.getReader().nextLine());

        orderService.cancelOrder(String.valueOf(orderId));
        System.out.println("Orden médica anulada.");
    }
}
