package com.ugleagle;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class JavaCdiWeld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        ServiceA serviceA = container.select(ServiceA.class).get();
        serviceA.performAction();
        weld.shutdown();

        System.out.println("");
    }

}
