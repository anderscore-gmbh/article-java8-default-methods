package com.anderscore.article.java8.defaultmethods.swingfocus;

import java.awt.event.FocusEvent;
import java.util.EventListener;

public interface FocusListener extends EventListener {

  /**
   * Invoked when a component gains the keyboard focus.
   */
  public default void focusGained(FocusEvent e) {
  }

  /**
   * Invoked when a component loses the keyboard focus.
   */
  public default void focusLost(FocusEvent e) {
  }

}
