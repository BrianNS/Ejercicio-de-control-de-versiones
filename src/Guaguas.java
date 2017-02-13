import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Guaguas extends Vehículos {

	protected String Nºplazas;
	protected String Tiposervicio;
		
	public Guaguas(){
		super();
	}
		
	public Guaguas(String Matrícula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM, String Nºplazas, String Tiposervicio){
		this.Matrícula = Matrícula;
		this.Chasis = Chasis;
		this.Marca = Marca;
		this.Potencia = Potencia;
		this.DNI = DNI;
		this.FechaM = FechaM;
		this.Nºplazas = Nºplazas;
		this.Tiposervicio = Tiposervicio;
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

		LocalDate itv = super.getFechaM();
		itv = itv.plusYears(2);
		return itv;
	}
}
