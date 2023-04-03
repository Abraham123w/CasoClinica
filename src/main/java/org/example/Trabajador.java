package org.example;
import java.util.ArrayList;

public class Trabajador {

    private String tituloProfesional;
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private int rut;
    private String HorarioDeTrabajo;
    private String especialidadMedica;

    public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, int rut, String especialidadMedica) {
        this.tituloProfesional=tituloProfesional;
        this.nombre=nombre;
        this.direccion=direccion;
        this.estadoCivil=estadoCivil;
        this.rut=rut;
        this.especialidadMedica=especialidadMedica;
    }
    public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, int rut) {
        this.tituloProfesional=tituloProfesional;
        this.nombre=nombre;
        this.direccion=direccion;
        this.estadoCivil=estadoCivil;
        this.rut=rut;

    }

    public String getTituloProfesional() {
        return this.tituloProfesional;
    }



    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getNombre() {
        return this.nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }


    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getRut() {
        return this.rut;
    }


    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getHorarioDeTrabajo() {

        throw new UnsupportedOperationException();
    }


    public void setHorarioDeTrabajo(String HorarioDeTrabajo) {

        throw new UnsupportedOperationException();
    }

    public void getTipo() {

        throw new UnsupportedOperationException();
    }

    public String getEspecialidadMedica() {
        return this.especialidadMedica;
    }


    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

}
