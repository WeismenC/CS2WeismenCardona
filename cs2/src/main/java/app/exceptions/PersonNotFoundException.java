package app.exceptions;

public class PersonNotFoundException extends RuntimeException {
    
    public PersonNotFoundException() {
        super("Persona no encontrada.");
    }

    public PersonNotFoundException(String message) {
        super(message);
    }
}
