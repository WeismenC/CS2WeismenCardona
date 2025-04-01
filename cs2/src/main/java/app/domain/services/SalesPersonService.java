package app.domain.services;

import org.springframework.stereotype.Service;
import app.adapters.salesPerson.entity.SalesPersonEntity;
import app.adapters.salesPerson.repository.SalesPersonRepository;
import app.domain.models.SalesPerson;

import java.util.Optional;

@Service
public class SalesPersonService {

	private final SalesPersonRepository salesPersonRepository;

	public SalesPersonService(SalesPersonRepository salesPersonRepository) {
		this.salesPersonRepository = salesPersonRepository;
	}

	public void saveSalesPerson(SalesPerson salesPerson) {
		SalesPersonEntity entity = new SalesPersonEntity();
		entity.setIdCard(salesPerson.getIdCard());
		entity.setName(salesPerson.getName());
		entity.setAge(salesPerson.getAge());

		salesPersonRepository.save(entity);
		System.out.println("Vendedor registrado con éxito.");
	}

	public SalesPerson findSalesPersonById(String idCard) {
		Optional<SalesPersonEntity> optionalSalesPerson = salesPersonRepository.findById(Long.valueOf(idCard));

		if (optionalSalesPerson.isEmpty()) {
			throw new IllegalArgumentException("No se encontró el vendedor con cédula: " + idCard);
		}

		SalesPersonEntity entity = optionalSalesPerson.get();
		return new SalesPerson(0, idCard, 0, idCard, idCard);
	}
}
