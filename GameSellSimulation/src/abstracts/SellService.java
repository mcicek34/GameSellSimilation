package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SellService {
	void sell(Gamer gamer, Game game, Campaign campaign);
	void giveback(Gamer gamer, Game game, Campaign campaign);

}
