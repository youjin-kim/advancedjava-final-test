package prob4;

public class Person {
	private static int numberOfPerson;
	private int age = 12;
	private String name ="";

	public Person() {
		this.numberOfPerson = 1;
	}

	public Person(String name) {
		this.name = name;
		this.numberOfPerson++;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		this.numberOfPerson++;
	}

	public static int getPopulation() {
		return numberOfPerson;
	}

	public void selfIntroduce() {
		System.out.println("내 이름은 " +this.name+ "이며, 나이는 " +this.age+ "살입니다.");
		
	}

}
