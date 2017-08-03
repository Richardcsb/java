
public class CircleFromeSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	public CircleFromeSimpleGeometricObject(){
	}
	public CircleFromeSimpleGeometricObject(double radius){
		this.radius = radius;
	}
	public CircleFromeSimpleGeometricObject(double radius,String color,boolean filled){
 		/*setColor(color);
  		setFilled(filled);
 		可用super关键字调用父类构造方法
		这个调用必须是构造方法的第一条语句*/
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getDiameter(){
		return 2*radius;
	}
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	public void printCircle(){
		System.out.println("The circle is created"+getDateCreated()+"and the radius is"+radius);
	}
	public String toString(){
		return super.toString()+"\nradius is"+radius;
	}
}
