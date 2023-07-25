package Collection_Ques;

import java.util.HashMap;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1= new Employee(20, "Akash", "Chiraigaon");
		Employee emp2= new Employee(19, "Pooja", "Khojwan");
		Employee emp3= new Employee(18, "Maansi", "Harahua");
	
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(emp1.getAge(), emp1.getName());
		employeeMap.put(emp2.getAge(), emp2.getName());
		employeeMap.put(emp3.getAge(), emp3.getName());
	  
	for(int age :employeeMap.keySet()) {
		String name = employeeMap.get(age);
		System.out.println("Age: " + age + ", Name: " + name);
	}
	}
	

}
