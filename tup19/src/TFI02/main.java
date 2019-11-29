package TFI02;

public class main {
    public static void main(String[] args) {
        Facultad facultad1=new Facultad("Cuenca del plata ");

        Carrera car1=new Carrera("Braida");
        Carrera car3=new Carrera("Craider");
        Carrera car6=new Carrera("Araidou");

        facultad1.agregarCarrera(car1);
        System.out.println(facultad1.listarContenidos());

        facultad1.agregarCarrera(car3);
        System.out.println(facultad1.listarContenidos());

        facultad1.agregarCarrera(car6);
        System.out.println(facultad1.listarContenidos());

        facultad1.eliminarCarrera(car1);
        System.out.println(facultad1.listarContenidos());

        Estudiante jesus=new Estudiante("Jesus","Carlos",30);

        Estudiante menem=new Estudiante("Carlos","Saul Menem",40);

        Profesor Cristopher=new Profesor("Carlos","Saul Carlos",50,300,3);
        Materia Sosase=new Materia("Educacion Fisica",Cristopher);

        Sosase.agregarEstudiante(jesus);
        Sosase.agregarEstudiante(menem);

        Materia Sosase2=new Materia("Educacion Fisica2",Cristopher);

        Sosase2.agregarEstudiante(jesus);

        System.out.println(Sosase.listarContenidos());
        System.out.println(Sosase.verCantidad());

        car3.agregarMateria(Sosase);
        car3.agregarMateria(Sosase2);

        System.out.println(car3.listarContenidos());
        System.out.println(facultad1.listarContenidos());

        facultad1.eliminarEstudiante(jesus);

        System.out.println(Sosase.listarContenidos());
        System.out.println(Sosase2.listarContenidos());

        System.out.println(car3.encontrarMateria("Educacion Fisica"));

        System.out.println(car3.listarContenidos());

        Profesor Juansito=new Profesor("Juan","ElCapo",140,50,1);

        Sosase2.modificarTitular(Juansito);

        System.out.println(Sosase2.toString());
    }
}
