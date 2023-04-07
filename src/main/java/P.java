
public class P {

	P()
	{
		System.out.println("From constructor of P");
	}
	
	{
		System.out.println("From Non static block");
	}
	public static void main(String[] args) {
	System.out.println("From main above object creation");
             P obj1 =new P();
             System.out.println("From main below object creation");
	}

}
