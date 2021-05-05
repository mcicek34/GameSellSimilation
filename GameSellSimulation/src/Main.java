import java.util.Date;

import adapters.MernisServisAdapter;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import manager.CampaignManager;
import manager.GamerManager;
import manager.SellManager;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer(1, "Mustafa", "ÇÝÇEK", new Date(1997, 04, 04), "37714537782");
		Gamer gamer2 = new Gamer(2, "Hüseyin", "ÇÝÇEK", new Date(1996, 05, 06), "37784561231");
		
		Game game1 = new Game("PUBG", "SAVAS", 300);
		Game game2 = new Game("FIFA", "SPOR", 700);

		Campaign campaign1 = new Campaign(1, "Oyun Sezonu", new Date(2021, 04, 04));
		Campaign campaign2 = new Campaign(1, "Oyun Sezonu 2 ", new Date(2021, 05, 04));

		GamerManager gamerManager = new GamerManager(new MernisServisAdapter());
		gamerManager.sign(gamer1);
		gamerManager.delete(gamer2);
		gamerManager.update(gamer1);

		System.out.println("------------------------------------");

		System.out.println("------------------------------------");

		// -------------------------------------

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);

		System.out.println("------------------------------------");

		// -------------------------------------

		SellManager saleManager = new SellManager();
		saleManager.sell(gamer1, game1, campaign1);
		saleManager.sell(gamer2, game2, campaign2);

	}

}
