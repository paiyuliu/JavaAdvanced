package Test;

import Hw.MonteCarloSimulation;

public class MonteCarloSimulationTest {

	public static void main(String[] args) {
		MonteCarloSimulation monteCarloSimulation = new MonteCarloSimulation();
		
		for(int i = 0;i<10;i++){
			System.out.println(monteCarloSimulation.goThrough());
		}
		

	}

}
