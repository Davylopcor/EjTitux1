package com.mycompany.porrasfutboll;

import java.util.Scanner;

/**
 *
 * @author David López Corella, Alejandro Rosano, Gurjot Singh y Hector Sanchez
 */
public class JuegoCartas {
/**
Hector:
- Contructores Baraja y Carta
- cartasMonton
David:
- Menú
- darCartas
Gurjot:
- siguienteCarta
- mostrarBaraja
Rosano:
- Barajar
- cartasDisponibles 
 */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        while(!exit){
            System.out.println("\n¿Que deseas hacer?"
                    + "\n1: Barajar"
                    + "\n2: Siguiente carta"
                    + "\n3: Cartas disponibles"
                    + "\n4: Dar cartas"
                    + "\n5: Montón de cartas"
                    + "\n6: Mostrar baraja"
                    + "\n7: SALIR");
            String opc = sc.next();
            switch (opc){
                case "1": //Barajar
                    break;
                case "2"://Siguiente carta
                    break;
                case "3"://Cartas disponibles
                    break;
                case "4"://Dar cartas
                    System.out.println("\n¿Cuantas cartas deseas sacar de la baraja?");
                    int ncartassolicitadas = sc.nextInt();
                    break;
                case "5"://Montón de cartas
                    break;
                case "6"://Mostrar baraja
                    break;
                case "7"://Salir
                    System.out.printf("Gracias por Jugar!");
                    exit = true;
                    break;
            }
        }
    }
}
