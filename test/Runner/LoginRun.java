/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Runner;

/**
 *
 * @author sudar
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "classpath:test"
)

public class LoginRun {
    
}
