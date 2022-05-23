public class Garaz extends Pomieszczenie {
    int szerokoscBramy, wysokoscBramy;

    public int getSzerokoscBramy() {
        return szerokoscBramy;
    }

    public void setSzerokoscBramy(int szerokoscBramy) {
        this.szerokoscBramy = szerokoscBramy;
    }

    public int getWysokoscBramy() {
        return wysokoscBramy;
    }

    public void setWysokoscBramy(int wysokoscBramy) {
        this.wysokoscBramy = wysokoscBramy;
    }

    public Garaz() {
        this.szerokoscBramy = szerokoscBramy;
        this.wysokoscBramy = wysokoscBramy;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }
}
