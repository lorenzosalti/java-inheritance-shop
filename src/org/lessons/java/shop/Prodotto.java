package org.lessons.java.shop;

import java.math.BigDecimal;

public class Prodotto {

  // ATTRIBUTES
  int barCode;
  String name;
  String brand;
  BigDecimal price;
  BigDecimal iva;

  // CONSTRUCTORS
  protected Prodotto(int barCode, String name, String brand, BigDecimal price, BigDecimal iva) {
    this.barCode = barCode;
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.iva = iva;
  }

  // METHODS
  public int getBarCode() {
    return this.barCode;
  }

  private void setBarCode(int barCode) {
    this.barCode = barCode;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getIva() {
    return this.iva;
  }

  public void setIva(BigDecimal iva) {
    this.iva = iva;
  }
}
