package GoalSheet4;

public class Circle {
	private float radius;
	
	public Circle(float r) {
		radius = r;
	}
	
	public float GetPerimeter() {
		return (float) (2 * Math.PI * this.radius);
	}
	
	public float GetArea() {
		return (float) (Math.PI * Math.pow(this.radius, 2));
	}
}
