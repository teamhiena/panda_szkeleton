import java.util.ArrayList;
import java.util.Random;

public class Fotel extends Entity{
	private Tile enteredFrom=null;
	private long timeLeft=0; //vitathato
	

	public boolean stepIn(Orangutan o) {
		ArrayList<Object> par = new ArrayList<>(); par.add(o);
		Logger.enter(this, "stepIn", par);
		Logger.exit(this, "stepIn", false);
		return false;
	}	
	public boolean stepIn(Panda p) {
		
	}
	
	public boolean isEmpty() {
		return tile.getAnimal()==null;
	}
	
	public void decrTimeLeft() {
		timeLeft--;
	}
	
	public void resetTime() {
		timeLeft=/*vitathato*/;
	}
	
    public Panda getRandomSubbedPanda(){
    	//full nem emlekszem ez mire jo (G)
    	Random vel=new Random();
    	return tile.getSubbedPandas().get(vel.nextInt(tile.getSubbedPandas().size()-1));    	
    } 
}

