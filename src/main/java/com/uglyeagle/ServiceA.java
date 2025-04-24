package com.uglyeagle;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ServiceA {

    @Inject
    private ServiceB serviceB;

    public void performAction() {
        System.out.println("ServiceA: Performing action...");
        serviceB.assistAction();
    }
}
