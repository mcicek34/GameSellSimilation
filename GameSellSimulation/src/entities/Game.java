package entities;

public class Game {

	String name;
	String kind;
	int price;

	public Game(String name, String kind, int price) {
	
		this.name = name;
		this.kind = kind;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	

}
