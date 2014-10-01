package domain;

import java.util.ArrayList;
import java.util.List;

public class Person {

	public Person()
	{
		this.addressses=new ArrayList<Address>();
	}
	
	private String firstName;
	private String surname;
	private String pesel;
	
	private User user;
	private List<Address> addressses;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Address> getAddressses() {
		return addressses;
	}
	public void setAddressses(List<Address> addressses) {
		this.addressses = addressses;
	}	
}