package callcentre;

public class Department implements Callable {
	
	private String name;
	
	Department(String name){
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void call() {
		
		
		System.out.println("Dzwonienie w departamencie " + this.getName());
		
	}
	

}
