package app.adapters.person;

import app.adapters.person.entity.PersonEntity;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.ports.PersonPort;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Repository
public class AdpPerson implements PersonPort {

    private final Map<String, Person> personDatabase = new HashMap<>();

    public static Person toModel(PersonEntity entity) {
        Person model = new Person();
        model.setPersonId(entity.getPersonId()); 
        model.setDocument(entity.getDocument());
        model.setName(entity.getName());
        model.setAge(entity.getAge());
        model.setRole(entity.getRole());
        return model;
    }

    public static PersonEntity toEntity(Person model) {
        PersonEntity entity = new PersonEntity();
        entity.setPersonId(model.getPersonId()); 
        entity.setDocument(model.getDocument());
        entity.setName(model.getName());
        entity.setAge(model.getAge());
        entity.setRole(model.getRole());
        return entity;
    }

    @Override
    public void savePerson(Person person) {
        personDatabase.put(person.getDocument(), person);
    }

    @Override
    public Person findByDocument(Long document) {
        return null;
    }

    @Override
    public Person findByDocument(String document) {
        return personDatabase.get(document);
    }

    public boolean existsPerson(String document) {
        return personDatabase.containsKey(document);
    }

    @Override
    public void savePet(Pet pet) {
    }
}
