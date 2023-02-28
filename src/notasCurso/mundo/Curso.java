/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Guía 2 - Actividad 2
 * Ejercicio: notas de un curso
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package notasCurso.mundo;

/**
 * Clase que representa un curso.
 */
public class Curso {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Total de estudiantes en el curso.
     */
    public final static int TOTAL_EST = 12;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Notas de los estudiantes.
     */
    private double[] notas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un nuevo curso, inicializando todas las notas en cero.
     */
    public Curso() {
        notas = new double[TOTAL_EST];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0.0;
        }
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Calcula el promedio del curso.
     *
     * @return Promedio de todas las notas del curso. promedio >= 0.
     */
    public double promedio() {
        double promedio = 0;

        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }

        promedio = sumaNotas / TOTAL_EST;

        return promedio;
    }

    /**
     * Devuelve el número de estudiantes que tienen la nota mayor al promedio.
     *
     * @return Número de estudiantes que tienen la nota mayor al promedio. número >= 0.
     */
    public int darCantidadSobrePromedio() {
        double promedio = promedio();

        int estudiantesSobrePromedio = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > promedio){
                estudiantesSobrePromedio++;
            }
        }

        return estudiantesSobrePromedio;
    }

    /**
     * Devuelve la nota de un estudiante del curso.
     *
     * @param pNumEstudiante Número del estudiante : 1 <= estudiante <= 12.
     * @return Nota del estudiante.
     */
    public double darNota(int pNumEstudiante) {
        return notas[pNumEstudiante - 1];
    }

    /**
     * Cambia la nota de un estudiante en el curso.
     *
     * @param pNumEstudiante Número del estudiante. 1 <= estudiante <= 12.
     * @param pNota          Nota del estudiante.
     */
    public void cambiarNota(int pNumEstudiante, double pNota) {
        notas[pNumEstudiante - 1] = pNota;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------
    /**
     * Obtener la cantidad de estudiantes que no pasaron el curso
     */
    public int cantidadReprobados() {
        double promedio = promedio();

        int estudiantesReprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] <= promedio){
                estudiantesReprobados++;
            }
        }

        return estudiantesReprobados;
    }

    /**
     * Obtener la mejor nota del curso.
     */
    public double mejorNota() {
        double mejorNota = 0;

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > mejorNota){
                mejorNota = notas[i];
            }
        }

        return mejorNota;
    }

    /**
     * Obtener el porcentaje de estudiantes que pasaron el curso
     * Debe ser un número entre 0 y 100.
     */
    public double darPorcentajePasaron() {
        int estudiantesQuePasaron = darCantidadSobrePromedio();
        double porcentajePasaron = ((double) estudiantesQuePasaron / (double)TOTAL_EST) * 100;
        return porcentajePasaron;
    }

    /**
     * Determinar si todos los estudiantes del curso pasaron la materia
     * Retorna true si todos tuvieron notas aprobatorias, o false cuando al menos
     * un estudiante reprobó la materia.
     */
    public boolean todosPasaron() {
        int cantidadReprobados = cantidadReprobados();
        boolean nadieReprobo = cantidadReprobados == 0;
        return nadieReprobo;
    }
}