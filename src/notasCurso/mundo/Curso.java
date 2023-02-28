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

        // TODO: Obtener el promedio de las notas de los estudiantes

        return promedio;
    }

    /**
     * Devuelve el número de estudiantes que tienen la nota mayor al promedio.
     *
     * @return Número de estudiantes que tienen la nota mayor al promedio. número >= 0.
     */
    public int darCantidadSobrePromedio() {
        // TODO: Calcular el número de notas mayores
        return 0;
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
        // TODO: Cambiar la nota del estudiante pNumEstudiante
    }

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------
    /**
     * Obtener la cantidad de estudiantes que no pasaron el curso
     */
    public int cantidadReprobados() {
        // TODO: Obtener la cantidad de estudiantes que no pasaron el curso
        return 0;
    }

    /**
     * Obtener la mejor nota del curso.
     */
    public double mejorNota() {
        // TODO: Obtener la mejor nota del curso.
        return 0;
    }

    /**
     * Obtener el porcentaje de estudiantes que pasaron el curso
     * Debe ser un número entre 0 y 100.
     */
    public double darPorcentajePasaron() {
        // TODO: Obtener el porcentaje de estudiantes que pasaron el curso
        return 0.0;
    }

    /**
     * Determinar si todos los estudiantes del curso pasaron la materia
     * Retorna true si todos tuvieron notas aprobatorias, o false cuando al menos
     * un estudiante reprobó la materia.
     */
    public boolean todosPasaron() {
        // TODO: Determinar si todos los estudiantes del curso pasaron la materia
        return false;
    }
}