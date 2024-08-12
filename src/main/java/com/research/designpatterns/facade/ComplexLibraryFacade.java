package com.research.designpatterns.facade;

import com.research.designpatterns.facade.thirdPartyLibraries.ComplexClassOne;
import com.research.designpatterns.facade.thirdPartyLibraries.ComplexClassThree;
import com.research.designpatterns.facade.thirdPartyLibraries.ComplexClassTwo;

/**
 * This facade is nothing more than a simple interface for a (complex) third party library.
 * In this case it provides only the performComplexCalculation method which the client needs.
 * Everything else is left out.
 */
public class ComplexLibraryFacade {

    private final ComplexClassOne complexClassOne = new ComplexClassOne();
    private final ComplexClassTwo complexClassTwo = new ComplexClassTwo();
    private final ComplexClassThree complexClassThree = new ComplexClassThree();

    /**
     *
     */
    public void performSomeComplexCalculation() {
        complexClassOne.performComplexCalculation();
        complexClassTwo.performComplexCalculation();
        complexClassThree.performComplexCalculation();
    }
}
