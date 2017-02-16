
public class cuadrado extends formageo {

	private int base;
	private double área;
	private String Color;
	private String Nombre;
	
	public cuadrado(int base){
		super();
		this.Color = Color;
		this.Nombre = "Cuadrado";
		this.base = base;
	}
	public double getbase(){
		return base;
	}
	public void setbase(int base){
		this.base = base;
	}
	public double getArea(){
		return área;
	}
	
	public double área(){
		return (base*base);
	}
	public double perímetro(){
		return(4*base);
	}
}
