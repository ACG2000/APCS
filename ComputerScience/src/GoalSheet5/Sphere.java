/**
 * Program RectangularPrism.java by Adam Grant on Nov 6, 2017
 */
package GoalSheet5;

/**
 * @author adam
 *
 */
public class Sphere implements Shape3D {

	float length,  width, height, radius;
	
	public Sphere(float l, float w, float h, float r) {
		length =l;
		width = w;
		height = h;
		radius = r;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float GetVolume() {
		// TODO Auto-generated method stub
		return (float) ((4/3)*Math.PI*(radius*radius*radius));
	}

	@Override
	public float GetSurfaceArea() {
		// TODO Auto-generated method stub
		return (float) (4*Math.PI*(radius*radius));
	}
}
