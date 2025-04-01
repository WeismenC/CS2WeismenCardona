package app.adapters.user.entity;

import app.adapters.person.entity.PersonEntity;
import app.domain.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	private static final Map<String, UserEntity> userCache = new ConcurrentHashMap<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne
	@JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
	private PersonEntity person;

	@Column(name = "userId", insertable = false, updatable = false)
	private Long UserId;

	@Column(name = "username", nullable = false, unique = true)
	private String userName;

	@Column(name = "password_user", nullable = false)
	private String password;

	@Column(name = "role_user", nullable = false)
	private String role;

	public static void addToCache(UserEntity user) {
		if (user != null && user.getUserName() != null) {
			userCache.put((String) user.getUserName(), user);
		}
	}

	public static UserEntity getFromCache(String userName) {
		return userCache.get(userName);
	}

	public static void removeFromCache(String userName) {
		userCache.remove(userName);
	}

	public Object getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getUserId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public PersonEntity getPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPerson(PersonEntity personAdapter) {
		// TODO Auto-generated method stub

	}

	public void setUserName(char[] userName2) {
		// TODO Auto-generated method stub

	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub

	}

	public void setRole(Object role2) {
		// TODO Auto-generated method stub

	}

	public static void addToCache(User userEntity) {
		// TODO Auto-generated method stub

	}
}
