package GoalSheet5;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3D r = new  RectangularPrism(2, 4, 6);
		Shape3D cu = new  Cube(9);
		Shape3D t = new  TriangularPrism(2, 4, 6);
		Shape3D cy = new  Cylinder(2, 4,  6,  8);
		Shape3D co = new  Cone(2,  4, 6, 8);
		Shape3D s = new  Sphere(2, 4, 6, 8);
		
		System.out.println("Rectangular Prism Surface area: "+r.GetSurfaceArea()+"  Volume: "+r.GetVolume());
		System.out.println("cube Surface area: "+cu.GetSurfaceArea()+"  Volume: "+cu.GetVolume());
		System.out.println("Triangular Prism Surface area: "+t.GetSurfaceArea()+"  Volume: "+t.GetVolume());
		System.out.println("Cylinder Surface area: "+cy.GetSurfaceArea()+"  Volume: "+cy.GetVolume());
		System.out.println("Cone Surface area: "+co.GetSurfaceArea()+"  Volume: "+co.GetVolume());
		System.out.println("Sphere Surface area: "+s.GetSurfaceArea()+"  Volume: "+s.GetVolume());
	}
}