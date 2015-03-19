package geometricshapes;

public class Triangle
{
	private double xV;
	private double yV;
	private double l;
	
	/**
	 * Constructor. If side is equal or less than 0, throws an exception
	 * @param xV x point of the triangle's summit
	 * @param yV y point of the triangle's summit
	 * @param l side of the triangle
	 */
	public Triangle(double xV, double yV, double l)
	{
		this.xV = xV;
		this.yV = yV;
		if(l <= 0)
			throw new IllegalArgumentException("The side must be bigger than 0.");
		this.l = l;
	}

	/**
	 * @return x point of the triangle's summit
	 */
	public double getXV()
	{
		return xV;
	}
	
	/**
	 * @return x point of the triangle's summit
	 */
	public double getYV()
	{
		return yV;
	}
	
	/**
	 * @return side of the triangle
	 */
	public double getL()
	{
		if(l <= 0)
			throw new IllegalArgumentException("The side must be bigger than 0.");
		return l;
	}

	/**
	 * Set the x point of the triangle's summit
	 * @param xV x point of the triangle's summit
	 */
	public void setXV(double xV)
	{
		this.xV = xV;
	}
	
	/**
	 * Set the y point of the triangle's summit
	 * @param yV y point of the triangle's summit
	 */
	public void setYV(double yV)
	{
		this.yV = yV;
	}
	
	/**
	 * Set the side of the triangle. If side is equal or less than 0, throws an exception
	 * @param l side of the triangle
	 */
	public void setL(double l)
	{
		if(l <= 0)
			throw new IllegalArgumentException("The side must be bigger than 0.");
		this.l = l;
	}
	
	/**
	 * @return the minumum x point of the triangle's bounding box
	 */
	public double getXMin()
	{
		return this.xV;
	}
	
	/**
	 * @return the maximus x point of the triangle's bounding box
	 */
	public double getXMax()
	{
		return this.xV+this.l;
	}

	/**
	 * @return the minumum y point of the triangle's bounding box
	 */
	public double getYMin()
	{
		return this.yV;
	}
	
	/**
	 * @return the maximus y point of the triangle's bounding box
	 */
	public double getYMax()
	{
		return this.yV+l*Math.sqrt(3)/2;
	}
	
	/**
	 * Checks if this triangle contains another triangle
	 * @param t other triangle
	 * @return true if this triangle contains the other triangle, otherwise returns false
	 */
	public boolean contains(Triangle t)
	{
		boolean contain = false;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin())
			if(this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax())
				contain = true;
		return contain;	
	}
	
	/**
	 * Checks if this triangle contains a circle
	 * @param c circle
	 * @return true if this triangle contains the circle, otherwise returns false
	 */
	public boolean contains(Circle c)
	{
		boolean contain = false;
		if(this.getXMin() <= c.getXMin() && this.getYMin() <= c.getYMin())
			if(this.getXMax() >= c.getXMax() && this.getYMax() >= c.getYMax())
				contain = true;
		return contain;	
	}

	@Override public String toString()
	{
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
}