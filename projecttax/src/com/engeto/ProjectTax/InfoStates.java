package com.engeto.ProjectTax;

import java.math.BigDecimal;

public class InfoStates implements Comparable<InfoStates> {
     private String shortcut;
     private String name;
     private Double tax;
     private Double reductiontax;
     private Boolean specialtax;

     public InfoStates(String shortcut, String name, Double tax, Double reductiontax, Boolean specialtax) {
          this.shortcut = shortcut;
          this.name = name;
          this.tax = tax;
          this.reductiontax = reductiontax;
          this.specialtax = specialtax;
     }

     public String getShortcut() {
          return shortcut;
     }

     public void setShortcut(String shortcut) {
          this.shortcut = shortcut;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Double getTax() {
          return tax;
     }

     public void setTax(Double tax) {
          this.tax = tax;
     }

     public Double getReductiontax() {
          return reductiontax;
     }

     public void setReductiontax(Double reductiontax) {
          this.reductiontax = reductiontax;
     }

     public Boolean getSpecialtax() {
          return specialtax;
     }

     public void setSpecialtax(Boolean specialtax) {
          this.specialtax = specialtax;
     }
     public String getInfoStates(){
          return name+" "+"(" + shortcut +"): "+ tax + "%";
     }

     @Override
     public String toString() {
          return "InfoStates{" +
                  "shortcut='" + shortcut + '\'' +
                  ", name='" + name + '\'' +
                  ", tax=" + tax +
                  ", reductiontax=" + reductiontax +
                  ", specialtax=" + specialtax +
                  '}';
     }
     @Override
     public int compareTo(InfoStates o) {
          if(this.getTax() == o.getTax()) return 0;

          else if (this.getTax() > o.getTax()) return -1;

          else return 1;
     }


}
