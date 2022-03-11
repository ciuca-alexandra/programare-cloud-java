package com.unitbv.beansnaming;

//@Component("dependantBean")
public class DependantBeanImpl implements DependantBean {
    private SimpleBean simpleBean;

    public DependantBeanImpl(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }
}
