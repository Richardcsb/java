
public class CircleWithException {
	private double radius;
	private static int numberOfObjects = 0;
	/*半径为负时，CircleRadiusException中setRadius方法会抛出一个InvalidRadiusException异常
	 * 25行，由于InvalidRadiusException是一个必检异常，setRadius方法必须在方法头部进行声明，由于CircleWithException构造方法
	 * 调用了setRadius方法来设置一个新的半径，第8行构造方法可能会抛出一个InvalidRadiusException异常，构造方法需要声明抛出InvalidRadiusException第11行同理*/
	public CircleWithException()throws InvalidRadiusException{	
		this(1.0);
	}
	public CircleWithException(double newRadius)throws InvalidRadiusException{
		setRadius(newRadius);
		numberOfObjects++;
	}
	public double getRadius(){
		return radius;
	}
/*	public void setRadius(double newRadius)throws IllegalArgumentException{
		if(newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}*/
	//可修改成自定义异常类InvalidRadiusException
	public void setRadius(double newRadius)throws InvalidRadiusException{
		if(newRadius >= 0)
			radius = newRadius;
		else
			throw new InvalidRadiusException(newRadius);
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	public double findArea(){
		return radius*radius*3.14159;
	}

}
