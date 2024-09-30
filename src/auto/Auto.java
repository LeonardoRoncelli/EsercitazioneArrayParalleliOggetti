package auto;
public class Auto {
    private String marca;
    private String modello;
    private double prezzo;
    public Auto(){
        marca=null;
        modello=null;
        prezzo=0;
    }
    public Auto(String auto1){
        marca=auto1;
        modello=null;
        prezzo=0;
    }
    public Auto(double prezzo1){
        marca=null;
        modello=null;
        prezzo=prezzo1;
    }
    public Auto(String marca1,double prezzo1){
        marca=marca1;
        modello=null;
        prezzo=prezzo1;
    }
    public Auto(double prezzo1,String modello1){
        marca=null;
        modello=modello1;
        prezzo=prezzo1;
    }
    public void setMarca (String marca1){
        marca=marca1;
    }
    public void setModello(String modello1){
        modello=modello1;
    }
    public void setPrezzo(double prezzo1){
        prezzo=prezzo1;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public double getPrezzo(){
        return prezzo;
    }
}
