package c1;

import java.util.ArrayList;
import java.util.List;


public class C1 {

    public static void main(String[] args) {
        int d [] = new int [101];
        d[0] = 5;
        d[1] = 3;
        d[2] = 1;
        d[3] = 5;
        d[4] = 1;
        System.out.println(rgame(5, d));

    }

    public static int rgame(int n, int[] d) {
        List list = new ArrayList();
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i -1 ; j++) {
                if(d [j] == d [j+1]){
                    list.add(d[j]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int MaxValue =(int) list.get(0);
            if((int)(list.get(i)) > MaxValue){
                MaxValue = (int) list.get(i);
            }
            list.set(0, MaxValue);
        }
        
        for (int i = 1; i < list.size(); i++) {
            int MaxValue2 =(int) list.get(1);
            if((int)(list.get(i)) > MaxValue2 && (int)(list.get(i)) != (int)(list.get(0))){
                MaxValue2 = (int) list.get(i);
            }
            list.set(1, MaxValue2);
        }
        
        if(list.isEmpty()){
            return -1;
        }
        int S = (int) list.get(0) * (int) list.get(1);
        return S;
}
    
    
    
}
