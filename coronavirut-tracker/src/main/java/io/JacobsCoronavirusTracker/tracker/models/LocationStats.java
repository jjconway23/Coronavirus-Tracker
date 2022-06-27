package io.JacobsCoronavirusTracker.tracker.models;

public class LocationStats {
    private String state;
    private String country;
    private String latestTotal;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestTotal() {
        return latestTotal;
    }

    public void setLatestTotal(String latestTotal) {
        this.latestTotal = latestTotal;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotal=" + latestTotal +
                '}';
    }
}
