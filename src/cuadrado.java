
public class cuadrado extends formageo {

	private int base;
	private double �reaCuadrado;
	
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
		return �reaCuadrado;
	}
	
	public double area(){
		return (base*base);
	}
	public double perimetro(){
		return(4*base);
	}
}
