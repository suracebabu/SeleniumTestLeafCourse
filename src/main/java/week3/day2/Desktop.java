package week3.day2;

public class Desktop implements Software,HardWare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desObj1=new Desktop();
		
		desObj1.hardwareResources();
		desObj1.softwareResources();
		desObj1.desktopModel();

	}

	public void desktopModel() {
		System.out.println("Desktop model - lenova Yoga");

	}
	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		
		System.out.println("Hardware resources are implemented");
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
System.out.println("Software resources are implemented");
	}

}
