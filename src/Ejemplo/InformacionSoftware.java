package Ejemplo;

public class InformacionSoftware {

	public void imprimirInfo() throws InterruptedException {

		DatosSistema ds = DatosSistema.getInstance(); // se cambia la forma de crear el objeto para hacer el patr�n de
														// dise�o Singleton
		System.out.println(ds.getSistemaOperativo());
		System.out.println(ds.getVersionSistemaOperativo());

	}

}
