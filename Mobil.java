package praktikum3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getWarna(){
        return warna;
    }
    public void getWarna(String warna){
        this.warna=warna;
    }
    void info() {
        System.out.println("merk" + getMerk()+ " " + "model"+ getModel()+ " " + "tahun " + getTahun()+ " " + "warna"+ getWarna());
    }
}
