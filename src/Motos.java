import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract  class Motos extends Vehículos {

	LocalDate itv;
		
	public Motos(){
		super();
	}
	
	public LocalDate itv(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(super.getFechaM(), hoy);
		
		itv = LocalDate.parse(super.getFechaM(), formato);
		itv = itv.plusYears(5);
		return itv;
	}
}
