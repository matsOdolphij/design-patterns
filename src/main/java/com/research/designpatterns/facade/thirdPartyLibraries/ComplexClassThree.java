package com.research.designpatterns.facade.thirdPartyLibraries;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComplexClassThree {

    public void performDifficultCalculation() {
        log.atInfo().log("Perform difficult calculation");
    }

    public void performComplexCalculation() {
        log.atInfo().log("perform complex calculation");
    }
}
