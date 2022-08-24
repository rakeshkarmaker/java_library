import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Courier c = new Courier();

		c.setHeight(3.7);
		c.setWeight(4.9);

		System.out.println("The height is: "+c.getHeight()+"inches");
		System.out.println("The weight is: "+c.getWeight()+"in KGs");

		Courier c1 = new Courier(4.67,8.90);
		c1.showDetails();

	}
}