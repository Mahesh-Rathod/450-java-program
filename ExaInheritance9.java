class vehical 
{
	static int maxSpeed=200;
	static String car1="BMW";
	public static void drive()
	{
		System.out.println("Draving vehical:"+car1);
	}
	public  void race()
	{
		System.out.println("Draving at speed:"+maxSpeed);
	}
}
 class car extends vehical
{
     static int maxspeed=100;
	 static String car1="Audi";
	
	public static void drive()
	{
		System.out.println("Draving vehical:"+car1);
	}
	public  void race()
	{
		System.out.println("Draving at speed:"+maxspeed);
	}
}
class ExaInheritance9
{
	public static void main(String args[])
	{
		vehical b=new car();
		b.drive();
		b.race();
		System.out.println(b.maxSpeed);
	}
	
}
