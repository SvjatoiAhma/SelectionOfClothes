package main;

import appearancetype.ColorType;
import figure.Figure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StartMainRecommend {
    public static void main(String[] args) {
        try {
            Profile profileTest = new Profile();
            profileTest.setColorType(ColorType.getById("WINTER")); // заменил setFigure
            ColorType colorTypeWinter = ColorType.getById("WITER");    // замена


            ProfileRecommend profileRecommend1 = new ProfileRecommend();
            profileRecommend1.setRecommend("Фигура яблоко, платье,  силуэты: полуприлегабщее, прямое,  трапеция,  с завышенной" +
                    " талией, если с заниженной, напуск на бёдрах.\nЕсли по фигуре, то плотная ткань, мб строящийся, свободный силуэт." +
                    "\nЦвета для цветотипа Весна: " +
                    "\nСиний, жёлтый зелёный,  красный, синий,  розовый,  яркие, тёплые оттенки.");

            Profile profile1 = new Profile();
            profileRecommend1.setProfile(profile1);
            profile1.setFigure(Figure.APPLE);

            ProfileRecommend profileRecommend2 = new ProfileRecommend();

            Profile profileTest2 = new Profile();
            profileTest2.setFigure(Figure.PEAR);
            profileRecommend2.setRecommend("Hello");
            profileRecommend2.setProfile(profileTest2);


            RecommendationFunction recommendationFunction = new RecommendationFunction();
            double result = recommendationFunction.getSim(profileTest, profile1);
            System.out.println(result);
            Collection<RecomendResults> results = recommendationFunction.getSim(profileTest, Arrays.asList(profileRecommend1, profileRecommend2));
            System.out.println(results);

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
