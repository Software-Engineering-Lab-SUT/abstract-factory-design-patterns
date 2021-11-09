package edu.sharif.ce.design_patterns;

import edu.sharif.ce.design_patterns.factories.AppleFactory;
import edu.sharif.ce.design_patterns.factories.LenovoFactory;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    @Test
    public void getAppleLaptopOsTest() {
        var appleFactory = new AppleFactory();
        var application = new Application(appleFactory);
        Assert.assertEquals("macOS", application.getLaptopOs());
    }

    @Test
    public void getAppleMobileOsTest() {
        var appleFactory = new AppleFactory();
        var application = new Application(appleFactory);
        Assert.assertEquals("iOS", application.getMobileOs());
    }

    @Test
    public void getLenovoLaptopOsTest() {
        var lenovoFactory = new LenovoFactory();
        var application = new Application(lenovoFactory);
        Assert.assertEquals("Windows", application.getLaptopOs());
    }

    @Test
    public void getLenovoMobileOsTest() {
        var lenovoFactory = new LenovoFactory();
        var application = new Application(lenovoFactory);
        Assert.assertEquals("Android", application.getMobileOs());
    }
}
