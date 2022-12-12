/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fak;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Fak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri=new Scanner (System.in);
        int toplam=1, sayac=1;
        System.out.print("Faktöriyelini istediğiniz sayıyı giriniz:");
        double x=veri.nextDouble();
        for(;sayac<=x;++sayac){
            toplam*=sayac;
            }
        System.out.println(x+" sayısının faktöriyeli="+toplam+" 'dır.");
    }
    
}
