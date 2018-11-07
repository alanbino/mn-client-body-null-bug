package mn.client.body.nullbody.bug.test;

import io.micronaut.http.annotation.Get;

public interface TestAPI {

    @Get("/testMethod/{testString}")
    public String testMethod(String testString);
}
