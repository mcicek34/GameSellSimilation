package manager;

import abstracts.SellService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SellManager implements SellService {

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Sayin " + gamer.getFirstName() + " Oyununuz " + game.getName() + " " + campaign.getName()
				+ " ile taraf�n�za sat��� ger�ekle�mi�tir.");
	}

	@Override
	public void giveback(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Sayin " + gamer.getFirstName() + " " + campaign.getName() + " ile alm�� oldugunuz "
				+ game.getName() + " in iadesi ba�ar�yla ger�ekle�mi�tir.");
	}

}
