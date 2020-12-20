package soru6.IO;

public class Student {
	private String id;
	private String name;
	private String lastName;
	private int age;
	private String department;
	
	
	public Student(String id, String name, String lastName, int age, String department) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.department = department;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Öðrenci Numarasý: " + id + ", Ad: " + name + ", Soyad: " + lastName + ", Yaþ: " + age + ", Bölüm: "
				+ department+ "";
	}
	
	

}
