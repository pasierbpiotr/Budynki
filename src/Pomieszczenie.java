public class Pomieszczenie {
    int szerokosc, dlugosc;
    String nazwa;

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Pomieszczenie() {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.nazwa = nazwa;
    }
}
