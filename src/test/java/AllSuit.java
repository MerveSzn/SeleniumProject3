import io.github.bonigarcia.seljup.SeleniumExtension;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@ExtendWith(SeleniumExtension.class)
@SelectClasses({

        OpenSite.class,
})
public class AllSuit {
}
