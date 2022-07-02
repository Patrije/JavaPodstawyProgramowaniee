public enum PoryRoku {
    WIOSNA(15.0,false),
    LATO(27.0,false),
    JESIEN(8.0,false),
    ZIMA(0.0,true);

    private Double sredniaTemperatura;
    private boolean czyPadaSnieg;

    PoryRoku(Double sredniaTemperatura, boolean czyPadaSnieg) {
        this.sredniaTemperatura = sredniaTemperatura;
        this.czyPadaSnieg = czyPadaSnieg;
    }

    public Double getSredniaTemperatura() {
        return sredniaTemperatura;
    }

    public void setSredniaTemperatura(Double sredniaTemperatura) {
        this.sredniaTemperatura = sredniaTemperatura;
    }

    public boolean isCzyPadaSnieg() {
        return czyPadaSnieg;
    }

    public void setCzyPadaSnieg(boolean czyPadaSnieg) {
        this.czyPadaSnieg = czyPadaSnieg;
    }
}
