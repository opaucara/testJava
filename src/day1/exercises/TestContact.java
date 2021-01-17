package day1.exercises;

public class TestContact {

	public static void main(String[] args) {
		
		System.out.println("TestContact");
		
		
		Contact friend = new Friend();
		friend.name = "oscar";
		((Friend)friend).phoneNumber = "123";
		
		Contact work = new Work();
		work.name = "oscar";
		//Compila bien parent Contact la castea a Friend el cual lo extiende
		//Error de ejecucion, Work cant be cast to Friend
		////((Friend)work).phoneNumber = "123";
		//Lo correcto seria castear a la clase donde esta definida el atributo y que concida con el tipo de la inicializacion
		((Work)work).email = "@dsa.com";
	}

}
