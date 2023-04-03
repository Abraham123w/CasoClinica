package org.example;

public class Main {
    public static void main(String[] args) {
        Clinica saludIntegral= new Clinica("Salud Integral","-33.386489174994246, -70.62285145159242","General" );
        Medico medico1= new Medico( "8:00-14:00","1,2,3,4,5,6,7","Medico Cirujano","Daniel","el alerce 789","casado",1238791,"medicina interna");
        Administrativo contador= new Administrativo( "A@gmail.com","Contador","alex","calle encino 278","soltero",1235678);
        EspecialidadMedica medicinaInterna= new EspecialidadMedica("medicina interna");
        medicinaInterna.setAdministrativos(contador);
        medicinaInterna.setMedicos(medico1);
        saludIntegral.setEspecielidadMedica(medicinaInterna);
        saludIntegral.ObtenerMedicos();
        saludIntegral.ObtenerAdministrativos();
        saludIntegral.ObtenerListaDeMedicos();
        saludIntegral.ObtenerAdministrativoPorNombre("alex");
        saludIntegral.ObtenerAdministrativoPorNombre("ale");

    }


}