package GoalSheet5;

public class Cylinder implements Shape3D{

	float length,  width, height, radius;
	
	public Cylinder (float l, float w, float h, float r) {
	
			length =l;
			width = w;
			height = h;
			radius = r;
			// TODO Auto-generated constructor stub
	}
	
	@Override
	public float GetVolume() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*(radius*radius)*height);
	}
	
	@Override
	public float GetSurfaceArea() {
		// TODO Auto-generated method stub
		return (float) (2*Math.PI*(radius*radius) + 2*Math.PI*(radius*radius));
	}
}
