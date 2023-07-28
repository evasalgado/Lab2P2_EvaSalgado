/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_evasalgado;

/**
 *
 * @author evaja
 */
public class bartenders {

    String Nombre;
    int Edad;
    String turno;
    int cantmatutino, cantvespertino;
    double sueldo;
    int CantLicores;

    public bartenders(String Nombre, int Edad, String turno,  int cantmatutino, int cantvespertino, double sueldo, int CantLicores) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.cantmatutino=cantmatutino;
        this.cantvespertino=cantvespertino;
        this.sueldo = sueldo;
        this.CantLicores = CantLicores;
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

    public int getCantvespertino() {
        return cantvespertino;
    }

    public void setCantvespertino(int cantvespertino) {
        this.cantvespertino = cantvespertino;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantLicores() {
        return CantLicores;
    }

    public void setCantLicores(int CantLicores) {
        this.CantLicores = CantLicores;
    }

    @Override
    public String toString() {
        return  "Nombre del bartender=" + Nombre + "\nEdad=" + Edad + "\nturno=" + turno + "\nsueldo= lps." + sueldo + "\nNumero de Licores Disponible=" + CantLicores;
    }
    
    
}
