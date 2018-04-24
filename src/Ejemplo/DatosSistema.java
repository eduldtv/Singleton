package Ejemplo;

public class DatosSistema {
	private String sistemaOperativo;
	private String versionSistemaOperativo;
	private String modeloProcesador;
	private String grafica;
	private int ram;

	private DatosSistema() throws InterruptedException { // usando el singleton ponemos private el constructor, es
															// obligatorio
		this.sistemaOperativo = "Windows";
		this.versionSistemaOperativo = "XP";
		this.modeloProcesador = "intel";
		this.grafica = "nvidia";
		this.ram = 16;
		Thread.sleep(3000); // para añadir un tiempo para que reaccione
	}

	private static DatosSistema instance;

	public static DatosSistema getInstance() throws InterruptedException {
		if (instance == null) {
			instance = new DatosSistema();
		}
		return instance;
	}

	public String getSistemaOperativo() {
		return this.sistemaOperativo;
	}

	public String getVersionSistemaOperativo() {
		return this.versionSistemaOperativo;
	}

	public String getModeloProcesador() {
		return this.modeloProcesador;
	}

	public String getGrafica() {
		return this.grafica;
	}

	public int getRam() {
		return this.ram;
	}

}
