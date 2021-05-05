package manager;

import abstracts.CampainService;
import entities.Campaign;

public class CampaignManager implements CampainService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi " + campaign.getName());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanyalar Güncellendi " + campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi " + campaign.getName());

	}

}
