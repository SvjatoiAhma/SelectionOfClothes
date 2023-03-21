package appearancetype;

public enum Color {
    RED("red"),
    WHITE("white");
    String name;

    Color(String name) {
        this.name = name;

    }
    public static Color getByName(String name){
        for (Color color: values()){
            if(color.name.equalsIgnoreCase(name)){
                return color;
            }
        }
        throw  new IllegalArgumentException("Color with name="+name+" is not exists.");
    }
}
