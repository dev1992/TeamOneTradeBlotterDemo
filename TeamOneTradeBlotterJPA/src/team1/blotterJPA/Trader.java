package team1.blotterJPA;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trader
 *
 */
@Entity
@Table(name="TRADERS")
public class Trader implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private long traderID;
	private String username;
	private String password;
	
	public Trader() {
		super();
	}
	
	public Trader(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	/**
	 * @return the traderID
	 */
	public long getTraderID() {
		return traderID;
	}

	/**
	 * @param traderID the traderID to set
	 */
	public void setTraderID(long traderID) {
		this.traderID = traderID;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
   
}
