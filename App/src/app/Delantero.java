/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

public class Delantero extends Jugador {
    
    private
    int golesAnotados;
    
    public
    Delantero(String nombre, String apellido, int edad, Boolean esTitular, int golesAnotados){
        super(nombre, apellido, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + this.get_esTitular()
        + ", " + this.get_golesAnotados());
    }

    int get_golesAnotados(){
        return this.golesAnotados;
    }

    
    void Entrar(){
        System.out.println("\nDelantero: " + this.nombre + " entra.\n");
    }

    void Salir(){
        System.out.println("\nDelantero: " + this.nombre + " sale. \n");
    }
    

}
