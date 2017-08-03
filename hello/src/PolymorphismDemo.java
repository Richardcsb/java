
public class PolymorphismDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFromeSimpleGeometricObject(1,"red",false));//子类
		displayObject(new RectangleFromeSimpleGeometricObject(1,1,"black",true));//子类
	}
	/*使用父类对象的地方都可以使用子类的对象，这就是通常所说的多态，多态意味着父类型的变量可以引用子类型的对象*/
	public static void displayObject(SimpleGeometricObject object){//父类
		System.out.println("Create on "+object.getDateCreated()+".Color is "+object.getColor());
	}

}
