/**
 * This program creates three instances of the Rectangle class.
 * @author Mark
 *
 */

import javax.swing.JOptionPane;
public class RoomAreas {
	
	public static void main(String[] args)
	{
		double number; // holds a number
		double totalArea; // holds the total area
		String input; // holds the user input
	
	//Creating three rectangle objects
	Rectangle kitchen = new Rectangle();
	Rectangle bedroom = new Rectangle();
	Rectangle den = new Rectangle();
	

	
	// Get and store the dimenstions of the kitchen.
input = JOptionPane.showInputDialog("What is the " +
											"kitchen's length?");
	
number = Double.parseDouble(input); // parses the input, string , and turns
										// into a double
kitchen.setLength(number);

//Get and store the dimentions of the bedroom.
input = JOptionPane.showInputDialog("What is the kitchen's width ");

number = Double.parseDouble(input);
kitchen.setWidth(number);

// Get and store the dimensions of the bedroom.
input= JOptionPane.showInputDialog("What is the " + " beedroom's length?");

number = Double.parseDouble(input);
bedroom.setLength(number); // uses the number that was processed by the prompt

input = JOptionPane.showInputDialog("What is the beddrom's width?");

number = Double.parseDouble(input);
bedroom.setWidth(number); //setting width of bedroom with current val 
							// of number thats taken from input screen, setting
							//it to the bedroom object rectangle
// Get and store the dimentions of the den.
input = JOptionPane.showInputDialog("What is the den's length?");

number = Double.parseDouble(input);
den.setLength(number);


input = JOptionPane.showInputDialog("Whar is the den's width?");

number = Double.parseDouble(input);
den.setWidth(number);

//Calculate total area of rooms
totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

//Display the total area of the rooms
System.exit(0);


}
}

