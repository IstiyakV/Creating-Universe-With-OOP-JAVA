
public class Star {
	
	private String StarName;

	

	public Star(String starName) {
		super();
		StarName = starName;
	}
	
	public void EmitsEnergy() {
		
		System.out.println(StarName+" is emiting energy....");
	}
	
	public String getStarName() {
		return StarName;
	}



}
