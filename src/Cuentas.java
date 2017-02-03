
public class Cuentas {

	private int DNI;
	private String Nombre;
	private String setDNI;
	private double Saldo;
	
	
	public Cuentas(){
		Saldo = 0;
		setNombre(" ");
		
	}
	
	public void setDNI(int c){
		DNI=c;
	}
	
	public int getDNI(){
		return(DNI);
	}
	
	public void Ingresar(){
		double Ingreso = 0;
		Saldo = Saldo + Ingreso;
	}
	
	public void muestraSaldo(){
		System.out.println("Saldo: " +Saldo);
	}
	
	
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String nombre){
		this.Nombre = nombre;
	}
}
