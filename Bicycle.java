/*
 * Written by Shamiya Mack
 */
public class Bicycle {

		    // Instance variables
		    private String make;
		    private Wheel frontWheel;
		    private Wheel backWheel;
		    private Frame frame;

		    // Default values
		    private static final String makeDefault = "none";

		    // Default constructor
		    public Bicycle() {
		        this.make = makeDefault;
		        this.frontWheel = new Wheel();
		        this.backWheel = new Wheel();
		        this.frame = new Frame();
		    }

		    // Parameterized constructor
		    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
		        this.setMake(make);
		        this.setFrontWheel(frontWheel);
		        this.setBackWheel(backWheel);
		        this.setFrame(frame);
		    }

		    // Accessor for make
		    public String getMake() {
		        return this.make;
		    }

		    // Accessor for frontWheel
		    public Wheel getFrontWheel() {
		        return this.frontWheel;
		    }

		    // Accessor for backWheel
		    public Wheel getBackWheel() {
		        return this.backWheel;
		    }

		    // Accessor for frame
		    public Frame getFrame() {
		        return this.frame;
		    }

		    // Mutator for make
		    public void setMake(String make) {
		        if (make != null) {
		            this.make = make;
		        } else {
		            this.make = makeDefault;
		        }
		    }

		    // Mutator for frontWheel
		    public void setFrontWheel(Wheel frontWheel) {
		        if (frontWheel != null) {
		            this.frontWheel = frontWheel;
		        } else {
		            this.frontWheel = new Wheel();
		        }
		    }

		    // Mutator for backWheel
		    public void setBackWheel(Wheel backWheel) {
		        if (backWheel != null) {
		            this.backWheel = backWheel;
		        } else {
		            this.backWheel = new Wheel();
		        }
		    }

		    // Mutator for frame
		    public void setFrame(Frame frame) {
		        if (frame != null) {
		            this.frame = frame;
		        } else {
		            this.frame = new Frame();
		        }
		    }

		    // Equals method
		    public boolean equals(Bicycle other) {
		        return this.make.equalsIgnoreCase(other.make) &&
		               this.frontWheel.equals(other.frontWheel) &&
		               this.backWheel.equals(other.backWheel) &&
		               this.frame.equals(other.frame);
		    }

		    // ToString method
		    public String toString() {
		        return "[Bicycle] Make: " + make + " Front Wheel: " + frontWheel + 
		               " Back Wheel: " + backWheel + " Frame: " + frame;
		    }
		}
