import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract  class Turismos extends Vehículos {

	private String Nºpuertas;
	private String remolqueOcarga;
	private String Nºplazas;
	LocalDate itv;
	
	
	public Turismos(){
		super();
	}
	
	public String getNºpuertas(){
		return Nºpuertas;
	}
	
	public void setNºpuertas(String Nºpuertas){
		this.Nºpuertas = Nºpuertas;
	}
	
	public String getremolqueOcarga(){
		return remolqueOcarga;
	}
	
	public void setremolqueOcarga(String remolqueOcarga){
		this.remolqueOcarga = remolqueOcarga;
	}
	
	public String getNºplazas(){
		return Nºplazas;
	}
	
	public void setNºplazas(String Nºplazas){
		this.Nºplazas = Nºplazas;
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
