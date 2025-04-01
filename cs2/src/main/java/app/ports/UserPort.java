package app.ports;

import app.domain.models.Person;
import app.domain.models.User;
import java.util.Optional;

public interface UserPort {
    Optional<User> findByUserName(String userName);
    
    boolean existsByUserName(String userName);
    
    void saveUser(User user);
    
    Optional<User> findByPerson(Person person);
    
    User findByUserName(User user);

	boolean existsByUsername(String username);
}
