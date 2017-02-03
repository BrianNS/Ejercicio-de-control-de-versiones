import java.time.LocalDate;

public class Alumnos extends Personas {

	
	private String CIAL,ciclo;
	
	public Alumnos(){
		super.getnombre();
	}
	
	public Alumnos(String CIAL){
		this.CIAL = CIAL;
	}
	
	public Alumnos(String CIAL, String ciclo){
		this.CIAL = CIAL;
		this.ciclo = ciclo;
	}
	
	public String getCIAL() {
		return CIAL;
	}

	public void setCIAL(String CIAL) {
		this.CIAL = CIAL;
	}
	
	public String getciclo() {
		return ciclo;
	}

	public void setciclo(String ciclo) {
		this.ciclo = ciclo;
	}
}
