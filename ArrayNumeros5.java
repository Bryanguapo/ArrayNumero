
public class ArrayNumeros5 {

	static int factorial(int x) {

	int fact=1;
	for(int i=1;i<=x;i++)
		fact= fact*i;
	return fact;
	}
	public static void main(String[] args) {
		// dlecaramos la tabla
	
		  int tabla[]= new int[10];
		  // rellenamos la tabla
		  for(int i=0; i<tabla.length;i++)
			  tabla[i]=factorial(i);

		  //mostramos la tabla en pantalla
		  for(int i=0; i<tabla.length;i++)
			  System.out.println(i+ ": "+ tabla[i]);

		  
		  
	}

}
