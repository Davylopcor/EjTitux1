package com.mycompany.porrasfutboll;

import java.util.Collections;
import static java.util.Collections.list;
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
    public static void main(String[] args) {
        
    }
    
    public static void barajar() {
        Collections.shuffle(carta);
        System.out.println("¡Barajado!");
    }
    
    public int cartasDisponibles() {
        return carta.size();
    }
}
