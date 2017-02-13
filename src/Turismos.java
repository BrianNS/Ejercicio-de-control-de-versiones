import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Turismos extends Vehículos {

	protected String Nºpuertas;
	protected String remolqueOcarga;
	protected String Nºplazas;
		
	public Turismos(){
		super();
	}
		
	public Turismos(String Matrícula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM, String Nºpuertas, String remolqueOcarga, String Nºplazas){
		this.Matrícula = Matrícula;
		this.Chasis = Chasis;
		this.Marca = Marca;
		this.Potencia = Potencia;
		this.DNI = DNI;
		this.FechaM = FechaM;
		this.Nºpuertas = Nºpuertas;
		this.remolqueOcarga = remolqueOcarga;
		this.Nºplazas = Nºplazas;
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

		LocalDate itv = super.getFechaM();
		itv = itv.plusYears(5);
		return itv;
	}
}
