package com.anderscore.article.java8.defaultmethods.multipleinclusion;

public interface A {

  public default String sayHello() {
    return "Hello from A!";
  }

}