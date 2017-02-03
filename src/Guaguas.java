import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract  class Guaguas extends Vehículos {

	private String Nºplazas;
	private String Tiposervicio;
	LocalDate itv;
		
	public Guaguas(){
		super();
	}
	
	public String getNºplazas(){
		return Nºplazas;
	}
	
	public void setNºplazas(String Nºplazas){
		this.Nºplazas = Nºplazas;
	}
	
	public String getTiposervicio(){
		return Tiposervicio;
	}
	
	public void setTiposervicio(String Tiposervicio){
		this.Tiposervicio = Tiposervicio;
	}
	
	public LocalDate itv(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(super.getFechaM(), hoy);
		
		itv = LocalDate.parse(super.getFechaM(), formato);
		itv = itv.plusYears(2);
		return itv;
	}
}
