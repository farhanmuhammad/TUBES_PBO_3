/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket_kereta;

/**
 *
 * @author muhammad farhan
 */
public class Tiket_Kereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Kereta k = new Kereta("Zoela",100,10);
		Tiket t = new Tiket("1301142403",14,"Business");
		Rute r = new Rute("Jakarta","Bandung");
		
                
		System.out.println("Daftar Kereta : ");
		System.out.println("Nama Kereta : "+k.getNama());
		System.out.println("Penumpang : "+k.getPenumpang());
		System.out.println("Gerbong : "+k.getGerbong());
		System.out.println(" ");
		System.out.println("Daftar Penumpang : ");
		System.out.println("Id Penumpang : "+t.getidPembeli());
		System.out.println("No Duduk : "+t.getNoDuduk());
		System.out.println("Kelas : "+t.getKelas());
		System.out.println("Rute : "+r.getRute());
    }
    
}
