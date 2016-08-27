package team1.blotterSB;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import team1.blotterJPA.Trade;

/**
 * Session Bean implementation class BlotterSessionBean
 */
@Stateless
@Remote(BlotterSessionBeanRemote.class)
@Local(BlotterSessionBeanLocal.class)
public class BlotterSessionBean implements BlotterSessionBeanRemote, BlotterSessionBeanLocal {
	
	@PersistenceContext(unitName="TeamOneTradeBlotterJPA")
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

}