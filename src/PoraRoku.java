public enum PoraRoku {

    WIOSNA(15.0, true),
    JESIEN(5.0, true),
    ZIMA(0.0, true),
    LATO(25.0, false);

    private Double sredniaTEmperatura;
    private Boolean czyPadaSnieg;

    PoraRoku(Double sredniaTEmperatura, Boolean czyPadaSnieg) {
        this.sredniaTEmperatura = sredniaTEmperatura;
        this.czyPadaSnieg = czyPadaSnieg;
    }

    public Double getSredniaTEmperatura() {
        return sredniaTEmperatura;
    }

    public Boolean getCzyPadaSnieg() {
        return czyPadaSnieg;
    }


}
