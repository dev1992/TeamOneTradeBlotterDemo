package team1.blotterSB;

import java.util.List;

import javax.ejb.Local;

import team1.blotterJPA.Trade;

@Local
public interface BlotterSessionBeanLocal {
	public List<Trade> getAllTrades();
}
