package interfacePractice;

public class HowardCounty implements SchoolSystem,ReccreationalPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolSystem a=new HowardCounty(); // This will create object for interface method
		a.elementary();
		a.middle();
		a.high();
		ReccreationalPark b= new HowardCounty();
		b.centanialPark();
		b.medowbridgePark();
		HowardCounty c= new HowardCounty();// This will create object for class method
		c.library();
		
		/*HowardCounty b= new HowardCounty();// this can be used to access all methods both from interface and Class
		b.library();
		b.elementary();
		b.middle();
		b.high();
		b.centanialPark();
		b.medowbridgePark();*/
		
		
	}
	 public void library() {
		 System.out.println("This is Miller Branch");
	 }
	

	@Override
	public void elementary() {
		// TODO Auto-generated method stub
		System.out.println("This is Veterans Elementary School");
		
	}

	@Override
	public void middle() {
		// TODO Auto-generated method stub
		System.out.println("This is Ellicott Mills Middle School");
	}

	@Override
	public void high() {
		// TODO Auto-generated method stub
		System.out.println("This is Centanial High School");
		
	}
	@Override
	public void centanialPark() {
		// TODO Auto-generated method stub
		System.out.println("This is Centanial Park");
		
	}
	@Override
	public void medowbridgePark() {
		// TODO Auto-generated method stub
		
		System.out.println("This is Medowbridge Park");
	}
	


}
