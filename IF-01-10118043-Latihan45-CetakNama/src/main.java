
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ulang;
        String nama;
        Printer p = new Printer();
        Scanner input = new Scanner(System.in);
        System.out.println("Judu");
        System.out.println("----");
        System.out.println("Masukan Nama Anda\t: ");       
            nama = input.nextLine();
            p.setNama(nama);
        System.out.println("Ulang Cetakan\t\t: ");    
            ulang = input.nextInt();
            p.setJmlCetak(ulang);
            
            p.cetak(ulang, nama);
    }
    
}
