import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class mainProfesoresYalumnos {

	public static void main(String[] args)throws ParseException{
		Scanner tec = new Scanner(System.in);
		
		int contador=0;
		
		System.out.println("¿Es usted un Alumno o Profesor? \n" + "1 - Alumno \n" + "2 - Profesor");
		int opción = tec.nextInt();
		tec.nextLine();
		
		if(opción !=2){
		
		for(int i = 0; i < 3; i++){
		Alumnos alumno = new Alumnos();
					
		
		System.out.print("\nIntroduzca su nombre: ");
		String nombre = tec.nextLine();
		
		System.out.print("Introduzca su DNI: ");
		String DNI = tec.nextLine();
		
		System.out.print("Introduzca su CIAL: ");
		String CIAL = tec.nextLine();
				
		System.out.print("Introduzca su ciclo: ");
		String Ciclo = tec.nextLine();
		
		System.out.print("Introduzca la fecha de nacimiento: ");
		String Alum = tec.nextLine();

		DateTimeFormatter formato_alumno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Alum = "20/11/1996";
		
		Alumnos a = new Alumnos();
		
		a.setFnac(LocalDate.parse(Alum, formato_alumno));
		
		
		a.setnombre(nombre);
		a.setDNI(DNI);
		a.setCIAL(CIAL);
		a.setciclo(Ciclo);
		
		
		System.out.print("Los datos del alumno son los siguientes: \n");
		System.out.print("Nombre: "+a.getnombre());
		System.out.print("\nDNI: "+a.getDNI());
		System.out.print("\nCIAL: "+a.getCIAL());
		System.out.print("\nCiclo: "+a.getciclo());
		System.out.print("\nFecha de nacimiento: "+a.getFnac());
		
		}
		
		}else{
					
			tec.nextLine();
			
		for(int j = 0 ; j < 3; j++){
		
			Profesores profesores = new Profesores();
						
			System.out.print("\nIntroduzca su nombre: ");
			String nombre = tec.nextLine();
			
			System.out.print("Introduzca su DNI: ");
			String DNI = tec.nextLine();
			
			System.out.print("Introduzca su NRP: ");
			String NRP = tec.nextLine();
					
			System.out.print("Introduzca su especialidad: ");
			String especialidad = tec.nextLine();
			
			System.out.print("Introduzca el Centro de destino: ");
			String CentroDestino = tec.nextLine();
			
			System.out.print("Introduzca la fecha de nacimiento: ");
			String Prof = tec.nextLine();

			DateTimeFormatter formato_profesor = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			Prof = "20/11/1996";
			
			Profesores p = new Profesores();
			
			p.setFnac(LocalDate.parse(Prof, formato_profesor));
			
			
			p.setnombre(nombre);
			p.setDNI(DNI);
			p.setNRP(NRP);
			p.setespecialidad(especialidad);
			p.setCentroDestino(CentroDestino);
						
			
			System.out.print("Los datos del alumno son los siguientes: ");
			System.out.print("\nNombre: "+p.getnombre());
			System.out.print("\nDNI: "+p.getDNI());
			System.out.print("\nNRP: "+p.getnombre());
			System.out.print("\nEspecialidad: "+p.getDNI());
			System.out.print("\nCentroDestino: "+p.getDNI());									
			System.out.print("\nFecha de nacimiento: "+p.getFnac());
		}
		}
	}
}
