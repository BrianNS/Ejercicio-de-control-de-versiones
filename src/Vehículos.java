import java.time.LocalDate;

public abstract class Veh�culos {

	protected String Matr�cula;
	protected String Chasis;
	protected String Marca;
	protected String Potencia;
	protected String DNI;
	protected LocalDate FechaM;
	
	
	public Veh�culos(){
		super();
	}
	
	public void veh�culo(String Matr�cula, String Chasis, String Marca, String Potencia, String DNI, LocalDate FechaM){
		this.Matr�cula = Matr�cula;
		this.Chasis = Chasis;
		this.Marca = Marca;
		this.Potencia = Potencia;
		this.DNI = DNI;
		this.FechaM = FechaM;
	}
	
	public String getMatr�cula(){
		return Matr�cula;
	}
	
	public void setMatr�cula(String Matr�cula){
		this.Matr�cula = Matr�cula;
	}
	
	public String getChasis(){
		return Chasis;
	}
	
	public void setChasis(String Chasis){
		this.Chasis = Chasis;
	}
	
	public String getMarca(){
		return Marca;
	}
	
	public void setMarca(String Marca){
		this.Marca = Marca;
	}
	
	public String getPotencia(){
		return Potencia;
	}
	
	public void setPotencia(String Potencia){
		this.Potencia = Potencia;
	}
	
	public String getDNI(){
		return DNI;
	}
	
	public void setDNI(String DNI){
		this.DNI = DNI;
	}
	
	public LocalDate getFechaM(){
		return FechaM;
	}
	
	public void setFechaM(LocalDate FechaM){
		this.FechaM = FechaM;
	}
	
	public abstract LocalDate itv();
}