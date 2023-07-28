/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_evasalgado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class Lab2P2_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        char resp = 's';
        String usuario = "", contraseña = "";//tu nombre de usuario es: gerente 
        //tu contraseña es "g3r$nt0
        do {
           System.out.println("---Bienvenido al sistema administrativo del restaurante: El Minimalista---\n\n"
                + "Por favor, ingrese su nombre de usuario ");
        usuario = leer.next();
        System.out.println("Ingrese su contraseña: ");
        contraseña = leer.next();
        if (usuario.equals("gerente") && contraseña.equals("g3r$nt0")) {
            while (opcion != 5) {

            
                System.out.println("Bienvenido Sr. gerente, un placer saludarlo\n"
                        + "Ingrese la opcion de lo que desea administrar\n"
                        + "1. Chefs\n"
                        + "2. Meseros\n"
                        + "3. Bartenders\n"
                        + "4. Mesas\n"
                        + "5. Salir");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        ArrayList<Chefs> listachefs = new ArrayList();
                        
                        int opcionchef=0;
                        String Nombrechef = null;
                        int Edadchef = 0;
                        String turnochef = null;
                        int matutino = 0,
                         vespertino = 0;
                        int CantEstrella = 0;
                        double sueldochef = 0;
                        Chefs nuevochef = new Chefs(Nombrechef, Edadchef, turnochef, matutino, vespertino, CantEstrella, sueldochef);
                        System.out.println("Usted desea...\n"
                                + "1. Crear chef\n"
                                + "2. Modificar\n"
                                + "3. Eliminar\n"
                                + "4. Listar\n"
                                + "5. Volver a menú principal");
                         opcionchef = leer.nextInt();
                        switch (opcionchef) {
                            case 1:
                                if (matutino != 7 && vespertino != 7) {
                                    System.out.println("Ingrese el Nombre del chef: ");
                                    Nombrechef = leer.nextLine();
                                    Nombrechef = leer.nextLine();
                                    System.out.println("Ingrese la edad del chef: ");
                                    Edadchef = leer.nextInt();
                                    System.out.println("Ingrese el turno del chef[matutino/vespertino]: ");
                                    turnochef = leer.next();

                                    if (turnochef.equals("matutino")) {
                                        matutino++;
                                    } else if (turnochef.equals("vespertino")) {
                                        vespertino++;
                                    } else {
                                        System.out.println("valor ingresado no valido");
                                    }
                                    System.out.println("Ingrese la cantidad de estrellas michelin que ha ganado: ");
                                    CantEstrella = leer.nextInt();
                                    System.out.println("Ingrese el sueldo del chef: ");
                                    sueldochef = leer.nextInt();

                                    listachefs.add(nuevochef);

                                    System.out.println("Chef ingresado exitosamente");
                                } else {
                                    if (matutino == 7 && vespertino < 7) {
                                        System.out.println("Lo lamento, matutino está lleno");
                                    } else if (vespertino == 7 && matutino < 7) {
                                        System.out.println("Lo lamento, vespertino está lleno");
                                    } else {
                                        System.out.println("Lo lamento, ya no hay más cupos");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del chef ");
                                String nombre = leer.nextLine();
                                nombre = leer.nextLine();

                                for (int i = 0; i < listachefs.size(); i++) {
                                    if (listachefs.get(i).Nombre.equals(nombre)) {
                                        if (matutino != 7 && vespertino != 7) {
                                            System.out.println("Ingrese la edad del chef: ");
                                            Edadchef = leer.nextInt();
                                            System.out.println("Ingrese el turno del chef[matutino/vespertino]: ");
                                            turnochef = leer.next();
                                            if (turnochef.equals("matutino")) {
                                                matutino++;
                                            } else if (turnochef.equals("vespertino")) {
                                                vespertino++;
                                            } else {
                                                System.out.println("valor ingresado no valido");
                                            }
                                            System.out.println("Ingrese la cantidad de estrellas michelin que ha ganado: ");
                                            CantEstrella = leer.nextInt();
                                            System.out.println("Ingrese el sueldo del chef: ");
                                            sueldochef = leer.nextInt();
                                            listachefs.get(i).setNombre(nombre);
                                            listachefs.get(i).setEdad(i);
                                            listachefs.get(i).setTurno(turnochef);
                                            listachefs.get(i).setCantdespertino(vespertino);
                                            listachefs.get(i).setCantmatutino(matutino);
                                            listachefs.get(i).setCantEstrella(CantEstrella);
                                            listachefs.get(i).setSueldo(sueldochef);

                                            System.out.println("Cambios hechos correctamente");
                                        } else {
                                            System.out.println("Lo siento, el chef no se encuentra en la lista");
                                        }
                                    } else {
                                        if (matutino == 7 && vespertino < 7) {
                                            System.out.println("Lo lamento, matutino está lleno");
                                        } else if (vespertino == 7 && matutino < 7) {
                                            System.out.println("Lo lamento, vespertino está lleno");
                                        } else {
                                            System.out.println("Lo lamento, ya no hay más cupos");
                                        }
                                    }

                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre del chef ");
                                Nombrechef = leer.nextLine();
                                Nombrechef = leer.nextLine();
                                for (int i = 0; i < 10; i++) {
                                    if (listachefs.get(i).Nombre.equals(Nombrechef)) {
                                        listachefs.remove(i);
                                        System.out.println("Chef removido perfectamente");
                                    } else {
                                        System.out.println("Lo siento, el chef no se encuentra en la lista");
                                    }
                                }
                                break;
                            case 4:
                                listar(listachefs);
                                break;
                        }

                        break;

                    case 2:
                        ArrayList<meseros> listameseros = new ArrayList();
                        String Nombremesero = null;
                        int Edadmesero = 0;
                        String turnomesero = "";
                        int cantmatutino = 0,
                         cantvespertino = 0;
                        double sueldomesero = 0.0;
                        double propina = 0.0;
                        meseros nuevomesero = new meseros(Nombremesero, Edadmesero, turnomesero, cantmatutino, cantvespertino, sueldomesero, propina);
                        System.out.println("Usted desea...\n"
                                + "1. Crear Mesero\n"
                                + "2. Modificar\n"
                                + "3. Eliminar\n"
                                + "4. Listar\n"
                                + "5. Volver a menú principal");
                        int opcionmesero = leer.nextInt();
                        switch (opcionmesero) {
                            case 1:
                                if (cantmatutino != 4 && cantvespertino != 4) {
                                    System.out.println("Ingrese el Nombre del mesero: ");
                                    Nombremesero = leer.nextLine();
                                    Nombremesero = leer.nextLine();
                                    System.out.println("Ingrese la edad del mesero: ");
                                    Edadmesero = leer.nextInt();
                                    System.out.println("Ingrese el turno del mesero[matutino/vespertino]: ");
                                    turnomesero = leer.next();

                                    if (turnomesero.equals("matutino")) {
                                        cantmatutino++;
                                    } else if (turnomesero.equals("vespertino")) {
                                        cantvespertino++;
                                    } else {
                                        System.out.println("valor ingresado no valido");
                                    }
                                    System.out.println("Ingrese el sueldo del mesero: ");
                                    sueldomesero = leer.nextInt();
                                    System.out.println("Ingrese la cantidad de propina que ha ganado: ");
                                    propina = leer.nextDouble();

                                    listameseros.add(nuevomesero);
                                    System.out.println("Mesero ingresado exitosamente");

                                } else {
                                    if (cantmatutino == 4 && cantvespertino < 4) {
                                        System.out.println("Lo lamento, matutino está lleno");
                                    } else if (cantmatutino == 4 && cantvespertino < 4) {
                                        System.out.println("Lo lamento, vespertino está lleno");
                                    } else {
                                        System.out.println("Lo lamento, ya no hay más cupos");
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Ingrese el nombre del mesero ");
                                String nombre = leer.nextLine();
                                nombre = leer.nextLine();

                                for (int i = 0; i < listameseros.size(); i++) {
                                    if (listameseros.get(i).Nombre.equals(nombre)) {
                                        if (cantmatutino != 4 && cantvespertino != 4) {
                                            System.out.println("Ingrese la edad del mesero: ");
                                            Edadmesero = leer.nextInt();
                                            System.out.println("Ingrese el turno del mesero[matutino/vespertino]: ");
                                            turnomesero = leer.next();
                                            if (turnomesero.equals("matutino")) {
                                                cantmatutino++;
                                            } else if (turnomesero.equals("vespertino")) {
                                                cantvespertino++;
                                            } else {
                                                System.out.println("valor ingresado no valido");
                                            }
                                            System.out.println("Ingrese el sueldo del mesero: ");
                                            sueldomesero = leer.nextInt();
                                            System.out.println("Ingrese la propina del mesero: ");
                                            propina = leer.nextDouble();

                                            listameseros.get(i).setNombre(nombre);
                                            listameseros.get(i).setEdad(i);
                                            listameseros.get(i).setTurno(turnomesero);
                                            listameseros.get(i).setCantvespertino(cantvespertino);
                                            listameseros.get(i).setCantmatutino(cantmatutino);
                                            listameseros.get(i).setSueldo(sueldomesero);
                                            listameseros.get(i).setPropina(propina);

                                            System.out.println("Cambios hechos correctamente");
                                        } else {
                                            System.out.println("Lo siento, el mesero no se encuentra en la lista");
                                        }
                                    } else {
                                        if (cantmatutino == 4 && cantvespertino < 4) {
                                            System.out.println("Lo lamento, matutino está lleno");
                                        } else if (cantvespertino == 4 && cantmatutino < 4) {
                                            System.out.println("Lo lamento, vespertino está lleno");
                                        } else {
                                            System.out.println("Lo lamento, ya no hay más cupos");
                                        }
                                    }

                                }
                            case 3:
                                System.out.println("Ingrese el nombre del mesero ");
                                Nombremesero = leer.nextLine();
                                Nombremesero = leer.nextLine();
                                for (int i = 0; i < 10; i++) {
                                    if (listameseros.get(i).Nombre.equals(Nombremesero)) {
                                        listameseros.remove(i);
                                        System.out.println("Mesero removido perfectamente");
                                    } else {
                                        System.out.println("Lo siento, el mesero no se encuentra en la lista");
                                    }
                                }
                                break;
                            case 4:
                                listar(listameseros);
                                break;

                        }
                        break;

                    case 3:
                        ArrayList<bartenders> listabart = new ArrayList<>();

                        String Nombrebart = "";
                        int Edadbart = 0;
                        String turnobart = "";
                        int cantmatutino2 = 0,
                         cantvespertino2 = 0;
                        double sueldobart = 0.0;
                        int CantLicores = 0;

                        bartenders newbart = new bartenders(Nombrebart, Edadbart, turnobart, cantmatutino2, cantvespertino2, sueldobart, CantLicores);
                        System.out.println("Usted desea...\n"
                                + "1. Crear Bartender\n"
                                + "2. Modificar\n"
                                + "3. Eliminar\n"
                                + "4. Listar\n"
                                + "5. Volver a menú principal");
                        int opcionbartender = leer.nextInt();
                        switch (opcionbartender) {
                            case 1:
                                if (cantmatutino2 != 2 && cantvespertino2 != 2) {
                                    System.out.println("Ingrese el Nombre del bartender: ");
                                    Nombrebart = leer.nextLine();
                                    Nombrebart = leer.nextLine();
                                    System.out.println("Ingrese la edad del bartender: ");
                                    Edadbart = leer.nextInt();
                                    System.out.println("Ingrese el turno del bartender[matutino/vespertino]: ");
                                    turnobart = leer.next();

                                    if (turnobart.equals("matutino")) {
                                        cantmatutino2++;
                                    } else if (turnobart.equals("vespertino")) {
                                        cantvespertino2++;
                                    } else {
                                        System.out.println("valor ingresado no valido");
                                    }
                                    System.out.println("Ingrese el sueldo del bartender: ");
                                    sueldobart = leer.nextInt();
                                    System.out.println("Ingrese la cantidad de licores que sirve: ");
                                    CantLicores = leer.nextInt();

                                    listabart.add(newbart);

                                    System.out.println("Chef ingresado exitosamente");
                                } else {
                                    if (cantmatutino2 == 2 && cantvespertino2 < 2) {
                                        System.out.println("Lo lamento, matutino está lleno");
                                    } else if (cantvespertino2 == 2 && cantmatutino2 < 2) {
                                        System.out.println("Lo lamento, vespertino está lleno");
                                    } else {
                                        System.out.println("Lo lamento, ya no hay más cupos");
                                    }
                                }

                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del bartender ");
                                String nombre = leer.nextLine();
                                nombre = leer.nextLine();

                                for (int i = 0; i < listabart.size(); i++) {
                                    if (listabart.get(i).Nombre.equals(nombre)) {
                                        if (cantmatutino2 != 2 && cantvespertino2 != 2) {
                                            System.out.println("Ingrese la edad del bartender: ");
                                            Edadbart = leer.nextInt();
                                            System.out.println("Ingrese el turno del bartender[matutino/vespertino]: ");
                                            turnobart = leer.next();
                                            if (turnobart.equals("matutino")) {
                                                cantmatutino2++;
                                            } else if (turnobart.equals("vespertino")) {
                                                cantvespertino2++;
                                            } else {
                                                System.out.println("valor ingresado no valido");
                                            }
                                            System.out.println("Ingrese el sueldo del bartender: ");
                                            sueldobart = leer.nextInt();
                                            System.out.println("Ingrese la cantidad de licores que sirve: ");
                                            CantLicores = leer.nextInt();

                                            listabart.get(i).setNombre(nombre);
                                            listabart.get(i).setEdad(Edadbart);
                                            listabart.get(i).setTurno(turnobart);
                                            listabart.get(i).setCantvespertino(cantvespertino2);
                                            listabart.get(i).setCantmatutino(cantmatutino2);
                                            listabart.get(i).setSueldo(sueldobart);
                                            listabart.get(i).setCantLicores(CantLicores);

                                            System.out.println("Cambios hechos correctamente");
                                        } else {
                                            System.out.println("Lo siento, el mesero no se encuentra en la lista");
                                        }
                                    } else {
                                        if (cantmatutino2 == 2 && cantvespertino2 < 2) {
                                            System.out.println("Lo lamento, matutino está lleno");
                                        } else if (cantvespertino2 == 2 && cantmatutino2 < 2) {
                                            System.out.println("Lo lamento, vespertino está lleno");
                                        } else {
                                            System.out.println("Lo lamento, ya no hay más cupos");
                                        }
                                    }

                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre del bartender ");
                                Nombremesero = leer.nextLine();
                                Nombremesero = leer.nextLine();
                                for (int i = 0; i < 10; i++) {
                                    if (listabart.get(i).Nombre.equals(Nombremesero)) {
                                        listabart.remove(i);
                                        System.out.println("Mesero removido perfectamente");
                                    } else {
                                        System.out.println("Lo siento, el bartender no se encuentra en la lista");
                                    }
                                }
                                break;
                            case 4:
                                listar(listabart);
                                break;
                        }
                        break;

                    case 4:
                        ArrayList<mesas> listamesas = new ArrayList<>();
                        int cantplatos = 0;
                        int cantutensilios = 0;
                        int cont = 0;
                        double total = 0;
                        int acum = 0;

                        mesas newmesa = new mesas(cantplatos, cantutensilios, cont, total);
                        System.out.println("Usted desea...\n"
                                + "1. Crear Mesa\n"
                                + "2. Modificar\n"
                                + "3. Eliminar\n"
                                + "4. Listar");
                        int opcionmesa = leer.nextInt();
                        switch (opcionmesa) {
                            case 1:
                                if (cont != 10) {
                                    System.out.println("Ingrese la cantidad de platos ordenadas: ");
                                    cantplatos = leer.nextInt();
                                    System.out.println("Ingrese la cantidad de utencilios usados: ");
                                    cantutensilios = leer.nextInt();
                                    System.out.println("Ingrese el total de todo: ");
                                    total = leer.nextDouble();

                                    listamesas.add(newmesa);
                                    System.out.println("Mesa ingresada exitosamente");
                                    cont++;
                                } else {
                                    System.out.println("Lo siento, las mesas no estan disponibles");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese el indice de la mesa");
                                int indice = leer.nextInt();
                                for (int i = 0; i < listamesas.size(); i++) {
                                    if (indice == listamesas.get(i).cont) {
                                        if (cont != 10) {
                                            System.out.println("Ingrese la cantidad de platos ordenadas: ");
                                            cantplatos = leer.nextInt();
                                            System.out.println("Ingrese la cantidad de utencilios usados: ");
                                            cantutensilios = leer.nextInt();
                                            System.out.println("Ingrese el total de todo: ");
                                            total = leer.nextDouble();

                                            listamesas.get(i).setCantplatos(cantplatos);
                                            listamesas.get(i).setCantutensilios(cantutensilios);
                                            listamesas.get(i).setCont(cont);
                                            listamesas.get(i).setTotal(total);
                                            System.out.println("Mesa ingresada exitosamente");
                                            cont++;
                                        } else {
                                            System.out.println("Lo siento, las mesas no estan disponibles");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el indice de la mesa");
                                indice = leer.nextInt();
                                for (int i = 0; i < listamesas.size(); i++) {
                                    if (indice == listamesas.get(i).cont) {
                                        listamesas.remove(i);
                                    }

                                }
                                break;
                            case 4:
                                double totalmesas = 0.0;
                                listar(listamesas);
                                for (int i = 0; i < listamesas.size(); i++) {
                                    totalmesas += listamesas.get(i).total;
                                }
                                System.out.println("El total de todas las mesas es: " + totalmesas);
                                break;

                        }
                        break;
                    case 5:
                        opcion = 5;
                        System.out.println("Gracias por usar mi programa");
                        resp='n';
                        break;
                    default:
                        System.out.println("Numero ingresado invalido");
                        break;
                }

            

            }
        } else {
            System.out.println("usuario ingresado incorrecto, Desea probar otra vez? [s/n]"); //s es si, n es no
            resp = leer.next().charAt(opcion);
        } 
        } while (resp=='s'||resp=='S');
        
    }

    public static void listar(ArrayList lista) {
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            cont++;
            System.out.print(cont + ". ");
            System.out.println(lista.get(i));
        }
    }

}
