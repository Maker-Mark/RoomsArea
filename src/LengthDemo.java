
public class LengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle();
		System.out.println("Sending the value 10.0 " +
		"to the setLength method");
		
		box.setLength(67.0);
		System.out.println("Done!");
		box.setWidth(340.0);
		
		System.out.println ( "the boxes length is: " + box.getLength());
		System.out.println("the boxes width is: " + box.getWidth());
		System.out.println(" the area of this box is: " + box.getArea());

	}

}
