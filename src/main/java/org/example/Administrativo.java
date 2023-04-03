package org.example;

public class Administrativo extends Trabajador {


    private String correoElectronico;

    public Administrativo(String correoElectronico,String tituloProfesional, String nombre, String direccion, String estadoCivil, int rut) {
        super(tituloProfesional,nombre, direccion,estadoCivil,rut);
        this.correoElectronico = correoElectronico;

    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void imprimirDatos(){
        System.out.println("Nombre del asministrativo:" + getNombre());
        System.out.println("direccion :" + getDireccion());
        System.out.println("especialidad medica:" + getEspecialidadMedica());
        System.out.println("estado civil:" + getEstadoCivil());
        System.out.println("titulo profeisonal:" + getTituloProfesional());


    }
}
