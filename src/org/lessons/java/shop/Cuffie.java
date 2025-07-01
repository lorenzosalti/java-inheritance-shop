package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

  // ATTRIBUTES
  String color;
  boolean isWireless;

  // CONSTRUCTORS
  protected Cuffie(
      int barCode,
      String name,
      String brand,
      BigDecimal price,
      BigDecimal iva,
      String color,
      boolean isWireless) {

    super(barCode, name, brand, price, iva);
    this.color = color;
    this.isWireless = isWireless;
  }

  // METHODS
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean getWireless() {
    return this.isWireless;
  }

  public void setWireless(boolean isWireless) {
    this.isWireless = isWireless;
  }
}