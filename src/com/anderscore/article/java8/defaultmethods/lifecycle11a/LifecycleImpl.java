package com.anderscore.article.java8.defaultmethods.lifecycle11a;

public class LifecycleImpl implements Lifecycle {

  @Override
  public void initialize() {
    System.out.println("Initializing");
  }

  @Override
  public void shutdown() {
    System.out.println("Shutting down");
  }

  @Override
  public void pause() {
  }

  @Override
  public void resume() {
  }

}