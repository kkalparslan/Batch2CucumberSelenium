package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports.html",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/krafttech/step_definitions",
        dryRun = false,  //dryRun'ın default değeri false..features a undefined bir scienario eklendiği
                         //zaman o seneryo ya ait cucumber ihtiyaç olan methodu oluşturuyor. sadece bu
                         //tanımsız senaryoyu yürütmek için dryRun=true olmalıdır..
        tags = "@rerunWith"  // tags de "@...and not @..." yapılırsa ilk tag çalışırken ikinci
                         // tag e sahip olanları yürütmüyor

)

public class CukesRunner {


}
