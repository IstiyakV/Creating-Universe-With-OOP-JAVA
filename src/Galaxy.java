import java.util.ArrayList;

public class Galaxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Star sun = new Star("SUN");
		Planet Earth = new Planet("Earth", 1.0, 2.0, 6371.00);
		
		Planet Marcury = new Planet("Marcury", 1.0, 2.0, 11.00);
		Planet Venus = new Planet("Venus", 1.0, 2.0, 11.00);
		Planet Mars = new Planet("Mars", 1.0, 2.0, 11.00);
		Planet Jupiter = new Planet("Jupiter", 1.0, 2.0, 11.00);
		Planet Saturn = new Planet("Saturn", 1.0, 2.0, 11.00);
		Planet Uranus = new Planet("Uranus", 1.0, 2.0, 11.00);
		Planet Neptune = new Planet("Neptune", 1.0, 2.0, 11.00);
		
		
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
