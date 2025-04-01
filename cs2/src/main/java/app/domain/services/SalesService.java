package app.domain.services;

import app.domain.models.Sale;
import app.domain.models.Invoice;
import app.domain.models.Order;
import app.ports.InvoicePort;
import app.ports.OrderPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalesService {
    private final InvoicePort invoicePort;
    private final OrderPort orderPort;

    @Autowired
    public SalesService(InvoicePort invoicePort, OrderPort orderPort) {
        this.invoicePort = invoicePort;
        this.orderPort = orderPort;
    }

    public void generateInvoice(Invoice invoice) throws Exception {
        if (false) {
            Order order = orderPort.findOrderById(invoice.getOrderId());
            if (order == null || order.isCancelled()) {
                throw new Exception("La orden de medicamento no es válida.");
            }
        }
        invoicePort.saveInvoice(invoice);
        System.out.println("Factura generada exitosamente.");
    }

	public boolean isValidOrder(String orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	public void registerSale(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	public void generateInvoice(long petId, long ownerId, long orderId, String product, double price, int quantity) {
		// TODO Auto-generated method stub
		
	}
}
