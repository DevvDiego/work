public class Tecnico extends Jugador {
/*    los técnicos 
 * tienen como atributos los años de experiencia tipo (ENTERO) y si son 
 * nacionales o extranjeros (TIPO BOOLEANO). */
    private
    int añosExperiencia;
    Boolean esExtranjero;

    public

    Tecnico(String nombre, String apellido, int edad, Boolean esTitular, int añosExperiencia, Boolean esExtranjero){
        super(nombre, apellido, edad, esTitular);
        this.añosExperiencia = añosExperiencia;
        this.esExtranjero = esExtranjero;
    }

    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + this.get_esTitular()
        + ", " + this.get_añosExperiencia() + ", " + this.get_esExtranjero());
    }


    int get_añosExperiencia(){
        return this.añosExperiencia;
    }
    
    Boolean get_esExtranjero(){
        return this.esExtranjero;
    }

}
