import java.util.*;

public class Clinica {

	//Collection<EspecialidadMedica> especialidades;
	private ArrayList<EspecialidadMedica> facultades = new ArrayList<EspecialidadMedica>();
	private String nombre;
	private String UbicacionGeografica;
	private String tipoDeClinica;

	public Clinica(String nombre, String ubicacionGeografica, String tipoDeClinica) {
		this.nombre = nombre;
		UbicacionGeografica = ubicacionGeografica;
		this.tipoDeClinica = tipoDeClinica;
	}

	public void ObtenerMedicos() {


	}

	public void ObtenerAdministrativos() {
		// TODO - implement Clinica.ObtenerAdministrativos
		throw new UnsupportedOperationException();
	}

	public void ObtenerListaDeMedicos() {
		// TODO - implement Clinica.ObtenerListaDeMedicos
		throw new UnsupportedOperationException();
	}

	public void ObtenerAdministrativoDeUnaEspecialidadPorNombre() {
		// TODO - implement Clinica.ObtenerAdministrativoDeUnaEspecialidadPorNombre
		throw new UnsupportedOperationException();
	}

}