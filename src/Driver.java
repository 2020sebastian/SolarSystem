
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MilkyWayPlanet Earth = new MilkyWayPlanet("Earth", 1, 12756,6.7,800,47.89);
		MilkyWayPlanet Venus = new MilkyWayPlanet("Venus", 0.82, 12102,5.6,600,65.59);
		MilkyWayPlanet Mercury = new MilkyWayPlanet("Mercury", 0.06, 4878,4.5, 500, 45.23);
		MilkyWayPlanet Pluto = new MilkyWayPlanet("Pluto", 0.002, 2340, 7.6, 953, 48.56);
		MilkyWayPlanet Jupiter = new MilkyWayPlanet("Jupiter", 317.89, 2564, 5.5, 752,68.32);
		MilkyWayPlanet Saturn = new MilkyWayPlanet("Saturn", 95.18, 1234, 7.2, 354, 79.63);
		MilkyWayPlanet Uranus = new MilkyWayPlanet("Uranus", 14.53, 1532,9.1, 953, 32.56);
		MilkyWayPlanet Neptune = new MilkyWayPlanet("Neptune", 17.14, 2531,9.8, 452, 95.32);
		MilkyWayPlanet Mars = new MilkyWayPlanet("Mars", 0.11, 7456, 6.4,796,49.56);
	
		
		System.out.println("Earth's mass is smaller than Mercury's: "+Earth.isMassSmaller(Mercury));
		System.out.println("Earth's diameter is greater than Mercury's: "+Earth.isDiameterGreater(Mercury));
		System.out.println();
		
		Planet[] solarSystem = new Planet[9];
				solarSystem[0]= Earth;
				solarSystem[1]= Venus;
				solarSystem[2]= Mercury;
				solarSystem[3]= Pluto;
				solarSystem[4]= Jupiter;
				solarSystem[5]= Saturn;
				solarSystem[6]= Uranus;
				solarSystem[7]= Neptune;
				solarSystem[8]= Mars;
				
		for (int i=0;i<solarSystem.length;i++){
			System.out.println(solarSystem[i].toString());
		}
	
	
	
	}

}
