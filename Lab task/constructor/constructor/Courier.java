import java.lang.*;

public class Courier
{
	private double height;
	private double weight;

	public void setHeight(double h)
	{
		this.height = h;
	}

	public void setWeight(double w)
	{
		this.weight = w;
	}

	public double getHeight()
	{
		return height;
	}

	public double getWeight()
	{
		return weight;
	}

	public Courier()
	{
		System.out.println("This is empty constructor");
	}

	public Courier(double h, double w)
	{
		System.out.println("This is parameterized constructor");
		this.height = h;  // this for current class reference to main
		this.weight = w;
	}

	public void showDetails()
	{
		System.out.println("The height is "+height+"Inches");
		System.out.println("The weight is "+weight+"KGs");

	}

}