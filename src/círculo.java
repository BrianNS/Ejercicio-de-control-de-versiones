
public class c�rculo extends formageo {

	private double radio;
	private double �reaRadio;
	static final double pi = 3.14;
	
	public c�rculo(String Color, String Nombre, double radio){
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
	
	public double getAreaRadio(){
		return �reaRadio;
	}
	
	@Override
	public double �rea(){
		return �reaRadio = pi*radio*radio;
	}
}
