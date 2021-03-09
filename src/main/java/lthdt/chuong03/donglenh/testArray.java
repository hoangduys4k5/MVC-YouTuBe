/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] a;
//        a = new int[4];
//        a[0] = 12;
//        a[1] = 9;
//        a[2] = 1;
//        a[3] = 15;
//        System.out.println(a.toString());
//   System.out.println(Arrays.toString(a));
//          int[] b = new int[]{1, 3, -7, 8, 9, 20};
//          System.out.print(Arrays.toString(b));
//          System.out.println("So luong phan tu cua mang la: " + b.length);
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so luong phan tu cua mang");
            String input = sc.nextLine();
            int n = Integer.parseInt(input);
            int[] c = new int[n];
//            for( int i = 0; i < n; i++){
//                System.out.println("C[" + i + "] = ");
//                input = sc.nextLine();
//                c[i]  = Integer.parseInt(input);
//            }
//            System.out.println("Gia tri cua mang vua nhap la");
////            System.out.println(Arrays.toString(c));
//            for(int i = 0; i< n ; i++){
//                System.out.print(c[i] + " ");
//            }
            Random rnd = new Random();
            for(int i = 0;i< n; i++){
                c[i] = rnd.nextInt(1000);
            }
            System.out.println(Arrays.toString(c));
            
//        System.out.println("Nhập giá trị tìm kiếm");
//        input = tam.nextLine();
//        int x = Integer.parseInt(input);
//        
//        Arrays.sort(c);
//        System.out.println("Mảng sau khi sắp xếp là: ");
//        
//        int index = Arrays.binarySearch(c, x);
//        if (index < 0 ){
//            System.out.println("Không tìm thấy");
//        } else {
//            System.out.println("Tìm thấy ở vị trí thứ: "+index);
//        }
        
//        boolean flag = false;
//        for (int i = 0; i < c.length; i++) {
//            if(c[i] == x){
//                 System.out.println("Nhập giá trị tìm kiếm nằm ở vị trí: "+i);
//                 flag = true; break;
//            }
//        }
//        if(!flag) {
//             System.out.println("Không có trong mảng");
//        }
               
    }    
}
