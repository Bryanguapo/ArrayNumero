
public class ArrayNumeros2 {

	public static void main(String[] args) {
		  int tabla[]= {3,6,2,77,3,10,23,14,21,6};

		  int sumaMitad1=0;
		  int sumaMitad2=0;
		  int cantidad=0;
		  //sumamos la primera mitad de la tabla
		  for(int i = 0; i < tabla.length/2; i++) {
			sumaMitad1=sumaMitad1 + tabla[i];}
		  // sumamos todos los valores de la tabla
		  for(int i = 0; i < tabla.length; i++) {
			  cantidad= tabla[i] + cantidad;}
		  
		  sumaMitad2= cantidad - sumaMitad1;
		  
		  //ponemos las opciones que pueden suceder
		  if (sumaMitad1 > sumaMitad2) {
			  System.out.println( "La suma de la primera mitad es mayor: " + sumaMitad1);
	        } else 
	      if (sumaMitad1 < sumaMitad2) {
	        	System.out.println( "La suma de la segunda mitad es mayor: "+ sumaMitad2);
	        }else
		
		  if (sumaMitad1 == sumaMitad2) 
	        	System.out.println( "La suma de la segunda mitad:" +sumaMitad2 +" es igual q la primera: " +sumaMitad1 );
	}

}
