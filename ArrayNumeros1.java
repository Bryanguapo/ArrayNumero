
public class ArrayNumeros1 {

	public static void main(String[] args) {
  int tabla[]= {3,6,2,77,3,10,23,14};
  
  int contador = 0;
  
//encontar cuantas valores se repiten un valor de la tabla
			for (int i = 0; i < tabla.length; i++) 
		            if (tabla[i] == 3) 
		                contador++;
		                
  System.out.println("1. ¿Cuántos valores 3 hay en el array? Respuesta: " + contador);
  
  
  
		            
			
	}


}
