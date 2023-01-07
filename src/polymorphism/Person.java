package polymorphism;

public interface Person {
	void employee();

	public static final int emp_id = 32;
}

class Salary implements Person {

	@Override
	public void employee() {
		System.out.println("Employee here " + emp_id);
	}

}
