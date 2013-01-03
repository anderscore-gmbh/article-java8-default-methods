package com.anderscore.article.java8.defaultmethods.lifecycle11c;

public interface Lifecycle {

  public void initialize();
  public void shutdown();

  public default void pause() {
  }

  public default void resume() {
  }

}