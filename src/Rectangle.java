/** 
Rectangle class, phase 1
Under construction!
*/


public class Rectangle
{
private double length; // member
private double width; //member 
 /**
  * The setLength method stores a value in the lenght 
  * field.
  * @param len the value to store in lenth
  */

public void setLength(double len) 
{
	length = len;
}

/**
 * The setWidth method allows the rectangle 
 * object to have its width set
 * @paran w the value to store in width
 */
public void setWidth (double w) 
{
	width = w;
}

/** 
 * The getLength method returns a rectangle objects
 * length
 * @return The value in the length field.
 */

public double getLength() 
{
	return length;// public method that takes the set
					// length, that assigned it to a private member, which this
					//method fetches  and returns the length, now public.
}
/**
 * getWidth method gets the publically set width bt the setter method
 * 
 * @return value in the width field
 */
public double getWidth()
{
	return width;
}

public double getArea() 
{
	return length*width;
}

}



