package main;

import appearancetype.Clothes;
import appearancetype.ColorType;
import figure.Figure;

public class StartMain {
    public static void main(String[] args) {
        Profile profile = new Profile();

        profile.setFigure(Figure.APPLE);
        profile.setClothes(Clothes.DRESSES);
        profile.setColorType(ColorType.SPRING);
        RecommendationEngine recommendationEngine = new RecommendationEngine();
        String recommend = recommendationEngine.generate(profile);
        System.out.println(recommend);

        profile.setFigure(Figure.PEAR);
        profile.setColorType(ColorType.WINTER); // если убрать ColorType то исполнится первый блок условия поэтому этот способ нужно убирать
        recommend = recommendationEngine.generate(profile);
        System.out.println(recommend);

        profile.setFigure(Figure.HOURGLASS);
        profile.setClothes(Clothes.JEANS);
        profile.setColorType(ColorType.SUMMER);
        recommend = recommendationEngine.generate(profile);
        System.out.println(recommend);

    }
}
