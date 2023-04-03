package org.example;


import java.util.ArrayList;

public class Clinica {

    //Collection<EspecialidadMedica> especialidades;

    private ArrayList<EspecialidadMedica> especielidadMedica;
    private String nombre;
    private String UbicacionGeografica;
    private String tipoDeClinica;

    public Clinica(String nombre, String ubicacionGeografica, String tipoDeClinica) {
        this.especielidadMedica= new ArrayList<EspecialidadMedica>();
        this.nombre = nombre;
        UbicacionGeografica = ubicacionGeografica;
        this.tipoDeClinica = tipoDeClinica;
    }

    public void ObtenerMedicos() {
        for (EspecialidadMedica espe:especielidadMedica ) {

            for (Medico med: espe.getMedicos() ) {
               med.imprimirDatos();

            }
        }

    }

    public void ObtenerAdministrativos() {

        for (EspecialidadMedica espe:especielidadMedica ) {

            for (Administrativo admi: espe.getAdministrativos() ) {
                admi.imprimirDatos();

            }
        }
    }

    public void ObtenerListaDeMedicos() {
        for (EspecialidadMedica espe:especielidadMedica ) {
            System.out.println("Lista de medicos");
            for (Medico med: espe.getMedicos() ) {
                System.out.println( med.getNombre());

            }
        }

    }

    public void ObtenerAdministrativoPorNombre(String nombre) {

        for (EspecialidadMedica espe:especielidadMedica ) {

            for (Administrativo admi: espe.getAdministrativos() ) {
                if (admi.getNombre().equals(nombre)) {
                    admi.imprimirDatos();
                    System.out.println("especialidad medica :"+espe.getNombre());
                } else {
                    System.out.println("no se encontraron administrativos con ese nombre" );

                }
            }
        }
    }
    public void ObtenerAdministrativoPorRut(int rut) {

        for (EspecialidadMedica espe:especielidadMedica ) {

            for (Administrativo admi: espe.getAdministrativos() ) {
                if (admi.getRut()==(rut)) {

                    admi.imprimirDatos();
                    System.out.println("especialidad medica"+espe.getNombre());
                } else {
                    System.out.println("no se encontraron administrativos con ese nombre");
                }
            }
        }
    }


    public void setEspecielidadMedica(EspecialidadMedica especialidad) {
        this.especielidadMedica.add(especialidad);
    }
}
