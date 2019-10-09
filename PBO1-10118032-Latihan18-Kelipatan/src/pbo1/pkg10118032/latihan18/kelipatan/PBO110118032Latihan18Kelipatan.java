/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan18.kelipatan;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Menampilkan Kelipatan 3.5 sampai 35
 */
public class PBO110118032Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 3.5, b = 0;
	for (int i = 1; i <= 10; i++, b = a * i)
		System.out.println(b);  
        System.out.println("(Developed By : Guntur Maulana Ibrahim)");
    }
    
}
