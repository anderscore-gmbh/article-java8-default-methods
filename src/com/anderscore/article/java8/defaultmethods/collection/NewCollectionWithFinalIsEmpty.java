package com.anderscore.article.java8.defaultmethods.collection;

public interface NewCollectionWithFinalIsEmpty {

  public int size();

  public default boolean isEmpty() {
    return this.size() == 0;
  }

}