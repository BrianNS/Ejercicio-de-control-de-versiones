
public class c�rculo extends formageo {

	private double radio;
	private double �rea;
	private double per�metro;
	private String Color;
	private String Nombre;
	static final double pi = 3.14;
	
	public c�rculo(double radio){
		super();
		this.Color = Color;
		this.Nombre = "C�rculo";
		this.radio = radio;
	}
	
	public double getRadio(){
		return radio;
	}
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	public double getArea(){
		return �rea;
	}
	
	public double �rea(){
		return �rea = pi*radio*radio;
	}
	public double per�metro(){
		return per�metro = 2*pi*radio;
	}
}
