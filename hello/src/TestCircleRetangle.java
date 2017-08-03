
public class TestCircleRetangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleFromeSimpleGeometricObject circle = new CircleFromeSimpleGeometricObject(1);
		System.out.println("A circle"+circle.toString());
		System.out.println("The color is"+circle.getColor());
		System.out.println("The radius is"+circle.getRadius());
		System.out.println("The area is"+circle.getArea());
		System.out.println("The diameter is"+circle.getDiameter());
		
		RectangleFromeSimpleGeometricObject retangle = new RectangleFromeSimpleGeometricObject(2,4);
		System.out.println("\nA Retangle "+retangle.toString());
		System.out.println("The area is"+retangle.getArea());
		System.out.println("The perimeter is"+retangle.getPerimeter());
	}

}
