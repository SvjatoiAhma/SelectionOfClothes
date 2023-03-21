package main;

public class RecomendResults {
    private double simCoef;
    private String recommend;

    @Override
    public String toString() {
        return "RecomendResults{" +
                "simCoef=" + simCoef +
                ", recommend='" + recommend + '\'' +
                '}';
    }

    public double getSimCoef() {
        return simCoef;
    }

    public void setSimCoef(double simCoef) {
        this.simCoef = simCoef;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
