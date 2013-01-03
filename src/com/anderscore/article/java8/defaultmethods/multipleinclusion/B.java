package com.anderscore.article.java8.defaultmethods.multipleinclusion;

public interface B {

  public default String sayHello() {
    return "Hello from B!";
  }

}
