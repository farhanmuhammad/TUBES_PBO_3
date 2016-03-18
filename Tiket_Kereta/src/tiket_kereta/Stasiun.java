/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket_kereta;

/**
 *
 * @author Fernando Alexsandro
 */
public class Stasiun {
    private Rute[] r = new Rute[20];
	private int jumlahRute=0;
	
	public void createRute(String asal, String tujuan){
		if(jumlahRute<3){
			r[jumlahRute]=new Rute(asal,tujuan);
			jumlahRute++;
		}
	}
	
	public void createRute(String asal, String tujuan, int maxKereta){
		if(jumlahRute<3){
			r[jumlahRute]=new Rute(asal,tujuan,maxKereta);
			jumlahRute++;
		}
	}
	
	public int getJumlahRute(){
		return this.jumlahRute;
	}
	
	/*public void KereteDatang(Kereta k){
		if(k instanceof MutiaraTimur){
			r[0].addKereta(k);
		}
		if(k instanceof LautanApi){
			r[1].addKereta(k);
		}
		if(k instanceof SheilaExpress){
			r[2].addKereta(k);
		}
	}*/
	
	public Rute getRute(int i){
		return r[i];
	}
}
