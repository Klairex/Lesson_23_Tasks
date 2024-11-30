public class Automobil implements Comparable<Automobil> {

    private int anProducere;
    private String denumire;


    public Automobil(int anProducere, String denumire) {
        this.anProducere = anProducere;
        this.denumire = denumire;
    }


    public int getAnProducere() {
        return anProducere;
    }


    public String getDenumire() {
        return denumire;
    }

    @Override
    public int compareTo(Automobil other) {
        return Integer.compare(this.anProducere, other.anProducere);
    }

    @Override
    public String toString() {
        return "Automobil : \nAn producere = " + anProducere + "\nDenumire = " + denumire;
    }
}
