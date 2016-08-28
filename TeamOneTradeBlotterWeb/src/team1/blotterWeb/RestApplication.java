/**
 * 
 */
package team1.blotterWeb;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Grad70
 *
 */
@ApplicationPath("/rest")
public class RestApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RestApplication() {
		singletons.add(new TradeResource());
		singletons.add(new TraderResource());
	}

	public Set<Class<?>> getClasses() {
		return empty;
	}

	public Set<Object> getSingletons() {
		return singletons;
	}
}
