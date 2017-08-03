
public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public SimpleGeometricObject(){
		dateCreated = new java.util.Date();
	}
	public SimpleGeometricObject(String color,boolean filld){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filld;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	/*重写父类方法*/
	public String toString(){
		return "created on "+dateCreated+"\ncolor:"+color+"and filled:"+filled;
	}
}
