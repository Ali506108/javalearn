
public class Type_create extends HelloWorld {
	public static void main(String[] args) {
		int x = 5;
		
		addoneto(5);
		
		Person Alish;
		Alish = new Person("Sanya");
		Alish.setAge(18);
		
		System.out.println(x);
		System.out.println(Alish.getAge());
	}
	private static void celebrety(Person Alish) {
		Alish.setAge(Alish.getAge() + 1);
	}
	static void addoneto(int num) {
		num += 1;
		
	}
}
