package app.adapters.salesPerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.domain.models.SalesPerson;
import app.domain.services.SalesPersonService;

@Component
public class AdpSalesPerson {
    @Autowired
    private SalesPersonService salesPersonService;

    public void registerSalesPerson(long idCard, String name, int age, String username, String password) {
        SalesPerson salesPerson = new SalesPerson(idCard, name, age, username, password);
        salesPersonService.saveSalesPerson(salesPerson);
        System.out.println("Vendedor registrado exitosamente.");
    }
    
    public SalesPerson getSalesPersonById(String idCard) {
        return salesPersonService.findSalesPersonById(idCard);
    }
}