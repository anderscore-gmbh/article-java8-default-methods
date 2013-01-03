package com.anderscore.article.java8.defaultmethods.inheritance;

public interface Foo {

  public default String name() {
    return "I don't know my name";
  }

}