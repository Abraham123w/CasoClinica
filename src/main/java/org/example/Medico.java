package org.example;

public class Medico extends Trabajador {
    private String horarioDeAtencion;
    private String pacientesAsignados;




    public Medico(String horarioDeAtencion, String pacientesAsignados, String tituloProfesional, String nombre, String direccion, String estadoCivil, int rut, String especialidadMedica) {
        super(tituloProfesional,nombre,direccion,estadoCivil,rut,especialidadMedica);

        this.horarioDeAtencion = horarioDeAtencion;
        this.pacientesAsignados = pacientesAsignados;

    }

    public String getHorarioDeAtencion() {
        return this.horarioDeAtencion;
    }


    public void setHorarioDeAtencion(String horarioDeAtencion) {
        this.horarioDeAtencion = horarioDeAtencion;
    }

    public String getPacientesAsignados() {
         return this.pacientesAsignados;
     }


     public void setPacientesAsignados(String pacientesAsignados) {
       this.pacientesAsignados = pacientesAsignados;
    }
    public void imprimirDatos(){
        System.out.println("Nombre del medico:" + getNombre());
        System.out.println("direccion :" + getDireccion());
        System.out.println("especialidad medica:" + getEspecialidadMedica());
        System.out.println("estado civil:" + getEstadoCivil());
        System.out.println("titulo profeisonal:" + getTituloProfesional());
        System.out.println("horario de atencion:" + getHorarioDeAtencion());
        System.out.println("pacientes asignados:" + getPacientesAsignados());

    }

}
