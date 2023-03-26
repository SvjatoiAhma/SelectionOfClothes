package appearancetype;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class ColorTypeDeserializer implements JsonDeserializer<ColorType> {
    @Override
    public ColorType deserialize(JsonElement json, Type typeOfT,
                             JsonDeserializationContext context) {
        try {
            return ColorType.getById(json.getAsString());
        } catch (Exception e) {
            throw new JsonParseException(e);
        }
    }
}
