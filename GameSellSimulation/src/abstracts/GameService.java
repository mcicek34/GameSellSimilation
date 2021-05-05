package abstracts;

import entities.Game;

public interface GameService {

	void purchase(Game game);
	void giveBack(Game game);
}
