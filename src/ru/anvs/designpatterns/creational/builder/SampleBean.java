package ru.anvs.designpatterns.creational.builder;

public class SampleBean {
  /**
   * Nested static class Builder for SampleBeanBuilder
   * There are three major issues with Factory and Abstract Factory design patterns 
   * when the Object contains a lot of attributes.
   * 1. - Too Many arguments to pass from client program to the Factory class 
   *      that can be error prone because most of the time, the type of arguments 
   *      are same and from client side its hard to maintain the order of the argument.
   * 2. - Some of the parameters might be optional but in Factory pattern, 
   *      we are forced to send all the parameters and optional parameters need to send as NULL.
   * 3. - If the object is heavy and its creation is complex, then all that complexity 
   *      will be part of Factory classes that is confusing.
   */
  public static class SampleBeanBuilder {
    private String beanName;
    private String field1;
    private String field2;
    private String field3;

    public SampleBeanBuilder() {
 
    }

    public SampleBeanBuilder initBeanName(final String name) {
      this.beanName = name;
      return this;
    }

    public SampleBeanBuilder initField1(final String f1) {
      this.field1 = f1;
      return this;
    }
    
    public SampleBeanBuilder initField2(final String f2) {
      this.field2 = f2;
      return this;
    }
    
    public SampleBeanBuilder initField3(final String f3) {
      this.field3 = f3;
      return this;
    }

    protected String getBeanName() {
      return this.beanName;
    }

    protected String getField1() {
      return this.field1;
    }

    protected String getField2() {
      return this.field2;
    }

    protected String getField3() {
      return this.field3;
    }

    public SampleBean build() {
      return new SampleBean(this);
    }
    
  }

  private final String beanName;
  private final String field1;
  private final String field2;
  private final String field3;

  private SampleBean(SampleBeanBuilder builder) {
    this.beanName = builder.getBeanName();
    this.field1 = builder.getField1();
    this.field2 = builder.getField2();
    this.field3 = builder.getField3();
  }

  public String toString() {
    return new StringBuilder("Instance of SampleBean: ")
      .append(this.beanName)
      .append(this.field1)
      .append(this.field2)
      .append(this.field3).toString();
  }

}

