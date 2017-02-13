
public class tri�ngulo extends formageo {

	private int base, h, l1, l2;
	
	private double �reaTri�ngulo;
	
	public tri�ngulo(String Color, String Nombre, int base, int h, int a, int b){
		super();
		this.Color = Color;
		this.Nombre = "Tri�ngulo";
		this.base = base;
		this.h = h;
		this.l1=a;
		this.l2=b;
	}
	public double getBase(){
		return base;
	}
	public void setBase(int base){
		this.base = base;
	}
	
	public double getAltura(){
		return h;
	}
	public void setAltura(int h){
		this.h = h;
	}
	
	public int getL1() {
		return l1;
	}

	public int getL2() {
		return l2;
	}
	
	public double getAreaTri�ngulo(){
		return �reaTri�ngulo;
	}
	
	public double area(){
		return ((base*h)/2);
	}
	public double perimetro(){
		return(l1+l2+base);
}
}
