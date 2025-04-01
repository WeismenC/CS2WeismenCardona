package app.exceptions;

public class UnauthorizedException extends RuntimeException {
    
    public UnauthorizedException() {
        super("Acceso no autorizado. No tienes permisos para esta acción.");
    }
}
