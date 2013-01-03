package com.anderscore.article.java8.defaultmethods.inheritance;

public class FooImpl implements ExtendedFoo {

  public static void main(String[] args) {
    Foo fooImpl = new FooImpl();
    System.out.println(fooImpl.name());
  }

  @Override
  public String name() {
    return "My name is FooImpl!";
  }

}
