import java.util.ArrayList;

public class Galaxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Star sun = new Star("SUN");
		Planet Earth = new Planet("Earth",6371.00);
		
		Planet Marcury = new Planet("Marcury");
		Planet Venus = new Planet("Venus");
		Planet Mars = new Planet("Mars");
		Planet Jupiter = new Planet("Jupiter");
		Planet Saturn = new Planet("Saturn");
		Planet Uranus = new Planet("Uranus");
		Planet Neptune = new Planet("Neptune");
		
		
		Moon moon = new Moon(1737.00);
		
		
		ArrayList<Planet> Planets = new ArrayList<>();
		
		Planets.add(Earth);
		Planets.add(Marcury);
		Planets.add(Venus);
		Planets.add(Mars);
		Planets.add(Jupiter);
		Planets.add(Saturn);
		Planets.add(Uranus);
		Planets.add(Neptune);
		
		
		ArrayList<Satellite> Satellites = new ArrayList<>();
		
		Satellites.add(moon);
		
		
		SolarSystem ss = new SolarSystem("The Solar System", sun, Planets, Satellites);
		
		ss.run();
		
		
	}

}
