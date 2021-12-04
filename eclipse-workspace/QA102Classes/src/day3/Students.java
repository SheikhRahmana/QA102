package day3;

public class Students {
	private String name;
	private int id;
	
	public Students() {
		
	}
	public Students(String name) {
		this.name=name;
	}
	public Students(String name,int id) {
		this.name= name;
		this.id=id;
	}
	public void getName() {
		System.out.println(name);
	}
	public String getNames() {
		return name;
	}
	public int getID() {
		return id;
	}

	

}
