public enum DniWMiesiacu {
    STYCZEN(31),
    LUTY(28),
    MARZEC(31),
    KWIECIEN(30),
    MAJ(31),
    CZERWIEC(30),
    LIPIEC(31),
    SIERPIEN(31),
    WRZESIEN(30),
    PAZDZIERNIK(31),
    LISTOPAD(30),
    GRUDZIEN(31);

    private double theDays;

    DniWMiesiacu(double theDays) {
        this.theDays = theDays;
    }

    public double getTheDays() {
        return theDays;
    }

}
