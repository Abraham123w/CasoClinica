package org.example;

import java.util.ArrayList;

public class EspecialidadMedica {
    private ArrayList<Medico> medicos;
   private ArrayList<Administrativo> administrativos;
   private String nombre;

    public String getNombre() {
        return nombre;
    }

    public EspecialidadMedica(String nombre) {
        this.administrativos= new ArrayList<Administrativo>();
        this.medicos= new ArrayList<Medico>();
        this.nombre = nombre;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico medico) {
        this.medicos.add(medico);
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(Administrativo administrativo) {
        this.administrativos.add(administrativo);
    }
}
