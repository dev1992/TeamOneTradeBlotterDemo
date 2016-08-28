package team1.blotterSB;

import java.util.List;

import javax.ejb.Local;

import team1.blotterJPA.Trade;
import team1.blotterJPA.Trader;

@Local
public interface BlotterSessionBeanLocal {
	public List<Trade> getAllTrades();
	public List<Trader> getAllTraders();
	public boolean checkLogin(String username , String password);
	public boolean registerTrader(String username, String password);
}
