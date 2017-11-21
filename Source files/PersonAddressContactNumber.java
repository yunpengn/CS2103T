package classObjectDiagram;

public class Main {
	public static void main(String[] args) {
		// Step 1
		Address homeA = new Address("Prince George's Park");

		// Step 2
		Person a = new Person("Alfred", homeA);
		Person b = new Person("Bruce", homeA);
		b.setGuardian(a);

		// Step 3
		ContactNumber numA = new ContactNumber("12345678");
		a.addContactNumber(numA);
		b.addContactNumber(numA);

		// Step 4
		Person c = new Person("Crisal", homeA);
		c.setOffice(homeA);

		// Step 5
		Address officeA = new Address("Wayne Industries");
		a.setOffice(officeA);
	}
}

public class Person {
    private String name = null;
    private Address home = null;
    private Address office = null;
    private Person guardian = null;
    private ArrayList<ContactNumber> numbers = new List<>();

    public Person(String name, Address home) {
        this.name = name;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }

    public void setOffice(Address office) {
        this.office = office;
    }

    public void addContactNumber(ContactNumber newNumber) {
    	numbers.add(newNumber);
    }
}

public class Address {
    private String address = null;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

public class ContactNumber {
    private String number = null;

    public ContactNumber(String number) {
        this.number = number;
    }
}
