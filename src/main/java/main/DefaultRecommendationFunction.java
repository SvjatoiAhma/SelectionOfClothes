package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class DefaultRecommendationFunction {
    public double getSim(Profile profile1, Profile profile2) {
        double result = 0;

        if (profile1 == null || profile2 == null) {
            return result;
        }
        result = result + (Objects.equals(profile1.getClothes(), profile2.getClothes())?1:0);
        result = result + (Objects.equals(profile1.getFigure(), profile2.getFigure())?1:0);
        result = result + (Objects.equals(profile1.getColorType(), profile2.getColorType())?1:0);
        return result / 3;


}
    public Collection<Double> getSim1(Profile profile, Collection<Profile> profiles) {
        Collection<Double> results = new ArrayList<>();
        for (Profile pr:profiles){
            results.add(getSim(profile, pr));
        }
        return results;


    }

    public Collection<RecomendResults> getSim(Profile profile1, Collection<ProfileRecommend> profiles) {
        Collection<RecomendResults> results = new ArrayList<>();
        for (ProfileRecommend pr:profiles){
            RecomendResults recomendResults = new RecomendResults();
            recomendResults.setSimCoef(getSim(profile1, pr.getProfile()));
            recomendResults.setRecommend(pr.getRecommend());
            results.add(recomendResults);
        }
        return results;


    }
}