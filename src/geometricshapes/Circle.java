package geometricshapes;

public class Circle
{
	private double xC;
	private double yC;
	private double r;
	
	/**
	 * Constructor. If radius is equal or less than 0, throws an exception
	 * @param xC x point of the circle's centre
	 * @param yC y point of the circle's centre
	 * @param r radius of the circle
	 */
	public Circle(double xC, double yC, double r)
	{
		this.xC = xC;
		this.yC = yC;
		if(r <= 0)
			throw new IllegalArgumentException("The radius must be bigger than 0.");
		this.r = r;
	}
	
	/**
	 * @return x point of the circle's centre
	 */
	public double getXC()
	{
		return xC;
	}

	/**
	 * @return y point of the circle's centre
	 */
	public double getYC()
	{
		return yC;
	}

	/**
	 * @return radius of the circle
	 */
	public double getR()
	{
		return r;
	}
	
	/**
	 * Set the x point of the circle's centre
	 * @param xC x point of the circle's centre
	 */
	public void setXC(double xC) 
	{
		this.xC = xC;
	}
	
	/**
	 * Set the x point of the circle's centre
	 * @param yC y point of the circle's centre
	 */
	public void setYC(double yC)
	{
		this.yC = yC;
	}

	/**
	 * Set the radius of the circle. If radius is equal or less than 0, throws an exception
	 * @param radius of the cirlce
	 */
	public void setR(double r)
	{
		if(r <= 0)
			throw new IllegalArgumentException("The radius must be bigger than 0.");
			this.r = r;
	}

	/**
	 * @return the minumum x point of the circle's bounding box
	 */
	public double getXMin()
	{
		return this.xC-this.r;
	}
	
	/**
	 * @return the maximum x point of the circle's bounding box
	 */
	public double getXMax()
	{
		return this.xC+this.r;
	}

	/**
	 * @return the minumum y point of the circle's bounding box
	 */
	public double getYMin()
	{
		return this.yC-this.r;
	}
	
	/**
	 * @return the maximum y point of the circle's bounding box
	 */
	public double getYMax()
	{
		return this.yC+this.r;
	}
	
	/**
	 * Checks if this circle contains another circle
	 * @param c other circle
	 * @return true if this circle contains the other circle, otherwise returns false
	 */
	public boolean contains(Circle c)
	{
		boolean contain = false;
		if(this.getXMin() <= c.getXMin() && this.getYMin() <= c.getYMin())
			if(this.getXMax() >= c.getXMax() && this.getYMax() >= c.getYMax())
				contain = true;
		return contain;	
	}
	
	/**
	 * Checks if this circle contains a triangle
	 * @param t triangle
	 * @return true if this circle contains the triangle, otherwise returns false
	 */
	public boolean contains(Triangle t)
	{
		boolean contain = false;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin())
			if(this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax())
				contain = true;
		return contain;	
	}
	
	@Override public String toString()
	{
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}
}