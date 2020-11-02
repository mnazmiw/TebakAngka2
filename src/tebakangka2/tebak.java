/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;

/**
 *
 * @author azmig
 */

/*Import Library*/
import java.util.Scanner;
import java.util.Random;

public class tebak {
    /*Membuat Atribut*/
    int angka;
    int tebakan;
    int skor;
    int percobaan;
    
    /*Membuat Method(s)*/
    void jawab(){
        /*Instansiasi object dari lib scanner dan random*/
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        angka = ran.nextInt(101);
        tebakan = 0;
        skor = 100;
        percobaan = 1;
        System.out.println("Hai, program ini telah memilih satu angka acak dari 1 sampai 100.");
        System.out.println("Skor awal anda adalah 100. Jika anda salah menebak, skor anda akan dikurangi 2 poin. Skor minus tidak diperbolehkan.");
        System.out.println("Jika anda dapat menebak tidak lebih dari 5 kali percobaan, anda akan mendapat bonus 50 poin.");
        System.out.println("Selamat mencoba!");
        do {
            if (skor == -2){
                break;
            }
            System.out.println("Masukkan tebakan anda:");
            tebakan = input.nextInt();
            if (tebakan == angka) {
                System.out.println("Yeay tebakan anda benar, terimakasih telah bermain");
                if (percobaan <= 5){
                    System.out.println("Anda berhasil menebak tidak lebih dari 5 percobaan sehingga mendapatkan bonus 50 poin.");
                    System.out.println("Skor anda adalah:" + (skor+50));
                }
                else{
                    System.out.println("Skor anda adalah:" + skor);
                }
                break;
            }
            else{
                if (tebakan < angka){
                    System.out.println("Tebakan anda lebih kecil dari angka yang telah di acak. Silahkan tebak ulang!");
                    skor -= 2;
                    percobaan += 1;
                    System.out.println("Sisa skor anda adalah:" + skor);
                }
                else if (tebakan > angka){
                    System.out.println("Tebakan anda lebih besar dari angka yang telah di acak. Silahkan tebak ulang!");
                    skor -= 2;
                    percobaan += 1;
                    System.out.println("Sisa skor anda adalah:" + skor);
                }
            }
        } while (tebakan != angka);
        
    }
}