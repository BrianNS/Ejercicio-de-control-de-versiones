import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConMayus {

	public static void main(String[] args){
		String Conv="";
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca los caracteres para convertir: ");
		String cadena = tec.nextLine();
		for(int i=0; i< cadena.length(); i++){
			Conv = Conv + cadena.charAt(i);
			String txt = Character.toString(cadena.charAt(i));
		}
		System.out.println(cadena.toUpperCase());
	}
}
