
public class rectángulo extends formageo {

	private String Color;
	private String Nombre;
	private double base;
	private double altura;
	private double área;
	private double perímetro;
	private double ancho, largo;
	
	public rectángulo(double base, double altura){
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
	
	public double getArea(){
		return área;
	}
	
	public double área(){
		return área = (base*altura);
	}
	public double perímetro(){
		return perímetro = 2*(ancho+largo);
	}
}
