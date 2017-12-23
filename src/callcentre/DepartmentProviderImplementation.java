package callcentre;

import java.util.ArrayList;
import java.util.List;

public class DepartmentProviderImplementation implements DepartmentProvider{

	List<Department> DepartmentList;
	
	DepartmentProviderImplementation(){
		
		DepartmentList = new ArrayList<>();
		DepartmentList.add(new Department("Dzial sprzedazy"));
		DepartmentList.add(new Department("Dzial serwisu"));
		DepartmentList.add(new Department("Dzial pomocy"));
				
	
	}
	
	@Override
	public Department getDepartmentByName(String name) {
		
		int departmentPos = 0; 
		for (int i = 0 ; i < DepartmentList.size() ; i++) {
			if (DepartmentList.get(i).getName().equals(name) ) {
				
				departmentPos = i;
				break;
				
			}
		}
		return DepartmentList.get(departmentPos);
	}

	

}
