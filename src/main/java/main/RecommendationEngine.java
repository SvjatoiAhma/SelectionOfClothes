package main;

import appearancetype.Clothes;
import appearancetype.ColorType;
import figure.Figure;

public class RecommendationEngine {
    public String generate(Profile profile){
        String result = "";
        if (profile.getFigure().equals(Figure.APPLE) && profile.getClothes().equals(Clothes.DRESSES)) {
            result = result + "Фигура Яблоко, платье,  силуэты: полуприлегабщее, прямое,  трапеция,  с завышенной" +
                    "\nталией, если с заниженной, напуск на бёдрах. Если по фигуре, то плотная ткань, мб строящийся, свободный силуэт." +
                    "\nЦвета для цветотипа Весна: Синий, жёлтый зелёный,  красный, синий,  розовый,  яркие, тёплые оттенки.";
        }
        if (profile.getFigure().equals(Figure.PEAR) && profile.getClothes().equals(Clothes.DRESSES)) {
            result = result + "\nДлф фигуры Груша деальным является такой фасон платья, который привлекает внимание к верхней части тела – рукам," +
                    "\nспине и груди, и отвлекает от нижней. Именно таким является платье на тонких бретельках либо с оголёнными плечами. " +
                    "\nОно визуально увеличивает маленькие плечи и подчёркивает небольшую грудь. " +
                    "\nНижняя часть у такого платья должна быть широкой, скользящей по бёдрам и плавно спускающейся вниз.";
        }
        if (profile.getFigure().equals(Figure.HOURGLASS) && profile.getClothes().equals(Clothes.JEANS) && profile.getColorType().equals(ColorType.SUMMER)) {
            result = result + "\nОсновой гардероба женщины с фигурой Песочные часы должно стать платье. Его длина может варьироваться от" +
                    " мини до длины чуть ниже колена.\nДлина плечевых изделий должна быть не ниже середины бедра, чтобы не" +
                    " создавать на бедрах ненужный объем.\nДлину брюк следует выбирать, исходя из их фасона. Прямые классические" +
                    " брюки подбираются длиной до середины каблука.\nЗауженные к низу брюки лучше всего смотрятся, если доходят " +
                    " до самого тонкого места щиколотки.\nВерхнюю одежду лучше подбирать длиной до колена либо ниже колена до уровня сапог. ";
        }

        return result;
    }


}
