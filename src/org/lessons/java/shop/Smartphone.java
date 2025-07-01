package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

  // ATTRIBUTES
  long imei;
  int storage;

  // CONSTRUCTORS
  protected Smartphone(
      int barCode,
      String name,
      String brand,
      BigDecimal price,
      BigDecimal iva,
      long imei,
      int storage) {

    super(barCode, name, brand, price, iva);
    this.imei = imei;
    this.storage = storage;
  }

  // METHODS
  public long getImei() {
    return this.imei;
  }

  public void setImei(long imei) {
    this.imei = imei;
  }

  public int getStorage() {
    return this.storage;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }
}
