package herencia.modelos;

/**
 * @author Lean.
 *
 * Clase base de la cual heredarán los objetos Persona y Trabajador.
 * No esta permitido crear instancias de esta clase.
 */
public abstract class Humano {
    protected int edad;
    // 0 para Hombre - 1 para Mujer
    protected int sexo;
    protected String colorDeOjos;
    protected String tonoDePiel;
    protected float peso;
}
