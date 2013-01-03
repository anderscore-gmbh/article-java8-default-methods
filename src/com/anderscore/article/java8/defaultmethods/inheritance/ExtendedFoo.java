package com.anderscore.article.java8.defaultmethods.inheritance;

public interface ExtendedFoo extends Foo {

  @Override
  public default String name() {
    return "I am an ExtendedFoo!";
  }

}
