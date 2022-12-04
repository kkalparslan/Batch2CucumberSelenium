package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/krafttech/step_definitions",
        dryRun = false,  //dryRun'ın default değeri false..features a undefined bir scienario eklendiği
                         //zaman o seneryo ya ait cucumber ihtiyaç olan methodu oluşturuyor. sadece bu
                         //tanımsız senaryoyu yürütmek için dryRun=true olmalıdır..
        tags = "@navigation"

)

public class CukesRunner {

}
