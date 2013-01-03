package com.anderscore.article.java8.defaultmethods.lifecycle11b;

public class LifecycleImpl implements Lifecycle {

  @Override
  public void initialize() {
    System.out.println("Initializing");
  }

  @Override
  public void shutdown() {
    System.out.println("Shutting down");
  }

}