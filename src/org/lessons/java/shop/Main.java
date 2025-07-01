package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Smartphone iphone = new Smartphone(12345678, "iPhone", "Apple", new BigDecimal(1500), new BigDecimal(22),
        123456781234567L, 512);

    System.out.println("Il codice a barre è: " + iphone.getBarCode());
    System.out.println("La quantità di memoria è: " + iphone.getStorage() + "GB");

    Televisori neo = new Televisori(87654321, "Neo", "Samsung", new BigDecimal(4000), new BigDecimal(22),
        55, true);

    System.out.println("Il codice a barre è: " + neo.getBarCode());
    System.out.println("La dimensione è: " + neo.getInches() + " pollici");

    Cuffie linkBuds = new Cuffie(12344321, "Link Buds", "Sony", new BigDecimal(149), new BigDecimal(22),
        "Dark Grey", true);

    System.out.println("Il codice a barre è: " + linkBuds.getBarCode());
    System.out.println("Il colore delle cuffie è: " + linkBuds.getColor());
  }
}
