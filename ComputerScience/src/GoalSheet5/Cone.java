package GoalSheet5;

public class Cone extends Cylinder{

	public Cone(float l, float w, float h, float r) {
		super(l, w, h, r);
		// TODO Auto-generated constructor stub
	}
	/*
	Program Cone.java by Adam Grant on Nov 17, 2017
	*/
	@Override
	public float GetVolume() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*(radius*radius)*height)/3;
	}
	
	@Override
	public float GetSurfaceArea() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*(radius*radius) + Math.PI*(radius*length));
	}}
