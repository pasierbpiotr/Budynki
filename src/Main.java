public class Main {
    public static void main(String[] args) {
        Pomieszczenie[] mojePomieszczenie = new Pomieszczenie() {
            {
                this.szerokosc = 3;
                this.dlugosc = 2;
                this.nazwa = "pokoj";
            }
        },
        new Pomieszczenie() {
            {
                szerokosc = 2;
                dlugosc = 2;
                nazwa = "lazienka";
            }
        }
    };

    Mieszkanie mojeMieszkanie = new Mieszkanie() {
        {
            ElementPietra[] mojeElementyParteru = {
                    mojeMieszkanie,
                    new Pomieszczenie() {
                        {
                            szerokosc = 2;
                            dlugosc = 2;
                            nazwa = "lazienka";
                        }
                    }
            };

            Pietro[] mojePietra = {
                    new Pietro() {
                        {
                            numerPietra = 0;
                            elementy = mojeElementyParteru;
                        }
                    }
            };

            Garaz[] mojeGaraze = {
                    {
                        szerokoscBramy = 3;
                        wysokoscBramy = 2;
                        szerokosc = 5;
                        dlugosc = 5;
                    }
            }
        };

        Budynek
    }
}
