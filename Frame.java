/*
 * Written by Shamiya Mack 
 */
public class Frame {

	    // Instance variables
	    private double size;
	    private String type;

	    // Default values
	    private static final double defaultSize = 18.5;
	    private static final double minSize = 18.5;
	    private static final double maxSize = 60;
	    private static final String defaultType = "Diamond";
	    private static final String[] validType = {"Diamond", "Step-Through", "Truss", "Penny-Farthing"};

	    // Default constructor
	    public Frame() {
	        this.size = defaultSize;
	        this.type = defaultType;
	    }

	    // Parameterized constructor
	    public Frame(double size, String type) {
	        this.setSize(size);
	        this.setType(type);
	    }

	    // Accessor for size
	    public double getSize() {
	        return this.size;
	    }

	    // Accessor for type
	    public String getType() {
	        return this.type;
	    }

	    // Mutator for size
	    public void setSize(double size) {
	        if (size >= minSize && size <= maxSize) {
	            this.size = size;
	        } else {
	            this.size = defaultSize;
	        }
	    }

	    // Mutator for type
	    public void setType(String type) {
	        if (isValidType(type)) {
	            this.type = type;
	        } else {
	            this.type = defaultType;
	        }
	    }

	    // Helper method to validate type
	    private boolean isValidType(String type) {
	        for (String validType : validType) {
	            if (validType.equals(type)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    // Equals method
	    public boolean equals(Frame other) {
	        return this.size == other.size && this.type.equals(other.type);
	    }

	    // ToString method
	    public String toString() {
	        return "[Frame] Size: " + size + " Type: " + type;
	    }

	}

