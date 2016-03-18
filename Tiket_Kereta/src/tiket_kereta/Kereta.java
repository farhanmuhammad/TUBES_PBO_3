/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket_kereta;

/**
 *
 * @author Achmad Syafri
 */
public abstract class Kereta{
	private Gerbong[] daftarGerbong;
	private Rute[] rute;
	private String nama;
	protected int nPenumpang=0;
	protected int maxPenumpang;
	protected int nGerbong=0;
	protected int maxGerbong;
	
	
	public Kereta(String nama, int maxPenumpang , int maxGerbong){
		this.nama = nama;
		setMaxPenumpang(maxPenumpang);
		setMaxGerbong(maxGerbong);
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public int getPenumpang(){
		return this.maxPenumpang;
	}
	
	public int getGerbong () {
		return this.maxGerbong;
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public void setMaxPenumpang(int maxPenumpang){
		this.maxPenumpang=maxPenumpang;
	}
	
	public void setMaxGerbong(int maxGerbong){
		this.maxGerbong = maxGerbong;
	}
		
	public int getNPenumpang(){
		return this.nPenumpang;
	}
	
	public void addGerbong(Gerbong g){
		if(nPenumpang > maxPenumpang) {
			this.daftarGerbong[nGerbong] = g;
			nGerbong++;
		}
	}
	
	
}
	
