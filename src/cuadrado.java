
public class cuadrado extends formageo {

	private int base;
	private double �rea;
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
		return �rea;
	}
	
	public double �rea(){
		return (base*base);
	}
	public double per�metro(){
		return(4*base);
	}
}
