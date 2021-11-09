package edu.sharif.ce.design_patterns.factories;

import edu.sharif.ce.design_patterns.Laptops.Laptop;
import edu.sharif.ce.design_patterns.Mobiles.Mobile;

public class LenovoFactory implements Factory {
    @Override
    public Laptop createLaptop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Mobile createMobile() {
        throw new UnsupportedOperationException();
    }
}
