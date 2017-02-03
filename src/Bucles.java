import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import java.io.IOException;

public class Bucles {

	public static void main(String[] args) throws IOException {
		String result = "";
		String par = "";
		String impar = "";
		//Selector de ejercicios
		int opcion = JOptionPane.showOptionDialog(null, "Seleccione opción", "Selector de opciones",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "1", "2", "3" },
				"opcion 1");

		if (opcion != -1)

			switch (opcion) {
//Ejercicio 1: del 1 al 300, sin mostrar los números múltiplos de 5.
			case 0:
				int opcion1 = JOptionPane.showOptionDialog(null, "Seleccione opción", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "For", "While", "DoWhile" }, "opcion 1");

				if (opcion1 != -1)

					switch (opcion1) {
					case 0:
						bucle: for (int k = 300; k > 0; k -= 1) {
							if (k % 5 == 0) {
								continue bucle;
							}
							result = result + " " + k;
						}
						JOptionPane.showMessageDialog(null, "El resultado es" + result);
						break;

					case 1:
						boolean repetir = true;
						int N = 300;
						bucle: while (repetir) {
							if (N > 0) {
								N = N - 1;
								if (N % 5 == 0) {
									continue bucle;
								}
								result = result + " " + N;
							} else {
								repetir = false;
							}
						}
						JOptionPane.showMessageDialog(null, "El resultado ess" + result);
						break;

					case 2:
						boolean repetir2 = true;
						N = 300;
						bucle: do {
							if (N > 0) {
								N = N - 1;
								if (N % 5 == 0) {
									continue bucle;
								}
								result = result + " " + N;
							} else {
								JOptionPane.showMessageDialog(null, "El resultado es" + result);
								repetir2 = false;
							}
						} while (repetir2);
						break;

					}
break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////

case 1:
//Ejercicio 2: Calcula aleatoriamente 10 valores, mostrarlos e indicar si son pares o impares.
				int opcion2 = JOptionPane.showOptionDialog(null, "Seleccione opción", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "For", "While", "DoWhile" }, "opcion 2");

				if (opcion2 != -1)

					switch (opcion2) {
					
					case 0:
						int r = 0;
						Random b = new Random();
						for (int k = 10; k > 0; k--) {
							r = b.nextInt(99) + 1;
							if(r%2==0){
							par = par + " " + r;
							}else{
							impar = impar + " " + r;	
							}
						}
JOptionPane.showMessageDialog(null, "Los números pares generados son:" +par+ " mientras que los impares han sido:" +impar);
						break;

					case 1:
						boolean repetir = true;
						r = 0;
						int C = 0;
						Random v = new Random();
						while (repetir) {
							if (C < 10) {
								C++;
								r = v.nextInt(99) + 1;
							if(r%2==0){
								par = par + " " + r;
							}else{
								impar = impar + " " + r;	
							}
							}else{
								repetir = false;
							}
						}
		JOptionPane.showMessageDialog(null, "Los números pares generados son:" +par+ " mientras que los impares han sido:" +impar);
						break;
						
					case 2:
						boolean repetir2 = true;
						r = 0;
						C = 0;
						Random n = new Random();
						do {
							if (C < 10) {
								C++;
								r = n.nextInt(99) + 1;
								result = result + ", " + r;
							if(r%2==0){
								par = par + " " + r;
							}else{
								impar = impar + " " + r;	
							}
							}else{
								repetir2 = false;
		JOptionPane.showMessageDialog(null, "Los números pares generados son:" +par+ " mientras que los impares han sido:" +impar);
							}
						} while (repetir2);
						break;
					}
break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////
case 2:
//Ejercicio 3: Mostrar caracteres ASCII decrementando de 4 en 4 el valor y mostrar los caracteres que representan
				int opcion3 = JOptionPane.showOptionDialog(null, "Seleccione opción", "Selector de opciones",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "For", "While", "DoWhile" }, "opcion 2");

				if (opcion3 != -1)

					switch (opcion3) {
	
					case 0:
						int N;
						N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero entre 1 y 255: "));
						
					for (int k = N; k > 0; k-=4) {
						char Asc = (char) k;
						result = result + "  " + Asc;
					}
		JOptionPane.showMessageDialog(null, "Los caracteres asociados al número introducido son: " +result);
					break;
						
					case 1:
						boolean repetir = true;
						N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero entre 1 y 255: "));
						while (repetir) {
							if (N > 0) {				
								char Asc = (char) N;
								N-=4;
								result = result + "  " + Asc;
							}else{	
								repetir = false;
							}
						}
					JOptionPane.showMessageDialog(null, "Los caracteres asociados al número introducido son: " +result);
						break;
						
					case 2:
						boolean repetir2 = true;
						N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero entre 1 y 255: "));
						do {
							if (N > 0) {
								char Asc = (char) N;
								N-=4;
								
								result = result + "  " + Asc;
							}else{	
							repetir2 = false;
					JOptionPane.showMessageDialog(null, "Los caracteres asociados al número introducido son: " +result);
						} 
						}while (repetir2);	
						break;
	}
break;
					}
			}
	}

