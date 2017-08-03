import java.util.ArrayList;
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cityList= new ArrayList();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println("List size?"+cityList.size());
		System.out.println("Is Miami in the list?"+cityList.indexOf("Denver"));
		System.out.println("Is the list empty?"+cityList.isEmpty());
		cityList.add(2,"Xian");
		cityList.remove("MIami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		for(int i = cityList.size() - 1;i >= 0;i--)
			System.out.println(cityList.get(i)+" ");
		System.out.println();
		ArrayList list = new ArrayList();
		list.add(new CircleFromeSimpleGeometricObject(2));
		list.add(new CircleFromeSimpleGeometricObject(3));
		System.out.println("The area of the circle?");
	}

}
