public enum Seasons {
    WIOSNA(15.0,true),
    LATO(25d, false),
    JESIEN(5.0, true),
    ZIMA(0.0, true);

    private Double averageTemp;
    private Boolean isSnowing;


    public Double getAverageTemp() {
        return averageTemp;
    }

    public Boolean getSnowing() {
        return isSnowing;
    }

    Seasons(Double averageTemp, Boolean isSnowing) {
        this.averageTemp = averageTemp;
        this.isSnowing = isSnowing;

    }
}
