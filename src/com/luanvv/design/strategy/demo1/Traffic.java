package com.luanvv.design.strategy.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public abstract class Traffic {
    private IAlgorithm algorithm;

    public Traffic() {
    }

    public void setAlgorithm(IAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public IAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void go(){
        getAlgorithm().go();
    }
}
