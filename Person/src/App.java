public class App {

	public static void main(String[] args) {
		
		Address magedAddress = new Address (" KingsWood Dr", " 27222", " Dearborn Heights", " 48126", " MI");
		//System.out.println(magedAddress);
		
		Person maged = new Person (" Maged Almaweri", " black", 32, 5.7, magedAddress);
		System.out.println(maged);
		
		Student john = new Student(" John Due", " brown", 25, 5.6, " M87334");
		System.out.println(john);
		john.walk();
		
	}
}
