package figure;

import appearancetype.Clothes;
import appearancetype.ColorType;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class ClothesDeserializer implements JsonDeserializer<Clothes> {
    @Override
    public Clothes deserialize(JsonElement json, Type typeOfT,
                                 JsonDeserializationContext context) {
        try {
            return Clothes.getById(json.getAsString());
        } catch (Exception e) {
            throw new JsonParseException(e);
        }
    }
}
