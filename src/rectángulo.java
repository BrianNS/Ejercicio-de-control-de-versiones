
public class rect�ngulo extends formageo {

	private double base;
	private double altura;
	private double �reaRect�ngulo;
	
	public rect�ngulo(String Color, String Nombre, double base, double altura){
		super();
		this.Color = Color;
		this.Nombre = "Rect�ngulo";
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
	
	public double getAreaRect�ngulo(){
		return �reaRect�ngulo;
	}
	
	@Override
	public double �rea(){
		return �reaRect�ngulo = (base*altura);
	}
}
