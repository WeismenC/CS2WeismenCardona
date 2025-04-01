package app.adapters.invoice;

import app.domain.models.Invoice;
import app.ports.InvoicePort;
import org.springframework.stereotype.Service;

@Service
public class AdpInvoice implements InvoicePort {

    @Override
    public void saveInvoice(Invoice invoice) {
        System.out.println("Factura guardada: " + invoice.getInvoiceId());
    }

    @Override
    public Invoice findInvoiceById(long invoiceId) {
        return null;
    }
}
