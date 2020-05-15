package simulation;

import java.util.LinkedList;
import java.util.List;

public class Starter {
	
public Starter(int numberOfIter, IMap map, IObjectsOnBoardCreator objectsCreator) {
		
		this.numberOfIter = numberOfIter;
		this.map = map;
		objectList = objectsCreator.create(map); //utorzenie listy obiektow
		
		for(IObjectsOnBoard o : objectList) { //musimy dodac wszystkie utworzone obiekty do kolekcji typu map i przypisac im randomowa pozycje
			
			while(!map.setPosition(o, RandomGenerator.giveRandomPosition( map.getSize() ) ) );
			
		}
			
	}


    private static List<IObjectsOnBoard> objectList;
    private static List<IObjectsOnBoard> addedObjectsList;
    IMap map;
    int numberOfIter;


	void runSimulation()
	{
		addedObjectsList= new LinkedList<IObjectsOnBoard>();
		for(int i =0; i<numberOfIter; i++) {
			map.printTableMap();               //wyswietlenie tablicy dwuwymiarowej
			System.out.println();
			System.out.println(i);
			objectList.addAll(addedObjectsList);					// przed kazda iteracja do listy dodawane s� nowo powstale obiekty
			for(IObjectsOnBoard iObjectsOnBoard : objectList) {
				iObjectsOnBoard.makeTurn();
			}
			
		}

	}
	
	public static List<IObjectsOnBoard> getObjectList(){   // funkcja ta jest potrzebna do dodawania obiektow do listy, po ktorej iterujemy
		return objectList;
	}
	
	public static List<IObjectsOnBoard> getAddedObjectsList(){   // funkcja ta jest potrzebna do dodawania obiektow do listy, po ktorej iterujemy
		return addedObjectsList;
	}
	
	
	
	public static void main(String[] args) {
		
		IMap map = new MapSimple(15);
		IObjectsOnBoardCreator objectsCreator = new ObjectsOnBoardCreator(10,0,10,0,0);
		Starter starter = new Starter(30, map, objectsCreator); 
		
		starter.runSimulation();
		
	}

}
