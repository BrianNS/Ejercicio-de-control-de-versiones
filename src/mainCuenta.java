import java.util.Scanner;
import java.io.IOException;

public class mainCuenta {

	public static void main(String[] args) throws IOException{
		
		Cuentas vp;
		Scanner tec;
		
		for(int i= 1; i<=5; i++){
			System.out.println("\nIntroduce el DNI: ");
			tec=new Scanner(System.in);
			vp=new Cuentas();
			vp.setDNI(tec.nextInt());
			tec=new Scanner(System.in);
			System.out.println("Introduce el nombre de usuario: ");
			vp.setNombre(tec.nextLine());
			System.out.println("Has grabado al usuario: " +vp.getNombre() +", con el DNI: "+ vp.getDNI());			
			vp.muestraSaldo();
	}
}
}