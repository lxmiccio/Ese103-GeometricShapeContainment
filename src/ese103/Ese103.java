package ese103;

import geometricshapes.*;

public class Ese103
{
	public static void main(String[] args)
	{
		Circle c[] = new Circle[4];
		c[0] = new Circle(2, 3, 5);
		c[1] = new Circle(3, 2, 4);
		c[2] = new Circle(4, 4, 6);
		c[3] = new Circle(5, 5, 1);
		Triangle t[] = new Triangle[4];
		t[0] = new Triangle(2, 3, 5);
		t[1] = new Triangle(3, 2, 4);
		t[2] = new Triangle(4, 4, 6);
		t[3] = new Triangle(5, 5, 1);
		checkContainment(c[0], c[1]);
		checkContainment(c[0], c[2]);
		checkContainment(c[0], c[3]);
		checkContainment(c[1], c[0]);
		checkContainment(c[1], c[2]);
		checkContainment(c[1], c[3]);
		checkContainment(c[2], c[0]);
		checkContainment(c[2], c[1]);
		checkContainment(c[2], c[3]);
		checkContainment(c[3], c[0]);
		checkContainment(c[3], c[1]);
		checkContainment(c[3], c[2]);
		System.out.println();
		checkContainment(t[0], t[1]);
		checkContainment(t[0], t[2]);
		checkContainment(t[0], t[3]);
		checkContainment(t[1], t[0]);
		checkContainment(t[1], t[2]);
		checkContainment(t[1], t[3]);
		checkContainment(t[2], t[0]);
		checkContainment(t[2], t[1]);
		checkContainment(t[2], t[3]);
		checkContainment(t[3], t[0]);
		checkContainment(t[3], t[1]);
		checkContainment(t[3], t[2]);
		System.out.println();
		checkContainment(c[0], t[1]);
		checkContainment(c[0], t[2]);
		checkContainment(c[0], t[3]);
		checkContainment(c[1], t[0]);
		checkContainment(c[1], t[2]);
		checkContainment(c[1], t[3]);
		checkContainment(c[2], t[0]);
		checkContainment(c[2], t[1]);
		checkContainment(c[2], t[3]);
		checkContainment(c[3], t[0]);
		checkContainment(c[3], t[1]);
		checkContainment(c[3], t[2]);
		System.out.println();
		checkContainment(t[0], c[1]);
		checkContainment(t[0], c[2]);
		checkContainment(t[0], c[3]);
		checkContainment(t[1], c[0]);
		checkContainment(t[1], c[2]);
		checkContainment(t[1], c[3]);
		checkContainment(t[2], c[0]);
		checkContainment(t[2], c[1]);
		checkContainment(t[2], c[3]);
		checkContainment(t[3], c[0]);
		checkContainment(t[3], c[1]);
		checkContainment(t[3], c[2]);
	}
	
	private static void checkContainment(Circle c1, Circle c2)
	{
		if(c1.contains(c2))
			System.out.println(c1 + " contiene " + c2);
		else
			System.out.println(c1 + " non contiene " + c2);
	}
	
	private static void checkContainment(Triangle t1, Triangle t2)
	{
		if(t1.contains(t2))
			System.out.println(t1 + " contiene " + t2);
		else
			System.out.println(t1 + " non contiene " + t2);
	}
	
	private static void checkContainment(Circle c, Triangle t)
	{
		if(c.contains(t))
			System.out.println(c + " contiene " + t);
		else
			System.out.println(c + " non contiene " + t);
	}
	
	private static void checkContainment(Triangle t, Circle c)
	{
		if(c.contains(t))
			System.out.println(t + " contiene " + c);
		else
			System.out.println(t + " non contiene " + c);
	}
}