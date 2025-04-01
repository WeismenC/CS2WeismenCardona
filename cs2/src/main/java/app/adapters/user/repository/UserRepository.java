package app.adapters.user.repository;

import java.util.Optional;

import aj.org.objectweb.asm.commons.Remapper;
import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.user.entity.UserEntity;
import app.adapters.person.entity.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByPersonPersonId(Long personId);

	app.adapters.user.entity.UserEntity findByPersonId(PersonEntity personEntity);

	app.adapters.user.entity.UserEntity findByUserName(String userName);

	Optional<UserEntity> findByPerson_PersonId(Long personId);

    boolean existsByUserName(String userName);

    Optional<UserEntity> findByPerson(PersonEntity person);

}
