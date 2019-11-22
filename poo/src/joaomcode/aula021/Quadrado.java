package joaomcode.aula021;

public final class Quadrado extends FormasGeometricas {

	@Override
	public double calculaArea(double lado) {
		// TODO Auto-generated method stub
		return (lado * lado);
	}

	@Override
	public double calculaPerimetro(double lado) {
		// TODO Auto-generated method stub
		return (lado + lado + lado + lado);
	}

	@Override
	public double angulosInternos(double lado) {
		// TODO Auto-generated method stub
		return 0;
	}

}
