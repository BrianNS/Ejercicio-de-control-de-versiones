import java.util.Scanner;

public class mainFiguras {

	public static void main(String[] args){
		boolean repetir = true;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("�Que figura quieres calcular? \n" + "1 - Cuadrado \n" + "2 - C�rculo \n" + "3 - Tri�ngulo \n" + "4 - Rect�ngulo");
		
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
