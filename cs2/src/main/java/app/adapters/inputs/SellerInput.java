package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapters.inputs.utils.Utils;
import app.domain.models.Sale;
import app.domain.models.Order;
import app.domain.services.SalesService;
import app.ports.InputPort;

@Component
public class SellerInput implements InputPort{
    @Autowired
    private SalesService salesService;

    private final String MENU = "Ingrese la opción:" +
            "\n1. Vender medicamento" +
            "\n2. Vender producto" +
            "\n3. Salir";

    public void menu() {
        while (true) {
            System.out.println(MENU);
            String option = Utils.getReader().nextLine();
            switch (option) {
                case "1":
                    sellMedication();
                    break;
                case "2":
                    sellProduct();
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void sellProduct() {
    }

    private void sellMedication() {
        System.out.println("Ingrese el ID de la orden médica:");
        String orderId = Utils.getReader().nextLine();
        
        if (!salesService.isValidOrder(orderId)) {
            System.out.println("Orden médica no válida o ya utilizada.");
            return;
        }

        System.out.println("Ingrese el ID de la mascota:");
        String petId = Utils.getReader().nextLine();

        System.out.println("Ingrese el ID del dueño:");
        String ownerId = Utils.getReader().nextLine();

        System.out.println("Ingrese el nombre del medicamento:");
        String medicationName = Utils.getReader().nextLine();

        System.out.println("Ingrese la cantidad:");
        int quantity = Integer.parseInt(Utils.getReader().nextLine());

        System.out.println("Ingrese el precio unitario:");
        double price = Double.parseDouble(Utils.getReader().nextLine());

        double totalPrice = quantity * price;

        Sale sale = new Sale(orderId, petId, ownerId, medicationName, quantity, totalPrice);
        app.domain.models.Sale saleInput = new app.domain.models.Sale(sale);

        System.out.println("Venta registrada con éxito.");
        printInvoice(sale);
    }

    private void printInvoice(Sale sale) {
        System.out.println("\n--- FACTURA ---");
        System.out.println("ID Mascota: " + sale.getPetId());
        System.out.println("ID Dueño: " + sale.getOwnerId());
        System.out.println("Producto: " + sale.getProductName());
        System.out.println("Cantidad: " + sale.getQuantity());
        System.out.println("Total: $" + sale.getTotalPrice());
        System.out.println("-----------------\n");
    }
    
    private app.domain.models.Sale convertToInputSale(app.domain.models.Sale sale) {
    return new app.domain.models.Sale(
        sale.getPetId(),
        sale.getOwnerId(),
        sale.getProductName(),
        sale.getDate(),
        sale.getQuantity(),
        sale.getTotalPrice()
    );
}
}