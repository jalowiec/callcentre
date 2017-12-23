package callcentre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CallCentre implements Callable{
	
	Map<Integer, String> centralka;
	DepartmentProviderImplementation departmentImplementation;
	
	
	CallCentre(){
		
		centralka = new HashMap<>();
		centralka.put(1, "Dzial sprzedazy");
		centralka.put(2, "Dzial serwisu");
		centralka.put(3, "Dzial pomocy");
		
		departmentImplementation =  new DepartmentProviderImplementation();
		
				
	}
	
	private void DepartmentInfo() {
		
		for (Map.Entry<Integer, String> entry : centralka.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
			
			
		}
	}
	
	public void callDepartmentByName(String name) {
		
		departmentImplementation.getDepartmentByName(name).call();
		
		
	}
	
	public void call() {
		
		
		System.out.println("telefon w call centre");
		System.out.println("wybierz numer");
		DepartmentInfo();
		Scanner scanner = new Scanner(System.in);
		int departmentIdx = scanner.nextInt();
	
		if (centralka.containsKey(departmentIdx)) {
			
			
			System.out.println("znaleziono");
			callDepartmentByName(centralka.get(departmentIdx));
			
			
			
		} 
		else 
			System.out.println("nie znaleziono");
		
		
	}

}
