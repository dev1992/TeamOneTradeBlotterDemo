/**
 * 
 */
package team1.blotterWeb;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import team1.blotterJPA.Trade;
import team1.blotterSB.BlotterSessionBeanLocal;

/**
 * @author Grad70
 *
 */
@RequestScoped
@Path("/trades")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class TradeResource {
	private BlotterSessionBeanLocal myLocalBean;

	public TradeResource() {
		try {
			InitialContext context = new InitialContext();
			myLocalBean = (BlotterSessionBeanLocal) context.lookup("java:app/TeamOneTradeBlotterEJB/BlotterSessionBean!team1.blotterSB.BlotterSessionBeanLocal");
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
	}
	
	@GET
	@Produces("application/json")
	public List<Trade> getTrades() {

		if (myLocalBean == null)
			return null;
		return myLocalBean.getAllTrades();
	}
}