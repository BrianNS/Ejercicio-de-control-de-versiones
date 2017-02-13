
public abstract class formageo {

	protected String Color;
	protected String Nombre;
	
	public String getColor(){
		return Color;
	}
	public void setColor(String Color){
		this.Color = Color;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre = Nombre;
	}
	public abstract double área();
	public abstract double perímetro();
}
