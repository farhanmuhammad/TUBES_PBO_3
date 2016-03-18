/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhammad farhan
 */
public class Tiket { 
    private String idPembeli;
    private Rute[] rute;
    private int nTiket;
    private int maxTiket=100;
    private int noDuduk;
    private String kelas;
    
    public Tiket(String idPembeli,int noDuduk, String Kelas,String asal, String tujuan)
    {
        this.idPembeli=idPembeli;
        this.noDuduk=noDuduk;
        this.kelas=Kelas;
		Rute r = new Rute(asal,tujuan);
    }


    public void setNoDuduk(int noDuduk){
        this.noDuduk= noDuduk;

}
    public int getNoDuduk(){
        return noDuduk;
    }
    
    public void setidPembeli (String idPembeli){
        this.idPembeli=idPembeli;
    }
    
    public String getidPembeli(){
        return idPembeli;
}
    public void removeTiket(String n){
		if (this.idPembeli == n) {
			nTiket--;
		} else
		{
			System.out.println("Tiket Yang ingin dihapus tidak ketemu");
		}
	}
	
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getKelas(){
        return kelas;
}
}
