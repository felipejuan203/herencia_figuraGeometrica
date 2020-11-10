package Objects;

import java.util.Scanner;

public class Mein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ingresar radio del circulo");
			Scanner entradaEscaner = new Scanner (System.in);
	        String radio = entradaEscaner.nextLine (); 
	        double radiofinal = Double.parseDouble(radio);
	        
	        
	        FigurasGeometricas areaCirculo = new AreaCirculo(radiofinal, radiofinal, radiofinal, radiofinal);
	        areaCirculo = areaCirculo(radiofinal);
	        double area = radiofinal*radiofinal*Math.PI;
			
			System.out.println("el area del circulo es" + area );
			
			
			System.out.println("ingresar base del triangulo");
			Scanner entradaEscaner1 = new Scanner (System.in);
	        String base = entradaEscaner1.nextLine (); 
	        double basefinal = Double.parseDouble(base);
	        
	        System.out.println("ingresar altura del triangulo");
			Scanner entradaEscaner2 = new Scanner (System.in);
	        String altura = entradaEscaner2.nextLine (); 
	        double alturafinal = Double.parseDouble(altura);
	        
	        
	        FigurasGeometricas areaTriangulo = new AreaTriangulo(basefinal, alturafinal, alturafinal, alturafinal);
	        areaCirculo = areaTriangulo(basefinal, alturafinal);
	        double area1 = basefinal*alturafinal/2;
	        
			
			System.out.println("el area del triangulo es" + area1 );
			
			
			System.out.println("ingresar base del cuadrado");
			Scanner entradaEscaner3 = new Scanner (System.in);
	        String base2 = entradaEscaner3.nextLine (); 
	        double basefinal2 = Double.parseDouble(base2);
	        
	        System.out.println("ingresar altura del cuadrado");
			Scanner entradaEscaner4 = new Scanner (System.in);
	        String altura2 = entradaEscaner4.nextLine (); 
	        double alturafinal2 = Double.parseDouble(altura2);
	        
	        
	        FigurasGeometricas areaCuadrado = new AreaCuadrado(basefinal2, alturafinal2, alturafinal2, alturafinal2);
	        areaCuadrado = areaCuadrado(basefinal2, alturafinal2);
	        double area2 = basefinal2*alturafinal2;
	        
			
			System.out.println("el area del Cuadrado es" + area2 );
	 


			
		
	}
	
	
	
	public static FigurasGeometricas areaCirculo(double radio)
	{
		FigurasGeometricas areaCirculo = new AreaCirculo(radio, radio, radio, radio);
		return areaCirculo; 
	}
	
	public static FigurasGeometricas areaTriangulo (double base, double altura)
	{
		FigurasGeometricas areatriangulo = new AreaTriangulo(altura, base, altura, altura); 
		return areatriangulo; 
	}
	
	public static FigurasGeometricas areaCuadrado (double base, double altura)
	{
		FigurasGeometricas areacuadrado = new AreaCuadrado(altura, base, altura, altura); 
		return areacuadrado; 
		
	}

		
}
