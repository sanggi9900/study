package myclass;

public class Human {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Human() { this("사람", 0, 0, 0); }
	public Human(String name) { this(name, 0, 0 ,0); }
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	public double getHeight() { return height; }
	public double getWeight() { return weight; }
	
	public void introduce() { System.out.println("난 "+name+"이야!"); }
	public void showInfo() {
		System.out.printf("%s( %d, %.1f %.1f )", name, age, height, weight);
	}
}