package Ejemplo;

public class InformacionHardware {
	public void imprimirInfo() throws InterruptedException {

		DatosSistema ds = DatosSistema.getInstance(); // se cambia la forma de crear el objeto para hacer el patr�n de
														// dise�o Singleton. No permite crear m�s de una instancia
		System.out.println(ds.getModeloProcesador());
		System.out.println(ds.getGrafica());
		System.out.println(ds.getRam());

	}
}
