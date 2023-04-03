public class Medico extends Trabajador {

	private String horarioDeAtencion;
	private Arraylist pacientesAsignados;
	private String especialidadMedica;

	public String getHorarioDeAtencion() {
		return this.horarioDeAtencion;
	}


	public void setHorarioDeAtencion(String horarioDeAtencion) {
		this.horarioDeAtencion = horarioDeAtencion;
	}

	public Arraylist getPacientesAsignados() {
		return this.pacientesAsignados;
	}


	public void setPacientesAsignados(Arraylist pacientesAsignados) {
		this.pacientesAsignados = pacientesAsignados;
	}

	public String getEspecialidadMedica() {
		return this.especialidadMedica;
	}

	public void setEspecialidadMedica(String especialidadMedica) {
		this.especialidadMedica = especialidadMedica;
	}

}