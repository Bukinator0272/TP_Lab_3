import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImportFileTest {

    @Test
    public void validationTest() throws ValidationException, FileNotFoundException {
        JSONObject jsonSchema = new JSONObject(
                new JSONTokener(new FileInputStream("schema.json")));
        JSONObject jsonObject = new JSONObject(
                new JSONTokener(new FileInputStream("Server__1063e1df-aec8-4824-87e3-79553d4ed4fd.json")));

        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonObject);
    }

}
