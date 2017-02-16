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
			formageo f1 = new formageo("azul");
			cuadrado cuad1 = new cuadrado(10);
			cuad1.setColor(f1.getColor());
			
			cuadrado cuad2 = new cuadrado(10);
			cuad2.setColor("rojo");
			
			cuadrado cuad3 = new cuadrado(5);
			cuad3.setColor("verde");
			
			cuadrado cuad4 = new cuadrado(5);
			cuad4.setColor("amarillo");
			
			System.out.println("El lado 1 es: " + cuad1.getColor());
			System.out.println("El lado 2 es: " + cuad2.getColor());
			System.out.println("El lado 3 es: " + cuad3.getColor());
			System.out.println("El lado 4 es: " + cuad4.getColor());
			
			break;
		case 2:
			formageo f2 = new formageo("azul");
			círculo circ1 = new círculo(10);
			circ1.setColor(f2.getColor());
			
			System.out.println("El círculo es:" + circ1.getColor());
			
			break;
		case 3:
			formageo f3 = new formageo("azul");
			triángulo trian1 = triángulo(20,15,10,10);
			trian1.setColor(f3.getColor());
			
			triángulo trian2 = triángulo(20,15,10,10);
			trian2.setColor("rojo");
			
			triángulo trian3 = triángulo(20,15,10,10);
			trian3.setColor("amarillo");
			
			System.out.println("El lado 1 es: " + trian1.getColor());
			System.out.println("El lado 2 es: " + trian2.getColor());
			System.out.println("El lado 3 es: " + trian3.getColor());
			
			break;
		case 4:
			formageo f4 = new formageo("azul");
			rectángulo rectan1 = new rectángulo(20,10);
			rectan1.setColor(f4.getColor());
			
			rectángulo rectan2 = new rectángulo(20,10);
			rectan2.setColor("amarillo");
			
			rectángulo rectan3 = new rectángulo(10,20);
			rectan3.setColor("rojo");
			
			rectángulo rectan4 = new rectángulo(10,20);
			rectan4.setColor("verde");
			
			System.out.println("El lado 1 es: " + rectan1.getColor());
			System.out.println("El lado 2 es: " + rectan2.getColor());
			System.out.println("El lado 3 es: " + rectan3.getColor());
			System.out.println("El lado 4 es: " + rectan4.getColor());
			
			repetir = false;
			break;
		}
		
		}
	}
}
