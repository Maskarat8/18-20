package conko1;

public class Person_Test {

	public static void main(String[] args) {
		
		Person person = new Person(
				"Alex",
				"zhk. Lagera",
				"0885885765",
				"sashko@gmail.com");
		
		Student student = new Student(
				"Marti",
				"Ovcha Kupel",
				"0888123456",
				"marti@gmail.com",
				Student.FRESHMAN);
		
		Employee employee = new Employee(
				"Gosho",
				"zhk. Drujba",
				"0885885755",
				"goshko@gmail.com",
				"SMG",
				1000);
		
		Staff staff = new Staff(
				"Pesho",
				"zhk. Mladost",
				"0886885755",
				"peshko@gmail.com",
				"BAN",
				2000,
				"director");
		
		Faculty faculty = new Faculty(
				"Ivan",
				"zhk. Zona b5",
				"0886854755",
				"ivan@gmail.com",
				"73d school",
				2000,
				"11:00 - 18:00",
				"Master of arts");
		
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(staff.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
	}
		
		
}
