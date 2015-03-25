package geometricshapes;

public class Triangle extends GeometricShape
{
	private double xV;
	private double yV;
	private double l;
	
	public Triangle(double xV, double yV, double l)
	{
		super();
		this.xV = xV;
		this.yV = yV;
		if(l <= 0)
			throw new IllegalArgumentException("Side > 0");
		this.l = l;
	}

	public double getXV()
	{
		return xV;
	}

	public void setXV(double xV)
	{
		this.xV = xV;
	}

	public double getYV()
	{
		return yV;
	}

	public void setYV(double yV)
	{
		this.yV = yV;
	}

	public double getL()
	{
		return l;
	}

	public void setL(double l)
	{
		if(l <= 0)
			throw new IllegalArgumentException("Side > 0");
		this.l = l;
	}

	/*
	 * (non-Javadoc)
	 * @see geometricshapes.GeometricShape#getXMin()
	 */
	@Override public double getXMin()
	{
		return xV;
	}

	/*
	 * (non-Javadoc)
	 * @see geometricshapes.GeometricShape#getYMin()
	 */
	@Override public double getYMin()
	{
		return yV;
	}

	/*
	 * (non-Javadoc)
	 * @see geometricshapes.GeometricShape#getXMax()
	 */
	@Override public double getXMax()
	{
		return xV+this.l;
	}
	
	/*
	 * (non-Javadoc)
	 * @see geometricshapes.GeometricShape#getYMax()
	 */
	@Override public double getYMax()
	{
		return yV+this.l*Math.sqrt(3)/2;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString()
	{
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
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

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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