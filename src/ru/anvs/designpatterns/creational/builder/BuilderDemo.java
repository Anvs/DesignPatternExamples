package ru.anvs.designpatterns.creational.builder;

/**
 * Demo of Builder pattern
 */
public class BuilderDemo {

    private static SampleBean demo;


    public static void main(String[] args) {
        /*
         * Instead of constructor calling, SampleBean instance is created by using Builder instance.
         * It`s more useful in case of many parameters in constructor.
         */
        demo = new SampleBean.SampleBeanBuilder().beanName("test bean ").field1("v_1 ").field2("v_2 ").field3("v_3 ").build();
        System.out.println(demo.toString());
    }
}
