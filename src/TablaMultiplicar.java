import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args){
		
		//variable
		int n;
		double d;
		
		Scanner tec = new Scanner(System.in);
		
		//Introduciremos un valor para realizar la multiplicación
		System.out.println("Introduce un número: ");
		n = tec.nextInt();
		
		//Crearemos la tabla y calculamos dependiendo del valor que se le introduzca
		System.out.println("tabla del "+n);
		for(int i = 1; i <= 10; i++){
			System.out.println(n+ " * "+i+ " = " +n*i);
		}
	}
}
