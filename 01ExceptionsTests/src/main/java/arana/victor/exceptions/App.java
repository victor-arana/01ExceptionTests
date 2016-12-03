package arana.victor.exceptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    	
    	try {
    		System.out.println("Ejecutando metodoA()");
			metodoA();
		} catch (typeAException e) {
			ClaseGuardar claseGuardar = new ClaseGuardar();
			
			try {
				claseGuardar.guardar();
			} catch (ClaseGuardarException e1) {
				//
			}
		}
    }
    
    public static void metodoA() throws typeAException{
    	System.out.println("metodoA() ejecutado.");
    }
}
