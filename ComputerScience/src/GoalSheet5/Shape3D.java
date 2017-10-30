/**
 *Program Shape3D.java by Adam Grant on Oct 30, 2017 
 */
package GoalSheet5;

public class Shape3D {
	
	private float length, width, height, radius;
	
	public Shape3D(float l, float w, float h, float r) {
		length = l;
		width = w;
		height = h;
		radius = r;
	}
	
	public float GetVolume() {
		return length * width * height;
	}
	
	public float GetSurfaceArea() {
		return this.length * this.width;
	}
}
