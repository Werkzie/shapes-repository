
public class Cuboid extends Shape {

	// Variables
	private double width = 0.0;
	private double height = 0.0;
	private double depth = 0.0;
	
	// Constructor
	public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
	
	// getHeight Getter and Setter
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// getWidth getter and setter
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	// getDepth Getter and Setter
	public double getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}

	
}
