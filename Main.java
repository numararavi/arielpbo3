/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[]args){
       Mobil mobilariel = new Mobil(" raize", " ceper",  2023,"putih");
       Mobil mobilmanda = new Mobil(" Pajero", " Dakar",  2022," metalic");
       
       System.out.println("Info mobilariel");
       mobilariel.info();
       
       System.out.println("\nInfo mobilmanda");
       mobilmanda.info();
    }
}
