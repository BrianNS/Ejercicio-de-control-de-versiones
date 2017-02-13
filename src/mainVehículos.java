import java.util.Scanner;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class mainVehículos {

	public static void main(String[] args)throws ParseException{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		boolean repetir = true;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("¿Que quiere revisar? \n" + "1 - Motos \n" + "2 - Turismos \n" + "3 - Guaguas");
	
		while(repetir){
		int opción = tec.nextInt();
		switch (opción) {
				
		case 1:
			
			Motos moto = new Motos();
		    tec = new Scanner(System.in);
			System.out.print("\nIntroduzca la matrícula: ");
			String Matrícula = tec.nextLine();
			
			System.out.print("Introduzca el chasis: ");
			String Chasis = tec.nextLine();
			
			System.out.print("Introduzca la marca: ");
			String Marca = tec.nextLine();
			
			System.out.print("Introduzca la potencia: ");
			String Potencia = tec.nextLine();
			
			System.out.print("Introduzca el DNI: ");
			String DNI = tec.nextLine();
			
			System.out.print("Introduzca la fecha de matriculación: ");
			String FechaM = tec.nextLine();
			LocalDate lFechaM = LocalDate.parse(FechaM, formato);
						
			moto.setMatrícula(Matrícula);
			moto.setChasis(Chasis);
			moto.setMarca(Marca);
			moto.setPotencia(Potencia);
			moto.setDNI(DNI);
			moto.setFechaM(lFechaM);
			
			System.out.print("Los datos de la moto son los siguientes: \n");
			System.out.print("Matrícula: "+moto.getMatrícula());
			System.out.print("\nChasis: "+moto.getChasis());
			System.out.print("\nMarca: "+moto.getMarca());
			System.out.print("\nPotencia: "+moto.getPotencia());
			System.out.print("\nDNI: "+moto.getDNI());
			System.out.print("\nFecha de matriculación: "+moto.getFechaM());
			break;	
			
		case 2:
			Turismos turismo = new Turismos();
			tec = new Scanner(System.in);
			System.out.print("\nIntroduzca la matrícula: ");
			Matrícula = tec.nextLine();
			
			System.out.print("Introduzca el chasis: ");
			Chasis = tec.nextLine();
			
			System.out.print("Introduzca la marca: ");
			Marca = tec.nextLine();
			
			System.out.print("Introduzca la potencia: ");
			Potencia = tec.nextLine();
			
			System.out.print("Introduzca el DNI: ");
			DNI = tec.nextLine();
			
			System.out.print("Introduzca la fecha de matriculación: ");
			FechaM = tec.nextLine();
			LocalDate tFechaM = LocalDate.parse(FechaM, formato);
			
			System.out.print("Introduzca el número de puertas: ");
			String Nºpuertas = tec.nextLine();
			
			System.out.print("Introduzca la carga: ");
			String remolqueOcarga = tec.nextLine();
			
			System.out.print("Introduzca el número de plazas: ");
			String Nºplazas = tec.nextLine();
						
			turismo.setMatrícula(Matrícula);
			turismo.setChasis(Chasis);
			turismo.setMarca(Marca);
			turismo.setPotencia(Potencia);
			turismo.setDNI(DNI);
			turismo.setFechaM(tFechaM);
			turismo.setNºpuertas(Nºpuertas);
			turismo.setremolqueOcarga(remolqueOcarga);
			turismo.setNºplazas(Nºplazas);
			
			System.out.print("Los datos del turismo son los siguientes: \n");
			System.out.print("Matrícula: "+turismo.getMatrícula());
			System.out.print("\nChasis: "+turismo.getChasis());
			System.out.print("\nMarca: "+turismo.getMarca());
			System.out.print("\nPotencia: "+turismo.getPotencia());
			System.out.print("\nDNI: "+turismo.getDNI());
			System.out.print("\nFecha de matriculación: "+turismo.getFechaM());
			System.out.print("\nNº de puertas: "+turismo.getNºpuertas());
			System.out.print("\nCarga: "+turismo.getremolqueOcarga());
			System.out.print("\nNº de plazas: "+turismo.getNºplazas());			

			break;
			
		case 3:
			Guaguas guagua = new Guaguas();
			 tec = new Scanner(System.in);
			System.out.print("\nIntroduzca la matrícula: ");
			Matrícula = tec.nextLine();
			
			System.out.print("Introduzca el chasis: ");
			Chasis = tec.nextLine();
			
			System.out.print("Introduzca la marca: ");
			Marca = tec.nextLine();
			
			System.out.print("Introduzca la potencia: ");
			Potencia = tec.nextLine();
			
			System.out.print("Introduzca el DNI: ");
			DNI = tec.nextLine();
			
			System.out.print("Introduzca la fecha de matriculación: ");
			FechaM = tec.nextLine();
			LocalDate gFechaM = LocalDate.parse(FechaM, formato);
			
			System.out.print("Introduzca el número de plazas: ");
			Nºplazas = tec.nextLine();
			
			System.out.print("Introduzca el tipo de servicio: ");
			String Tiposervicio = tec.nextLine();
			
			guagua.setMatrícula(Matrícula);
			guagua.setChasis(Chasis);
			guagua.setMarca(Marca);
			guagua.setPotencia(Potencia);
			guagua.setDNI(DNI);
			guagua.setFechaM(gFechaM);
			guagua.setNºplazas(Nºplazas);
			guagua.setTiposervicio(Tiposervicio);
			
			System.out.print("Los datos de la guagua son los siguientes: \n");
			System.out.print("Matrícula: "+guagua.getMatrícula());
			System.out.print("\nChasis: "+guagua.getChasis());
			System.out.print("\nMarca: "+guagua.getMarca());
			System.out.print("\nPotencia: "+guagua.getPotencia());
			System.out.print("\nDNI: "+guagua.getDNI());
			System.out.print("\nFecha de matriculación: "+guagua.getFechaM());
			System.out.print("\nNº de plazas: "+guagua.getNºplazas());
			System.out.print("\nTipo de servicio: "+guagua.getTiposervicio());
			repetir = false;
			break;
			}
		} 
		}
	}
	