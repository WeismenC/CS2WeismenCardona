package app.adapters.salesPerson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.salesPerson.entity.SalesPersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesPersonRepository extends JpaRepository <SalesPersonEntity, Long> {

}
