package Exercise2;

import java.util.Arrays;

public class Sim {
    //definizioni
    private String numeroTelefono;
    private double creditoResiduo;
    private Chiamata[] ultimeChiamate;

    //costruttore
    public Sim(String numeroTelefono, double creditoResiduo){
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0;
        this.ultimeChiamate = new Chiamata[5];
    }

    //metodo
    public Sim chiama(String numeroChiamata, int secondi){
        Chiamata call = new Chiamata(numeroChiamata,secondi);
        this.ultimeChiamate[4] = this.ultimeChiamate[3];
        this.ultimeChiamate[3] = this.ultimeChiamate[2];
        this.ultimeChiamate[2] = this.ultimeChiamate[1];
        this.ultimeChiamate[1] = this.ultimeChiamate[0];
        this.ultimeChiamate[0] = call;
        return this;
    }

    @Override
    public String toString() {
        return "Sim{" +
            "numeroTelefono='" + numeroTelefono + '\'' +
            ", creditoResiduo=" + creditoResiduo + " €" +
            ", ultimeChiamate=" + Arrays.toString(ultimeChiamate) +
            '}';
    }
}
