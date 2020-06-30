package io.dev.coronatracker.models;

public class LocationStats {

    private String city;
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDav;

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public int getDiffFromPrevDav() {
        return diffFromPrevDav;
    }

    public void setDiffFromPrevDav(int diffFromPrevDav) {
        this.diffFromPrevDav = diffFromPrevDav;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "city='" + city + '\'' +
                "state='" + state + '\'' +
                ", country=''" + country + '\'' + 
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }

}