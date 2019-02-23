
public class Planet {

	String Name;
	double Soil = 0.0;
	double Rocks = 0.0;
	double Radious = 0.0;
	public Planet(String name,double soil, double rocks, double radious) {
		super();
		Soil = soil;
		Rocks = rocks;
		Radious = radious;
		Name = name;
		System.out.println("Creating Planet "+name);
	}
	
	public Planet(String name, double radious) {
		super();
		
		Radious = radious;
		Name = name;
		System.out.println("Creating Planet "+name);
	}
	
	public Planet(String name) {
		super();
		
		Name = name;
		System.out.println("Creating Planet "+name);
	}
	
	
	public String getName() {
		return Name;
	}


	public double getSoil() {
		return Soil;
	}



	public double getRocks() {
		return Rocks;
	}




	public double getRadious() {
		return Radious;
	}




	public void spinsOwnAxis() {
		
		System.out.println(Name+" is spinning on own axis....");
	}
	
	
	public void revolvingAround(Star star) {
		
		System.out.println(Name+" is revolving around "+star.getStarName());
	}
	
}
