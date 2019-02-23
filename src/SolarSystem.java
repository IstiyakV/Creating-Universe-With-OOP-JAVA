import java.util.ArrayList;

public class SolarSystem {
	
	private String Name;
	private Star star;
	
	private ArrayList<Planet> Planets;
	
	private ArrayList<Satellite> satellites;


	public SolarSystem(String name, Star star, ArrayList<Planet> planets, ArrayList<Satellite> satellites) {
		super();
		Name = name;
		this.star = star;
		Planets = planets;
		this.satellites = satellites;
		System.out.println("Creating Solar System with Planets, Satellites and Star...");
	}

	
	public void run() {
		
		star.EmitsEnergy();
		
		for(Planet planet:Planets) {
			planet.spinsOwnAxis();
			planet.revolvingAround(star);
		}
		
		
	
		
	}


	public ArrayList<Satellite> getSatellites() {
		return satellites;
	}



	public String getName() {
		return Name;
	}

	

	public Star getStar() {
		return star;
	}

	
	public ArrayList<Planet> getPlanets() {
		return Planets;
	}

	
	

}
