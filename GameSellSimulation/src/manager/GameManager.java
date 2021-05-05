package manager;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void purchase(Game game) {
		System.out.println("Oyun satýn alýndý " + game.getName());
	}

	@Override
	public void giveBack(Game game) {
		System.out.println("Oyun iade edildi " + game.getName());
		
	}



}
