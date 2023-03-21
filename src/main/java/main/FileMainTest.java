package main;

import appearancetype.RecommendationsUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static appearancetype.RecommendationsUtil.*;

public class FileMainTest {
    public static void main(String[] args) throws IOException {
        File file = new File("Recommend.txt");
        List<String> list = getContent(file);
        for (String line:list ){
            String [] lineAr = line.split(":");
            System.out.println(lineAr[0]);
        }
        Profile profile = getContentFromJson(new File("Profile.json"));
        System.out.println(profile.getFigure());
    }
}
