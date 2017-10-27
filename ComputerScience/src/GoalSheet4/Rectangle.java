package GoalSheet4;

public class Rectangle {
private float length, width;
	
	public Rectangle(float l, float w) {
		length = l;
		width = w;
	}
	
	public float GetPerimeter() {
		return (this.length * 2) + (this.width *2);
	}
	
	public float GetArea() {
		return this.length * this.width;
	}
}
