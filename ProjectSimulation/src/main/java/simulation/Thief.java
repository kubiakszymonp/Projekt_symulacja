package simulation;

public class Thief extends Enemies {

	public Thief(IMap map, int mapSize, int sightRange, int movementSpeed, int visibilityRange) {
		super(map, mapSize, sightRange, movementSpeed, visibilityRange);
	}
	public Thief(IMap map, int mapSize) { //dodatkowy konstruktor, ktory sam przypisze domyslne wartosci do sightRange, movementSpeed i visibilityRange
		this(map, mapSize, 2, 2, 2);
	}

	@Override
	public void attack(IObjectsOnBoard object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeMove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void makeTurn() {
		// TODO Auto-generated method stub
		
	}

	
}
