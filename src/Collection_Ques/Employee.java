package Collection_Ques;

public class Employee {
	int age;
	String name;
	String address;
	
	
	
	public Employee(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	 public int getNameAsInteger() {
//	        return Integer.parseInt(name);
//	    }
	 @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Address: " + address;
	    }
	
	

}

