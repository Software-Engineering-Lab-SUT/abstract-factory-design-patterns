package edu.sharif.ce.design_patterns.factories;

import edu.sharif.ce.design_patterns.Laptops.AppleLaptop;
import edu.sharif.ce.design_patterns.Laptops.Laptop;
import edu.sharif.ce.design_patterns.Mobiles.AppleMobile;
import edu.sharif.ce.design_patterns.Mobiles.Mobile;

public class AppleFactory implements Factory {
    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }

    @Override
    public Mobile createMobile() {
        return new AppleMobile();
    }
}
