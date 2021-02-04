
public class Cylinder extends Shape{
	
	// Variables
	private double radius = 0.0;
	private double height = 0.0;
	
	// Constructor
	public Cylinder(float radius, float height) {
        
        this.height = height;
        this.radius = radius;
    }

	// Getter and Setter for getRadius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Getter and setter for getHeight
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
