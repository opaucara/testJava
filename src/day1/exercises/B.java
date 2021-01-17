package day1.exercises;

public class B implements A{
	public Email email;
	public void methodB() {
		System.out.println("Metodo B de clase B");
	}
	
	public void methodA() {
		System.out.println("Metodo A de clase B");
	}
	
	public void notifyEmployee() {
		email.sendEMail();
	}
}
