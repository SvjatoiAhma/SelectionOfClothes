package appearancetype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import figure.Figure;
import figure.FigureDeserializer;
import main.Profile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class RecommendationsUtil {

    private RecommendationsUtil() {
    }

    public static List<String> getContent(File file) throws IOException {
       return Files.readAllLines(Paths.get(file.getAbsolutePath()));
    }
    public static String getContentLine(File file) throws IOException {
        return Files.readString(Paths.get(file.getAbsolutePath()));
    }
    public static List<Profile> getContentFromJson(File file) throws IOException {
        Gson gson = new GsonBuilder().registerTypeAdapter(ColorType.class, new ColorTypeDeserializer())
                .registerTypeAdapter(Figure.class, new FigureDeserializer())
                .registerTypeAdapter(Clothes.class, new ClothesDeserializer())
                .create();
        String fileCont = getContentLine(file);
        Type listOfMyClassObject = new TypeToken<ArrayList<Profile>>() {}.getType();
        return gson.fromJson(fileCont, listOfMyClassObject);
    }
}
