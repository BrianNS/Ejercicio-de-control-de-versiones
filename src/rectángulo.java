
public class rect�ngulo extends formageo {

	private String Color;
	private String Nombre;
	private double base;
	private double altura;
	private double �rea;
	private double per�metro;
	private double ancho, largo;
	
	public rect�ngulo(double base, double altura){
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
	
	public double getArea(){
		return �rea;
	}
	
	public double �rea(){
		return �rea = (base*altura);
	}
	public double per�metro(){
		return per�metro = 2*(ancho+largo);
	}
}
