
public class círculo extends formageo {

	private double radio;
	private double área;
	private double perímetro;
	private String Color;
	private String Nombre;
	static final double pi = 3.14;
	
	public círculo(double radio){
		super();
		this.Color = Color;
		this.Nombre = "Círculo";
		this.radio = radio;
	}
	
	public double getRadio(){
		return radio;
	}
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	public double getArea(){
		return área;
	}
	
	public double área(){
		return área = pi*radio*radio;
	}
	public double perímetro(){
		return perímetro = 2*pi*radio;
	}
}
