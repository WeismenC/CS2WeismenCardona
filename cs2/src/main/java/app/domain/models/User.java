package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User extends Person {
    public User(String idCard, char[] name, Object age, String role, Object userName, String password) {
		// TODO Auto-generated constructor stub
	}

	public User(Object idCard, String name, int age, String role, Object userName, String password) {
		// TODO Auto-generated constructor stub
	}

	public User(long idCard, char[] charArray, int age, String role, String userName, String password) {
	}

	public void setDocument(long document) {
	}

	public void setIdCard(long document) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}

	public void setRole(String role2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String password2) {
		// TODO Auto-generated method stub
		
	}

	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserId(long l) {
		// TODO Auto-generated method stub
		
	}

	public void setPersonId(Object personId) {
		// TODO Auto-generated method stub
		
	}

	public void setCellPhone(int int1) {
		// TODO Auto-generated method stub
		
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addToCache(User userEntity) {
		// TODO Auto-generated method stub
		
	}

	public void setUserName(String userName) {
	}
}
