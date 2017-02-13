import java.util.Scanner;

public class mainFiguras {

	public static void main(String[] args){
		boolean repetir = true;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("¿Que figura quieres calcular? \n" + "1 - Cuadrado \n" + "2 - Círculo \n" + "3 - Triángulo \n" + "4 - Rectángulo");
		
		while(repetir){
		int figuras = tec.nextInt();
		switch (figuras){
		
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			repetir = false;
			break;
		}
		
		}
	}
}
