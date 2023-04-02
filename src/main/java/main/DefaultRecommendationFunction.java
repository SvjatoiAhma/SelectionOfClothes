package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class DefaultRecommendationFunction implements RecommendationFunction {

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

}