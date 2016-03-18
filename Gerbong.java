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
	j
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
