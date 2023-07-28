/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_evasalgado;

/**
 *
 * @author evaja
 */
public class meseros {
    String Nombre;
    int Edad;
    String turno;
    int cantmatutino, cantvespertino;
    double sueldo;
    double propina;

    public meseros(String Nombre, int Edad, String turno, int cantmatutino,int cantvespertino, double sueldo, double propina) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.cantmatutino=cantmatutino;
        this.cantvespertino=cantvespertino;
        this.sueldo = sueldo;
        this.propina = propina;
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

    public int getCantmatutino() {
        return cantmatutino;
    }

    public void setCantmatutino(int cantmatutino) {
        this.cantmatutino = cantmatutino;
    }

    public int getCantvespertino() {
        return cantvespertino;
    }

    public void setCantvespertino(int cantvespertino) {
        this.cantvespertino = cantvespertino;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return  "Nombre de mesero: " + Nombre + "\nEdad=" + Edad + "\nturno=" + turno + "\nsueldo= lps." + sueldo + "\npropina= lps." + propina;
    }
    
    
}
