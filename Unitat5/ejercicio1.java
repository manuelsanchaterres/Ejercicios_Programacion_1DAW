import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usuario = "", password= "";
		Integer contadorIntentosLogging = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca Usuario: ");
		usuario = input.nextLine();
		System.out.print("Introduzca Contraseña: ");
		password = input.nextLine();		
		
		while(!login(usuario, password)) {
			contadorIntentosLogging++;
			System.out.println(contadorIntentosLogging);
			if (contadorIntentosLogging < 3) {
				System.out.print("Introduzca Usuario: ");
				usuario = input.nextLine();
				System.out.print("Introduzca Contraseña: ");
				password = input.nextLine();
				login(usuario, password);
			} else {
				
				System.out.print("Has excedido el número máximo de 3 intentos.");
				System.exit(0);
			}
		}
		System.out.println("Bienvenido " + usuario);
	}
	
	public static boolean login(String usuario, String password) {
		
		boolean userIsLogged = false;
		
		if (usuario.equals("usuario1") && password.equals("asdfg")) {
			
			userIsLogged = true;
			
		} else {
			
			userIsLogged = false;
		}
		
		return userIsLogged;
	}

}

