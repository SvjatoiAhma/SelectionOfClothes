package figure;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import figure.Figure;

import java.lang.reflect.Type;

public class FigureDeserializer implements JsonDeserializer<Figure> {
    @Override
    public Figure deserialize(JsonElement json, Type typeOfT,
                              JsonDeserializationContext context) {
        try {
            return Figure.getById(json.getAsString());
        } catch (Exception e) {
            throw new JsonParseException(e);
        }
    }
}
