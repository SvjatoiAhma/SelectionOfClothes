package main;

public class ProfileRecommend {
    private Profile profile;
    private String recommend;
    private double simCoef;

    public double getSimCoef() {
        return simCoef;
    }

    public void setSimCoef(double simCoef) {
        this.simCoef = simCoef;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
