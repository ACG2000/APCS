/**
 * Program RectangularPrism.java by Adam Grant on Nov 6, 2017
 */
package GoalSheet5;

/**
 * @author adam
 *
 */
public class RectangularPrism implements Shape3D {

	float length,  width, height, radius;
	
	public RectangularPrism(float l, float w, float h) {
		length =l;
		width = w;
		height = h;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float GetVolume() {
		// TODO Auto-generated method stub
		return length * width * height;
	}

	@Override
	public float GetSurfaceArea() {
		// TODO Auto-generated method stub
		return (length* width)*4 + (width * height)*2;
	}
}
