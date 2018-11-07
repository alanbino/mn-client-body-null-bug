package mn.client.body.nullbody.bug;

import io.micronaut.http.client.Client;
import mn.client.body.nullbody.bug.test.TestAPI;

@Client("/test")
public interface TestClient extends TestAPI {

// *************************************************
// **** TEST WILL WORK WHEN THIS IS UNCOMMENTED ****

//    @Override
//    public String testMethod(String testString);

}
