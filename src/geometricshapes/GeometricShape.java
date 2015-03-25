package geometricshapes;

public abstract class GeometricShape
{
	/**
	 * @return the minimal X coordinate of the bounding box of this shape.
	 */
	public abstract double getXMin();
	
	/**
	 * @return the minimal Y coordinate of the bounding box of this shape.
	 */
	public abstract double getYMin();
	
	/**
	 * @return the maximal X coordinate of the bounding box of this shape.
	 */
	public abstract double getXMax();
	
	/**
	 * @return the maximal Y coordinate of the bounding box of this shape.
	 */
	public abstract double getYMax();
	
	/**
	 * @param s other shape.
	 * @return true if the bounding box of this shape contains the one of s, false if not.
	 */
	public boolean contains(GeometricShape s)
	{
		boolean contain = false;
		if(this.getXMin() <= s.getXMin() && this.getYMin() <= s.getYMin()
				&& this.getXMax() >= s.getXMax() && this.getYMax() >= s.getYMax())
			contain = true;
		return contain;
	}
}