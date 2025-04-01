package app.ports;

import app.domain.models.Person;
import app.domain.models.Pet;

public interface PersonPort {
    void savePerson(Person person);
    
    Person findByDocument(Long document);

    static boolean existsPerson(Long document) {
        return false;
    }

    Person findByDocument(String document);

    static boolean existsPerson(String document) {
        return false;
    }

    void savePet(Pet pet);
}
