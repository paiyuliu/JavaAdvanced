package Hw;
import java.util.ArrayList;
import java.util.List;

public class MonteCarloSimulation {
	public List<String> dice ;
	
	
	public MonteCarloSimulation() {
		dice = new ArrayList<String>();
		dice.add("1");
		dice.add("2");
		dice.add("3");
		dice.add("4");
		dice.add("5");
		dice.add("6");
		dice.add("5");
		dice.add("5");
		dice.add("5");
		dice.add("5");
	}

	public String goThrough(){
		Float cde = (float) Math.random()*dice.size();
		Integer abc = cde.intValue();
		return dice.get(abc);
		
	}
	
	
	

}
