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
public class Gerbong {
	private int nomorGerbong;
	private int maxGerbong;
	private int bebanGerbong;
	private int nPenumpang=0;
	
	public Gerbong(int nomorGerbong){
		setNomor(nomorGerbong);
	}
	
	public Gerbong(int nomorGerbong, int maxGerbong) {
		setNomor(nomorGerbong);
		setMaxGerbong(maxGerbong);
		
	}
	
	public int getNomor(){
		return nomorGerbong;
	}
	
	public int getMaxGerbong(){
		return maxGerbong;
	}
	
	public void setNomor(int nomorGerbong){
		this.nomorGerbong=nomorGerbong;
	}
	
	public void setMaxGerbong(int maxGerbong){
		this.maxGerbong=maxGerbong;
	}
	
	public int getBebanGerbong(){
		return this.bebanGerbong;
	}
	
	public int getNPenumpang(){
		return this.nPenumpang;
	}
}
