public enum Month {
    JANUARY(31, false, Seasons.ZIMA),
    FEBRUARY(28, true, Seasons.ZIMA),
    MARCH(31, false, Seasons.WIOSNA),
    APRIL(30, true, Seasons.WIOSNA),
    MAY(31, false, Seasons.WIOSNA),
    JUNE(30, true,Seasons.LATO),
    JULY(31, false,Seasons.LATO),
    AUGUST(31, true, Seasons.LATO),
    SEPTEMBER(30,false, Seasons.JESIEN),
    OCTOBER(31,true, Seasons.JESIEN),
    NOVEMBER(30, false, Seasons.JESIEN),
    DECEMBER(31,true, Seasons.ZIMA)
    ;

    private Integer howManyDays;
    private Boolean itIsEvenMonth;
    private Seasons seasons;

    Month(Integer howManyDays, Boolean itIsEvenMonth, Seasons seasons) {
        this.howManyDays = howManyDays;
        this.itIsEvenMonth = itIsEvenMonth;
        this.seasons = seasons;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public Integer getHowManyDays() {
        return howManyDays;
    }

    public Boolean getItIsEvenMonth() {
        return itIsEvenMonth;
    }

}
