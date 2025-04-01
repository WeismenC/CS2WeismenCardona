package app.ports;

import app.domain.models.Invoice;

public interface InvoicePort {
    public void saveInvoice(Invoice invoice);
    
    public Invoice findInvoiceById(long invoiceId);
}
