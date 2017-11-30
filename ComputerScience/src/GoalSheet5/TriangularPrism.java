/**
 * Program RectangularPrism.java by Adam Grant on Nov 6, 2017
 */
package GoalSheet5;

/**
 * @author adam
 *
 */
public class TriangularPrism implements Shape3D {

	float length,  width, height, radius;
	
	public TriangularPrism(float l, float w, float h) {
		length =l;
		width = w;
		height = h;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float GetVolume() {
		// TODO Auto-generated method stub
		return ((width*height)/2)*length;
	}

	@Override
	public float GetSurfaceArea() {
		// TODO Auto-generated method stub
		return (float) ((width*height)+(length*Math.sqrt((width*width)+(height*height))+(width*length)));
	}
}
