package figure;

public enum Figure implements HaveName {

    APPLE("APPLE", "Яблоко"),
    PEAR("PEAR", "Груша"),
    RECTANGLE("RECTANGLE", "Треугольник"),
    HOURGLASS("HOURGLASS", "Песочные часы"),
    INVERTEDTRIANGLE("INVERTEDTRIANGLE", "Перевернутый треугольник");

    String id;
    String name;


    Figure(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public static Figure getById(String id) throws Exception {
        for (Figure figure : values()) {
            if (figure.id.equalsIgnoreCase(id)) {
                return figure;
            }
        }
        throw new Exception(" id " + id + " not found. ");
    }

    @Override
    public String getName() {
        return name;
    }
}
