package collectionExamples.ListExamples;

public class Color {
	
	private int color_id;
	private String color_name;
	
	public Color(int color_id, String color_name) {
		 
		this.color_id = color_id;
		this.color_name = color_name;
	}
	public int getColor_id() {
		return color_id;
	}
	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}
	public String getColor_name() {
		return color_name;
	}
	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}
	@Override
	public String toString() {
		return "Color [color_id=" + color_id + ", color_name=" + color_name + ", getColor_id()=" + getColor_id()
				+ ", getColor_name()=" + getColor_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
