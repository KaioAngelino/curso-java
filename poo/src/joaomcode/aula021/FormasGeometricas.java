package joaomcode.aula021;

public abstract class FormasGeometricas {

	public final double PI = 1.1415;
	private double lado;

	public abstract double calculaArea(double lado);

	public abstract double calculaPerimetro(double lado);

	public abstract double angulosInternos(double lado);

}
