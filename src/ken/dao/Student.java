package ken.dao;

public class Student {
	private int age;
	private String name;
	private String number;
	private String city;
	
	
	public Student() {
		
	}
	public Student(int age, String name, String number, String city) {
		
		this.age = age;
		this.name = name;
		this.number = number;
		this.city = city;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", number=" + number
				+ ", city=" + city + "]";
	}
	
	

}
