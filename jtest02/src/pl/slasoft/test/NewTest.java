package pl.slasoft.test;

public class NewTest {

	public static void main(String[] args) {
		System.out.println("123");
		System.out.println("i jescze jedna linia!!!");
		System.out.println("2017/05/17, 17 maja");
		
		Person pr = new Person();
		pr.setName("John Smith");
		pr.setCity("Poznan");
		pr.setCountry("Poland");
		pr.setAge(25);
		System.out.println(pr.toString());
		
		Country ctr = new Country();
		ctr.setcName("Germany");
		ctr.setcCapital("Berlin");
		System.out.println(ctr);
	}

}
