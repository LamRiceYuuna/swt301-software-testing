/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lamnb.mathutil.main;

import com.lamnb.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hay khong
        //ta phai dua ra cac tinh huong su dung ham trong thuc te
        //vi du : -5 coi tinh dc ko
        //       0 coi tinh may
        //       20 coi tính may
        //       21 coi tính ra may
        //TEST CASE: Mot tinh huong ham/app/tinh nang dc dua vào su dung 
        //gia lap hanh vi xai cua ai do
        //Test case là 1 tình huong su dung, xai app hay ham , mà nó bao hàm
        //INPUT :data dâu vào cu the nào do
        //OUTPUT: dau ra ung voi xu li cua ham. chuc nang cua app, di nhien 
        // dung dau vào de xu li
        //Kì vong : mong hàm se tra ve  value nào do ung voi input o tren
        //So sanh de xem ket qua co nhu ki vong hay khong
        long expected = 120;// tao ki vong hàm tra ve 120 neu tinh 5!
        int n = 5;   //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual+ " actual");
    }
}
