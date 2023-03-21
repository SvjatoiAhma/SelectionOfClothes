package appearancetype;

public class Profiles {
    private String recommend;
    private Color color;

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(final String recommend) {
        this.recommend = recommend;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "recommend='" + recommend + '\'' +
                ", color=" + color +
                '}';
    }
}
