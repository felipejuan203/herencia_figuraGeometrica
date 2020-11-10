package Objects;

public class FigurasGeometricas {
	
	double base;
	double altura;
	double radio;
	double area;
	
	
	public FigurasGeometricas(double base, double altura, double radio, double area) {
		super();
		this.base = base;
		this.altura = altura;
		this.radio = radio;
		this.area = area;
	}
	
	public void obtenerarea()
	{
		
	}
	
	

}

class AreaCirculo extends FigurasGeometricas
{
	
	public AreaCirculo(double base, double altura, double radio, double area)
	{
		super(base, altura, radio, area);
		
	}

	
}

class AreaTriangulo extends FigurasGeometricas
{

	public AreaTriangulo(double base, double altura, double radio, double area)
	{
		super(base, altura, radio, area);
		// TODO Auto-generated constructor stub
	}
	
}

class AreaCuadrado extends FigurasGeometricas
{

	public AreaCuadrado(double base, double altura, double radio, double area) 
	{
		super(base, altura, radio, area);
		// TODO Auto-generated constructor stub
	}
	
}
