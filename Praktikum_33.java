/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_31;
import java.util.Scanner;

public class Praktikum_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barang, jumlahItem = 0, cashback = 0, tambahanBarang = 0;
        
        System.out.println("=========== Selamat Datang di Toko Charlie ==========");
        System.out.println("Ayo belanja di Toko Charlie dan dapatkan bonus nya.");
        System.out.println("=====================================================");
        System.out.print("Berapa barang yang Anda beli hari ini? ");
            barang = input.nextInt();
        System.out.println("=====================================================");
        
        
        if(barang > 0) {
            tambahanBarang = barang / 3;
            if(barang % 7 == 0) {
                cashback = 5500 * barang / 7;
            }
            if(barang < 0){
                System.out.println("ERROR - Inputan harus lebih dari 0");
            }
        System.out.println("Cashback: " + cashback);
        System.out.println("Tambahan Barang: " + tambahanBarang);
        System.out.println("Jumlah Barang: " + (tambahanBarang + barang));
    }
    }
}
