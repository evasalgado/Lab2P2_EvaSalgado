/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_evasalgado;

/**
 *
 * @author evaja
 */
public class mesas {
    int cantplatos; 
    int cantutensilios;
    int cont; 
    double total; 

    public mesas(int cantplatos, int cantutensilios,int cont, double total) {
        this.cantplatos = cantplatos;
        this.cantutensilios = cantutensilios;
        this.cont=cont;
        this.total = total;
    }

    public int getCantplatos() {
        return cantplatos;
    }

    public void setCantplatos(int cantplatos) {
        this.cantplatos = cantplatos;
    }

    public int getCantutensilios() {
        return cantutensilios;
    }

    public void setCantutensilios(int cantutensilios) {
        this.cantutensilios = cantutensilios;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cantidad de platos Ordenados=" + cantplatos + "\nCantidad de utensilos utilizados=" + cantutensilios + "\nPrecio Total= lps." + total ;
    }
    
    
}
