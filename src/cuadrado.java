
public class cuadrado extends formageo {

	private int base;
	private double įreaCuadrado;
	
	public cuadrado(String Color, String Nombre, int base){
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
	public double getAreaCuadrado(){
		return įreaCuadrado;
	}
	
	public double area(){
		return (base*base);
	}
	public double perimetro(){
		return(4*base);
	}
}
