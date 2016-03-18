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
public class Rute {
    private String asal;
	private String tujuan;
	private int maxKereta;
	private int nKereta=0;
	private Kereta[] k;
	
	public Rute(String asal, String tujuan){
		this.asal = asal;
		this.tujuan = tujuan;
		k=new Kereta[5];
		maxKereta=5;
	}
	
	public String getRute(){
		return this.asal+"-"+this.tujuan;
	}
	
	public Rute(String asal,String tujuan, int maxKereta){
		this.asal = asal;
		this.tujuan = tujuan;
		this.maxKereta=maxKereta;
		k=new Kereta[maxKereta];
		
	}
	
	public void addKereta(Kereta k){
		if(nKereta<maxKereta){
			this.k[nKereta]=k;
			nKereta++;
		}
	}
	
	public int getJumlahKereta(){
		return this.nKereta;
	}
	
	public Kereta getKereta(int i){
		return k[i];
	}
	
	public String getAsal() {
		return this.asal;
	}
	
	public String getTujuan() {
		return this.tujuan;
	}
}
