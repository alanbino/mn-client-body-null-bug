package mn.client.body.nullbody.bug.test;

import io.micronaut.http.annotation.Controller;

import java.util.ArrayList;
import java.util.Date;

@Controller("/test")
public class TestController implements TestAPI {

    @Override
    public DataCode testMethod() {

        ArrayList<DataLabel> labels = new ArrayList<>();
        labels.add(new DataLabel("ALID1", "en-IE", "IE-LABEL", new Date(), new Date()));
        DataCode newCode = new DataCode("AID", "ACODE", "ADK", "ADT", "ATID",
                "ALID", 0, false, labels,
                new ArrayList<>(), new Date(), new Date(), null);
        return newCode;
    }
}
