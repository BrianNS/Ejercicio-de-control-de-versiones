import java.time.LocalDate;

public class Profesores extends Personas {

	
	private String especialidad,CentroDestino, NRP;
	

	 public Profesores(){
		super.getnombre();
	}
	
	public String getNRP() {
		return NRP;
	}

	public void setNRP(String NRP) {
		this.NRP = NRP;
	}
	
	public String getespecialidad() {
		return especialidad;
	}

	public void setespecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public String getCentroDestino() {
		return CentroDestino;
	}

	public void setCentroDestino(String CentroDestino) {
		this.CentroDestino = CentroDestino;
	}
}
