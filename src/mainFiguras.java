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
			c�rculo circ1 = new c�rculo(10);
			circ1.setColor(f2.getColor());
			
			System.out.println("El c�rculo es:" + circ1.getColor());
			
			break;
		case 3:
			formageo f3 = new formageo("azul");
			tri�ngulo trian1 = tri�ngulo(20,15,10,10);
			trian1.setColor(f3.getColor());
			
			tri�ngulo trian2 = tri�ngulo(20,15,10,10);
			trian2.setColor("rojo");
			
			tri�ngulo trian3 = tri�ngulo(20,15,10,10);
			trian3.setColor("amarillo");
			
			System.out.println("El lado 1 es: " + trian1.getColor());
			System.out.println("El lado 2 es: " + trian2.getColor());
			System.out.println("El lado 3 es: " + trian3.getColor());
			
			break;
		case 4:
			formageo f4 = new formageo("azul");
			rect�ngulo rectan1 = new rect�ngulo(20,10);
			rectan1.setColor(f4.getColor());
			
			rect�ngulo rectan2 = new rect�ngulo(20,10);
			rectan2.setColor("amarillo");
			
			rect�ngulo rectan3 = new rect�ngulo(10,20);
			rectan3.setColor("rojo");
			
			rect�ngulo rectan4 = new rect�ngulo(10,20);
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
