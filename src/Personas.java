import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Personas {
		
	private String nombre;
	private String DNI;
	LocalDate Fnac;
	
	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}	
	
	public LocalDate getFnac() {
		return Fnac;
	}

	public void setFnac(LocalDate Fnac) {
		this.Fnac = Fnac;
	}
	
	public int edad(LocalDate vf) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoy = LocalDate.now();

		Period periodo = Period.between(vf, hoy);
		return periodo.getYears();
	}
}
