import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Guaguas extends Veh�culos {

	protected String N�plazas;
	protected String Tiposervicio;
		
	public Guaguas(){
		super();
	}
		
	public Guaguas(String Matr�cula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM, String N�plazas, String Tiposervicio){
		this.Matr�cula = Matr�cula;
		this.Chasis = Chasis;
		this.Marca = Marca;
		this.Potencia = Potencia;
		this.DNI = DNI;
		this.FechaM = FechaM;
		this.N�plazas = N�plazas;
		this.Tiposervicio = Tiposervicio;
	}
	
	public String getN�plazas(){
		return N�plazas;
	}
	
	public void setN�plazas(String N�plazas){
		this.N�plazas = N�plazas;
	}
	
	public String getTiposervicio(){
		return Tiposervicio;
	}
	
	public void setTiposervicio(String Tiposervicio){
		this.Tiposervicio = Tiposervicio;
	}
	
	public LocalDate itv(){

		LocalDate itv = super.getFechaM();
		itv = itv.plusYears(2);
		return itv;
	}
}
