import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Motos extends VehÝculos {
		
	public Motos(){
		super();
	}

	public Motos(String MatrÝcula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM){
		this.MatrÝcula = MatrÝcula;
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
