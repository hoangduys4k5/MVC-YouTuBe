/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.dohoa.conffeelogic;
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class ProductCompByPrice implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
      double temp=o1.getPrice()- o2.getPrice();
      return(int)temp;
    }
    
}
