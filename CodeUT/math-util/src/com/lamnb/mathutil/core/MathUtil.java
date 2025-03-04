/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lamnb.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtil {
    //trong class này cung cap cho ai do nhieu hàm xu lí toán hoc
    //clone class Math cua JDK
    //hàm thu vien xài chung cho ai dó, ko can luu lai trang thai/gia tri
    //chon thiet ke la hàm static
    
    //hàm tính giai thua!!!
    //n!=1.2.3.4....n
    //ko có giai thua cho so am
    //0! = 1! = 1 quy uoc
    //giai thua hàm sô dô thi doc dung, tang nhanh ve gia tri
    //20 giai thua 18 con sô 0, vua k?p du cho kieu long java
    //21 giai thua tran kieu long 
    //quy uoc tinh n! trong khoang tu 0...20
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid arument. N must be between 0 .. 20");
        }
        if(n == 0 || n == 1){
            return  1;//ket thuc cuoc choi som neu nhan nhung dau vao dac biet
        }
        long product = 1;// tich nhan don , thuat toan heo dat, oc bu don thit
        for (int i = 2; i <=  n; i++) {
            product *= i; //product = product * i
        }
           
        return product;
    }
}
