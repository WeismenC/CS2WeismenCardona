package app.adapters.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.person.entity.PersonEntity;
import app.adapters.user.entity.UserEntity;
import app.adapters.user.repository.UserRepository;
import app.domain.models.Person;
import app.domain.models.User;
import app.ports.UserPort;

import java.util.Optional;

@Service
public class AdpUser implements UserPort {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public boolean existsByUserName(String userName) {
        return UserRepository.existsByUserName(userName);
    }

    @Override
    public void saveUser(User user) {
        UserEntity userEntity = userEntityAdapter(user);
        UserRepository.save(userEntity);
        UserEntity.addToCache(userEntity);
        user.setUserId(userEntity.getUserId());
    }

    @Override
    public Optional<User> findByPerson(Person person) {
        PersonEntity personEntity = personAdapter(person);
        return UserRepository.findByPerson(personEntity)
                .map(this::userAdapter);
    }



    @Override
    public User findByUserName(User user) {
        return null;
    }

    @Override
    public boolean existsByUsername(String username) {
        return false;
    }


    private User userAdapter(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }

        User user = new User(
            userEntity.getPerson().getIdCard(),
            userEntity.getPerson().getName(),
            userEntity.getPerson().getAge(),
            userEntity.getRole(),
            userEntity.getUserName(),
            userEntity.getPassword()
        );

        user.setUserId(userEntity.getUserId());
        return user;
    }

    private UserEntity userEntityAdapter(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPerson(personAdapter(user));
        userEntity.setUserName(user.getUserName().toCharArray());
        userEntity.setPassword(user.getPassword());
        userEntity.setRole(user.getRole());
        return userEntity;
    }

    private PersonEntity personAdapter(Person person) {
        if (person == null) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();
        personEntity.setPersonId(person.getPersonId());
        personEntity.setDocument(person.getDocument());
        personEntity.setName(person.getName());
        personEntity.setCellPhone(String.valueOf(person.getCellPhone()));
        return personEntity;
    }

	@Override
	public Optional<User> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
