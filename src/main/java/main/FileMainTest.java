package main;

import appearancetype.ColorDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static appearancetype.RecommendationsUtil.getContent;
import static appearancetype.RecommendationsUtil.getContentFromJson;

public class FileMainTest {
    Gson gson = new GsonBuilder().registerTypeAdapter(Color.class, new ColorDeserializer())
            .create();
    String profileAsString = "{\"recommend\":\"myrecommend\", \"color\":\"red\"}";
    Profile profile = gson.fromJson(profileAsString, Profile.class);

    public static void main(String[] args) throws IOException {
        File file = new File("Recommend.txt");
        List<String> list = getContent(file);
        for (String line : list) {
            String[] lineAr = line.split(":");
            System.out.println(lineAr[0]);
        }
        Profile profile = getContentFromJson(new File("Profile.json"));
        System.out.println(profile.getFigure());
    }
		System.out.println(profile);
}
