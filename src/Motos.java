import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Motos extends Vehículos {
		
	public Motos(){
		super();
	}

	public Motos(String Matrícula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM){
		this.Matrícula = Matrícula;
		this.Chasis = Chasis;
		this.Marca = Marca;
		this.Potencia = Potencia;
		this.DNI = DNI;
		this.FechaM = FechaM;
	}
	
	public LocalDate itv(){
		
		LocalDate itv = super.getFechaM();
		itv = itv.plusYears(5);
		return itv;
	}
}
