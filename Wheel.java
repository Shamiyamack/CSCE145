/*
 * Written by: Shamiya Mack 
 */

public class Wheel {
//Instance variables
	private double diameter;
	private double width;

//Default variables 
	private static final double diameterD = 16; 
	private static final double widthD = 1; 
	private static final double diameterMin = 16;
	private static final double diameterMax = 55; 
	private static final double widthMin = 1; 
	private static final double widthMax = 2.5; 
	
	// Default constructor
	public Wheel() {
		this.diameter = diameterD; // Set to the default diameter value
		this.width = widthD; // Set to the default width value
	}
	//Parameterized constructor
	public Wheel (double diameter, double width) {
		this.setDiameter(diameter);
		this.setWidth(width);
	}
	//Accessor for diameter
	public double getDiameter() {
		return this.diameter;
	}
	//Accessor for width
	public double getWidth() {
		return this.width;
	}
	//Mutator for diameter 
	public void setDiameter(double diameter) {
		if (diameter >= diameterD && diameter <= diameterMax) {
			this.diameter = diameter; 
		} else { 
			this.diameter = diameterD; 
			} 
		}
	//Mutator for width 
	public void setWidth(double width) {
		if (width >= widthMin && width <= widthMax) {
			this.width = width;
		} else { 
			this.width = widthD; }
		}
		//Equals Method 
		public boolean equals(Wheel other) {
			return this.diameter == other.diameter && this.width == other.width;
		}
		//ToString Method 
		public String toString() { 
			return "[Wheel] Diameter: " + diameter + " Width: " + width;
		}
		//Method to print Wheel 
		public void printWheel() {
			System.out.println(toString());
	}
}



	