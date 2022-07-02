public enum Seasons {

    SPRING (17.5, true),
    SUMMER( 29.3, false),
    AUTUMN(19.8, false),
    WINTER(2.0, true);

    private Double averageTemp;
    private Boolean isSnowing;

    Seasons(Double averageTemp, Boolean isSnowing) {
        this.averageTemp = averageTemp;
        this.isSnowing = isSnowing;
    }

    public Double getAverageTemp() {
        return averageTemp;
    }

    public Boolean getSnowing() {
        return isSnowing;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "averageTemp=" + averageTemp +
                ", isSnowing=" + isSnowing +
                '}';
    }
}
