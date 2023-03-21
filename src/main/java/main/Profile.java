package main;

import appearancetype.Clothes;
import appearancetype.ColorType;
import figure.Figure;

public class Profile {
    public static int getValue(){
        return 0;
    }
    private ColorType colorType;
    private Figure figure;
    private Clothes clothes;

    public Clothes getClothes() { return clothes; }

    public void setClothes(Clothes clothes) { this.clothes = clothes; }

    public ColorType getColorType() {
        return colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

}
