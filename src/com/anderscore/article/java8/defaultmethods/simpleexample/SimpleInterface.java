package com.anderscore.article.java8.defaultmethods.simpleexample;

public interface SimpleInterface {

  default String sayHello() {
     return "Hello";
  }

}