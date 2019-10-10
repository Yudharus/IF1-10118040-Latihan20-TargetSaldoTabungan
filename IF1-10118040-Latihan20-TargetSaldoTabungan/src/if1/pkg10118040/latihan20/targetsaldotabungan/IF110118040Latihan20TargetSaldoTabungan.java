/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan20.targetsaldotabungan;

/**
 *
 * @author asus
 * Nama                 : Moch Yudha Rusdian
 * Nim                  : 10118040  
 * Kelas                : IF-1
 * Deskripsi Program	: perkiraan mencapai saldo target
 */
public class IF110118040Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 3500000, saldoTarget = 6000000, saldoSekarang = saldoAwal,  bunga = 0.08;
		int bulanKe = 1;
		do {
			saldoSekarang += saldoSekarang * bunga; 
			System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n", bulanKe, saldoSekarang);
			//System.out.println("Saldo di bulan ke-" + bulanKe + " Rp. " + saldoSekarang);
			bulanKe++;
		} while (saldoSekarang < saldoTarget);
    }
    
}
