package GoalSheet4;


public class Rectangle {
private float length, width;
	
	public Rectangle(float l, float w) {
		setLength(l);
		setWidth(w);
	}
	
	public float GetPerimeter() {
		return (this.getLength() * 2) + (this.getWidth() *2);
	}
	
	public float GetArea() {
		return this.getLength() * this.getWidth();
	}

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}
}
