class Car
{
	private int year;
	private String make;
	private static double speed;
	
	Car()
	{
		this.year = 2010;
		this.make = "Porsche";
		this.speed = 25.0;
	}
	
	Car(int year,String make,double speed)
	{
		this.year = year;
		this.make = "make";
		this.speed = speed;
	}
	
	public int getYear()
	{
		return year;
	}
	public String getMake()
	{
		return make;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	void accelerate()
	{
		this.speed = 1+this.speed;
	}
}
class RaceTrac
{
	public static void main(String args[])
	{
		Car c = new Car();
		
		System.out.println("Year : "+c.getYear());
		System.out.println("Make : "+c.getMake());
		System.out.println("Speed : "+c.getSpeed());
		c.accelerate();
		System.out.println("");
		System.out.println("Speed : "+c.getSpeed());
	}
	
}