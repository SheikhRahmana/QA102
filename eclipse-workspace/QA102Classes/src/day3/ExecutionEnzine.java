package day3;

public class ExecutionEnzine {

	public static void main(String[] args) {
		String name= "david";
		int id=104;
	 
		
		Students std= new Students(name);
		std.getName();
		String nme=std.getNames();
		System.out.println(nme);
		Students std1= new Students(name="John",id);
		String nms=std1.getNames();
		System.out.println(nms);
		int ids=std1.getID();
		System.out.println(ids);
		Home.address="124 John Street";
		Home.name="Joe";
		Home ho= new Home();
		ho.getNme();
		ho.getAddrs();
		

	}





}
