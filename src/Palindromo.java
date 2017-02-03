
public class Palindromo {

	private String Palin;
	
	public Palindromo(){
		
	}
	public String creapalin(String P){
		String v = "";
		for(int i=P.length() - 1; i>=0; i--){
			v = v + P.charAt(i);
		}
		return ( P + v);
	}
	public String getPalin(){
		return Palin;
	}
	public void setPalin(String Palin){
	this.Palin = Palin;
	}
	public boolean CompruebaPalin(String P){
		boolean valor=true;
		int j = P.length()-1;
		for(int i=0; i<j; i++){
			if(P.charAt(i) != P.charAt(j)){
				valor=false;
			}
		}
		j--;
		
		return (valor);
	}
}
