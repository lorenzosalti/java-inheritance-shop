package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

  // ATTRIBUTES
  int inches;
  boolean isSmart;

  // CONSTRUCTORS
  protected Televisori(
      int barCode,
      String name,
      String brand,
      BigDecimal price,
      BigDecimal iva,
      int inches,
      boolean isSmart) {

    super(barCode, name, brand, price, iva);
    this.inches = inches;
    this.isSmart = isSmart;
  }

  // METHODS
  public int getInches() {
    return this.inches;
  }

  public void setInches(int inches) {
    this.inches = inches;
  }

  public boolean getSmart() {
    return this.isSmart;
  }

  public void setSmart(boolean isSmart) {
    this.isSmart = isSmart;
  }
}
