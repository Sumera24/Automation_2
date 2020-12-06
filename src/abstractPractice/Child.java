package abstractPractice;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Child obj=new Child();
  obj.color();
  obj.dateOfManufacture();
  obj.engine();
  
	}

	@Override
	public void engine() {
		System.out.println("BMW");
	}

}
