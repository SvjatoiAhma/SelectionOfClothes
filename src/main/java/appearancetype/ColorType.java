package appearancetype;

import figure.HaveName;

public enum ColorType implements HaveName {
    WINTER("Winter", "Зима"),
    SPRING("Spring", "Весна"),

    SUMMER("Summer", "Лето"),
    AUTUMN("Autumn", "Осень");

    String id;
    String name;

    ColorType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ColorType getById(String id) throws ColorTypeException {
        for (ColorType colorType : values()) {
            if (colorType.id.equalsIgnoreCase(id)) {
                return colorType;
            }
        }
        throw new ColorTypeException(" id " + id + " не найден. ");
    }

    @Override
    public String getName() {
        return name;
    }
}
