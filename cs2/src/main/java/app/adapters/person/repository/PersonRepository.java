package app.adapters.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.person.entity.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <PersonEntity, Long> {

}
