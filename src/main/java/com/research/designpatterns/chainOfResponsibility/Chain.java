package com.research.designpatterns.chainOfResponsibility;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);
}
