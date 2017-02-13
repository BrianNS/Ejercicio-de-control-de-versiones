import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Turismos extends Veh�culos {

	protected String N�puertas;
	protected String remolqueOcarga;
	protected String N�plazas;
		
	public Turismos(){
		super();
	}
		
	public Turismos(String Matr�cula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM, String N�puertas, String remolqueOcarga, String N�plazas){
		this.Matr�cula = Matr�cula;
		this.Chasis = Chasis;
		this.Marca = Marca;
		this.Potencia = Potencia;
		this.DNI = DNI;
		this.FechaM = FechaM;
		this.N�puertas = N�puertas;
		this.remolqueOcarga = remolqueOcarga;
		this.N�plazas = N�plazas;
	}
	
	public String getN�puertas(){
		return N�puertas;
	}
	
	public void setN�puertas(String N�puertas){
		this.N�puertas = N�puertas;
	}
	
	public String getremolqueOcarga(){
		return remolqueOcarga;
	}
	
	public void setremolqueOcarga(String remolqueOcarga){
		this.remolqueOcarga = remolqueOcarga;
	}
	
	public String getN�plazas(){
		return N�plazas;
	}
	
	public void setN�plazas(String N�plazas){
		this.N�plazas = N�plazas;
	}
	
	public LocalDate itv(){

		LocalDate itv = super.getFechaM();
		itv = itv.plusYears(5);
		return itv;
	}
}
