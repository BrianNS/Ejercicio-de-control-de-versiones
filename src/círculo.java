
public class círculo extends formageo {

	private double radio;
	private double áreaRadio;
	static final double pi = 3.14;
	
	public círculo(String Color, String Nombre, double radio){
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
	
	public double getAreaRadio(){
		return áreaRadio;
	}
	
	@Override
	public double área(){
		return áreaRadio = pi*radio*radio;
	}
}
