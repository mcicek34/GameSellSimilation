package manager;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void sign(Gamer gamer) {
		
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println("--> Oyuncu eklendi : " + gamer.getFirstName());
			
		}else {
			
			System.out.println("Oyuncu eklenemedi.");
			
		}
		
	}

	@Override
	public void update(Gamer gamer) {

		if (this.gamerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println("--> Oyuncu güncellendi : " + gamer.getFirstName());
			
		}
		
	}

	@Override
	public void delete(Gamer gamer) {

		System.out.println("--> Oyuncu silindi : " + gamer.getFirstName());
		
	}


}
