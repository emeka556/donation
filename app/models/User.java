package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
//import javax.persistence.*;
import javax.persistence.Entity;
//import javax.persistence.EntityManager;
//import javax.persistence.Table;

import play.db.jpa.Model;



//@Table(name = "`User`")
//@javax.persistence.Entity

//@PersistenceContext



@Entity

public class User extends Model {
	
	public boolean usCitizen;
	public String firstName;
	public String lastName;
	 

	 @OneToMany(mappedBy = "from" , cascade = CascadeType.ALL)
	List<Donation> donations = new ArrayList<Donation>();
	public String email;
	public String password;

	public User(boolean usCitizen, String firstName, String lastName, String email, String password) {
		this.usCitizen = usCitizen;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;

	}

	public static User findByEmail(String email) {
		return find("email", email).first();

	}

	public boolean checkPassword(String password) {
		return this.password.equals(password);

	}

}
