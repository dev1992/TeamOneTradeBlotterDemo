package team1.blotterWeb;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import team1.blotterJPA.Trader;
import team1.blotterSB.BlotterSessionBeanLocal;

@RequestScoped
@Path("/traders")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class TraderResource {

	private BlotterSessionBeanLocal myLocalBean;

	public TraderResource() {
		try {
			InitialContext context = new InitialContext();
			myLocalBean = (BlotterSessionBeanLocal) context.lookup(
					"java:app/TeamOneTradeBlotterEJB/BlotterSessionBean!team1.blotterSB.BlotterSessionBeanLocal");
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
	}

	@GET
	@Produces("application/json")
	public List<Trader> getTraders() {

		if (myLocalBean == null)
			return null;
		return myLocalBean.getAllTraders();
	}

	@GET
	@Path("/signin")
	@Produces("text/plain")
	public String checkLoginCredentials(@QueryParam("username") String username,
			@QueryParam("password") String password) {
		if (myLocalBean.checkLogin(username, password))
			return "true";
		else
			return "false";
	}

	@POST
	@Path("/signinsecure")
	@Consumes("application/x-www-form-urlencoded")
	public String checkLoginCredentialsSecure(@FormParam("username") String username,
			@FormParam("password") String password) {
		if (myLocalBean.checkLogin(username, password)) {
			return "true";
		} else {
			return "false";
		}
	}

	@GET
	@Path("/register")
	@Produces("text/plain")
	public String registerUser(@QueryParam("userName") String username, @QueryParam("password") String password) {
		if (myLocalBean.registerTrader(username, password))
			return "true";
		else
			return "false";
	}
}
