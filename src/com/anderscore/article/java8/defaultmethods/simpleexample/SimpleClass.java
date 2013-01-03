package com.anderscore.article.java8.defaultmethods.simpleexample;

public class SimpleClass implements SimpleInterface {

  public static void main(String[] args) {
    SimpleClass instance = new SimpleClass();
    System.out.println(instance.sayHello());
  }

}