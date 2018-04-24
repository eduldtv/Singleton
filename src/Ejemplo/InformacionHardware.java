package Ejemplo;

public class InformacionHardware {
	public void imprimirInfo() throws InterruptedException {

		DatosSistema ds = DatosSistema.getInstance(); // se cambia la forma de crear el objeto para hacer el patrón de
														// diseño Singleton. No permite crear más de una instancia
		System.out.println(ds.getModeloProcesador());
		System.out.println(ds.getGrafica());
		System.out.println(ds.getRam());

	}
}
