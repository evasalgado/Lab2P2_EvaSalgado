/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_evasalgado;

/**
 *
 * @author evaja
 */
public class Chefs {

    String Nombre;
    int Edad;
    String turno;
    int cantmatutino, cantdespertino;
    int CantEstrella;
    double sueldo;

    public Chefs(String Nombre, int Edad, String turno,int cantmatutino,int cantdespertino, int CantEstrella, double sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.cantmatutino=cantmatutino;
        this.cantdespertino=cantdespertino;
        this.CantEstrella = CantEstrella;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantmatutino() {
        return cantmatutino;
    }

    public void setCantmatutino(int cantmatutino) {
        this.cantmatutino = cantmatutino;
    }

    public int getCantdespertino() {
        return cantdespertino;
    }

    public void setCantdespertino(int cantdespertino) {
        this.cantdespertino = cantdespertino;
    }

   
    
    public int getCantEstrella() {
        return CantEstrella;
    }

    public void setCantEstrella(int CantEstrella) {
        this.CantEstrella = CantEstrella;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre del Chef: " + Nombre + "\n Edad: " + Edad + "\nturno: " + turno + "\nEstrellas Michelin: " + CantEstrella + "\nsueldo: lps." + sueldo ;
    }
    
    
}
