
public class triángulo extends formageo {

	private int base, h, l1, l2;
	private String Color;
	private String Nombre;
	private double área;
	
	public triángulo(int base, int h, int a, int b){
		super();
		this.Color = Color;
		this.Nombre = "Triángulo";
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
	
	public double getH(){
		return h;
	}
	public void setH(int h){
		this.h = h;
	}
	
	public int getL1(){
		return l1;
	}
	
	public void setL1(int a){
		this.l1 = a;
	}

	public int getL2(){
		return l2;
	}
	
	public void setL2(int b){
		this.l2 = b;
	}
	
	public double getArea(){
		return área;
	}
	
	public double área(){
		return ((base*h)/2);
	}
	public double perímetro(){
		return(l1+l2+base);
}
}
