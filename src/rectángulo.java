
public class rectángulo extends formageo {

	private double base;
	private double altura;
	private double áreaRectángulo;
	
	public rectángulo(String Color, String Nombre, double base, double altura){
		super();
		this.Color = Color;
		this.Nombre = "Rectángulo";
		this.base = base;
		this.altura = altura;	
	}
	public double getBase(){
		return base;
	}
	public void setBase(double base){
		this.base = base;
	}
	
	public double getAltura(){
		return altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAreaRectángulo(){
		return áreaRectángulo;
	}
	
	@Override
	public double área(){
		return áreaRectángulo = (base*altura);
	}
}
