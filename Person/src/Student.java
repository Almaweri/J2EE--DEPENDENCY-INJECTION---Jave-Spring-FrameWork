	
	public class Student extends Person {

		String stId;

		public Student(String name, String eyeColor, int age, double height,
				String stID) {

			super(name, eyeColor, age, height);
			this.stId = stID;

		}

		@Override
		public void walk() {
			System.out.println(this.name + " the student is walking");
		}

		public String toString() {
			return "Student [stId =" + stId + ", name =" + name + ", eyeColor ="
					+ eyeColor + ", age = " + age + ", height = " + height + "]";
		}

	}

 