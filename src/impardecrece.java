import javax.swing.JOptionPane;

public class impardecrece {

	public static void main(String[] args){
		String result="";
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cualquier número: "));
		if(num%2==0){num--;}
		bucle:
		for(int i=num; i>0; i-=2){
			if(i%3==0){continue bucle;}
			result=result + " "+i;
		}
		JOptionPane.showMessageDialog(null, "El resultado es"+result);
	}
}
