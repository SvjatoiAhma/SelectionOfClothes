package appearancetype;

import com.google.gson.Gson;
import main.Profile;
import main.StartMainRecommend;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    public static Profile getContentFromJson(File file) throws IOException {
        Gson gson = new Gson();
        String fileCont = getContentLine(file);
        return gson.fromJson(fileCont, Profile.class);
    }
}
