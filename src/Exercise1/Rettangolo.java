package Exercise1;

public class Rettangolo {
    //definizioni
    private double base;
    private double altezza;

    //costruttore
    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    //metodi
    public double calcolaArea(){
        return  base*altezza;
    }
    public double calcolaPerimetro(){
        return (base+altezza)*2;
    }



}
