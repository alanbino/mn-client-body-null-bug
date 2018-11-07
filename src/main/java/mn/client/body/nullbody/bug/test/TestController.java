package mn.client.body.nullbody.bug.test;

import io.micronaut.http.annotation.Controller;

@Controller("/test")
public class TestController implements TestAPI {

    @Override
    public String testMethod(String testString) {
        return "SUCCESS - RECEIVED "+testString;
    }
}
