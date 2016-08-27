package team1.blotterSB;

import java.util.List;

import javax.ejb.Remote;

import team1.blotterJPA.Trade;

@Remote
public interface BlotterSessionBeanRemote {
	public List<Trade> getAllTrades();
}
