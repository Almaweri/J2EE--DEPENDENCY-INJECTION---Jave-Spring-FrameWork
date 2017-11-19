public class Person {

	String name;
	String eyeColor;
	int age;
	double height;
	Address add;

	public Person(String name, String eyeColor, int age, double height) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
		this.height = height;
	}

	public Person(String name, String eyeColor, int age, double height,
			Address add) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
		this.height = height;
		this.add = add;
	}

	public void walk() {
		System.out.println(this.name + " is walking");
	}

	@Override
	public String toString() {
		return "Person [name =" + name + ", eyeColor =" + eyeColor + ", age = "
				+ age + ", height = " + height + ", add= " + add + "]";
	}

}
