
public class Moon  extends Satellite{

	
	
	public Moon(double radious) {
		super(radious);
		System.out.println("Creating Moon which radious is "+radious);
		// TODO Auto-generated constructor stub
		this.lightUpEarth();
	}
	
	public void lightUpEarth() {
		System.out.println("Moon Will Light up earth at night....");
	}

}
