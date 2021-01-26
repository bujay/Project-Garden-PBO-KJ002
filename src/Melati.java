/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
public class Melati extends Plant{
    private String jenis;
    
    Melati(){
        super();
        jenis = "Melati";
    }
    
    public void cekKondisiTumbuh(){
        if (getJumlahAir() >= 3 && getJumlahPupuk() >= 2){
            tumbuh();
        }
    }
    
    public void tumbuh(){
        if (getStatusTumbuh()< 4){
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }
    
    public String getJenis(){
        return jenis;
    }
}
