package abstracts;

import entities.Gamer;

public interface GamerService {
	
	void sign(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
