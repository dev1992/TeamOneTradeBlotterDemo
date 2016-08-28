package team1.blotterSB;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import team1.blotterJPA.Trade;
import team1.blotterJPA.Trader;

/**
 * Session Bean implementation class BlotterSessionBean
 */
@Stateful
@Remote(BlotterSessionBeanRemote.class)
@Local(BlotterSessionBeanLocal.class)
public class BlotterSessionBean implements BlotterSessionBeanRemote, BlotterSessionBeanLocal {

	@PersistenceContext(unitName = "TeamOneTradeBlotterJPA")
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public BlotterSessionBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Trade> getAllTrades() {
		TypedQuery<Trade> query = em.createQuery("SELECT t FROM Trade AS t", Trade.class);
		List<Trade> trades = query.getResultList();
		return trades;
	}

	@Override
	public List<Trader> getAllTraders() {
		TypedQuery<Trader> query = em.createQuery("SELECT t FROM Trader AS t", Trader.class);
		List<Trader> traders = query.getResultList();
		return traders;
	}

	@Override
	public boolean checkLogin(String username, String password) {
		Query query = em.createQuery("Select username from Trader t where username = :username");
		query.setParameter("username", username);
		List<String> results = query.getResultList();
		System.out.println(results);
		if (results.isEmpty()) {
			return false;
		} else {
			query = em.createQuery("Select password from Trader t where username = :username");
			query.setParameter("username", username);
			results = query.getResultList();
			System.out.println(results);
			String actualPassword = results.get(0);

			return actualPassword.equals(password);
		}
	}

	@Override
	public boolean registerTrader(String username, String password) {
		Query query = em.createQuery("Select username from Trader u where username = :userName");
		query.setParameter("username", username);
		if (query.getResultList().isEmpty()) {
			Trader trader = new Trader(username, password);
			em.persist(trader);
			em.flush();
			return true;
		} else
			return false;
	}

}