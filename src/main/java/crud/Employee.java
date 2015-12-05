package crud;

public class Employee {
	int id;
	String name;
	int age;
	String description;
	
	public Employee(int id, String name, int age, String description) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", description=" + description + "]";
	}
}
