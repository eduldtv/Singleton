package Ejemplo;

public class Ejecutable {

	public static void main(String[] args) throws InterruptedException {

		InformacionSoftware infsoft = new InformacionSoftware();
		InformacionSoftware infsoft2 = new InformacionSoftware();

		InformacionHardware infhard = new InformacionHardware();
		InformacionHardware infhard2 = new InformacionHardware();

		infsoft.imprimirInfo();
		infsoft2.imprimirInfo();

		infhard.imprimirInfo();
		infhard2.imprimirInfo();

	}

}
