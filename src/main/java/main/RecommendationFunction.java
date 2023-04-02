package main;

import java.util.ArrayList;
import java.util.Collection;

public interface RecommendationFunction {

     double getSim(Profile profile1, Profile profile2);

     default Collection<RecommendResults> getSim(Profile profile1, Collection<ProfileRecommend> profiles) {
        Collection<RecommendResults> results = new ArrayList<>();
        for (ProfileRecommend pr:profiles){
            RecommendResults recomendResults = new RecommendResults();
            recomendResults.setSimCoef(getSim(profile1, pr.getProfile()));
            recomendResults.setRecommend(pr.getRecommend());
            results.add(recomendResults);
        }
        return results;


    }
}

