/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoperapp;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 *
 * @author Luke
 */
public class StoperApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aby rozpocząć odliczanie wciśnij enter.");
        sc.nextLine();

            Instant lt = Instant.now();

        
        System.out.println("Aby zakończyć odliczanie wciśnij enter.");
            sc.nextLine();
            Instant lt2 = Instant.now();

        
        Duration dur = Duration.between(lt, lt2);
        System.out.println("Upłynęło " + dur.getSeconds());
    }
    
}
