package appearancetype;

import figure.HaveName;

public enum Clothes implements HaveName {
    OUTERWEAR("OUTERWEAR", "Верхняя одежда"),
    DRESSES("DRESSES", "Платья"),
    SHIRTS_AND_TOPSTSHIRTS("SHIRTS_AND_TOPSTSHIRTS", " Футболки и топы"),
    HOODIES_JACKETS_SWEATSHIRTS("HOODIES_JACKETS_SWEATSHIRTS", "Верхняя одежда"),
    SKIRTS("SKIRTS", "Верхняя одежда"),
    TROUSERS("TROUSERS", "Верхняя одежда"),
    SHORTS("SHORTS", "Верхняя одежда"),
    JEANS("JEANS", "Верхняя одежда");

    String id;
    String name;

    Clothes(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public static Clothes getById(String id) throws Exception {
        for (Clothes clothes : values()) {
            if (clothes.id.equalsIgnoreCase(id)) {
                return clothes;
            }
        }
        throw new Exception(" id " + id + " не найден. ");
    }

    @Override
    public String getName() {
        return name;
    }
}
