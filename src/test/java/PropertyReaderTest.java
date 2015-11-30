import com.epam.properyreaders.apacheproperty.ApacheReader;
import com.epam.properyreaders.groovyproprty.GroovyReader;
import com.epam.properyreaders.nproprety.NPropertyReader;
import com.epam.properyreaders.standard.StandardReader;
import com.epam.properyreaders.yandexpropery.YandexReader;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Olha_Yeremenko on 29.11.2015.
 */
public class PropertyReaderTest {

    @Test
    public void testStandardPropertyReader() {
          String expected = StandardReader.getProperty("category.computer");
          assertTrue("Test failed because of not equaled content! ", expected.equals("computer"));
    }
    @Test
    public void testNPropertyReader() {
        String expected = new NPropertyReader().getElectronics();
        assertTrue("electronics".equals(expected));
    }

    @Test
    public void testGroovyPropertyReader() {
        System.setProperty("data", "electronics");
        String expected = GroovyReader.load("data.electronics.value");
        assertTrue("electronics".equals(expected));
    }

    @Test
    public void testYandexPropertyReader(){
        String expectedElectronics= YandexReader.load().getElectronics();
        assertTrue("electronics".equals(expectedElectronics));
        String expectedCategoryComputer= YandexReader.load().getCategoryComputer();
        assertTrue("computer".equals(expectedCategoryComputer));
    }

    @Test
    public void testApachePropertyReader() {
        String expectedCategoryComputer= ApacheReader.load("computer");
        assertTrue("computer".equals(expectedCategoryComputer));
    }
}
