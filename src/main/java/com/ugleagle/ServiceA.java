package com.ugleagle;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class ServiceA {

    @Inject
    private ServiceB serviceB;

    public void performAction() {
        System.out.println("ServiceA: Performing action...");
        serviceB.assistAction();
    }
}
