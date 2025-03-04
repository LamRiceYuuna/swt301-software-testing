
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Lab3 {
    public static void main(String[] args) {
//        final int noOfMarks = 3;
//        int [] Grades = new int [noOfMarks];
//        type= "";
//        for (int i = 0; i <= Grades.length; i++) {
//            score += Grades[i];
//        }
//        if(score >= 90){
//            type = "A";
//        }else if(score >= 80){
//            type = "B";
//        }else if(score >= 70){
//            type = "C";
//        }else if(score >= 60){
//            type = "D";
//        }else{
//            type = "F";
//        }
//        
//        if(type == "A"){
//            System.out.println("Gioi");
//        }else if(type == "B"){
//            System.out.println("Tot");
//        }else if(type == "C"){
//            System.out.println("Ok");
//        }else if(type == "D"){
//            System.out.println("You need to practice");
//        }else {
//            System.out.println("You need to try even handle");
//        }
    }
    
    
    public ArrayList<Integer> vicDiff(int[] ar1, int[] ar2){
        ArrayList<Integer> Output = null;
        int[] ar1 = {};
        boolean found;
        if(ar1 != null && ar2 != null){
            Output = new ArrayList<Integer>();
            for(int item : ar1) {
                int i;
                found = false;
                System.out.println(found);
                while (i <= ar2.length && found == false) {                    
                    if(item == ar2[i])
                        found = true;
                    i++;
                }
                if(found)
                    Output.add(item);
            }
        }
        
        return Output;
    }
    
    /**
     * 
     * @param sideA
     * @param sideB
     * @param sideC
     * @return 
     */
    //1.3 canh valid
    //2.1 trong 3 canh invalid , am, 0
    //3.Tông 2 canh ba ki nho hon canh con lai
    //4.1 trong 3 canh khong phai so , string
    //5.1 trong 3 canh la empty
    //6. 3 canh = nhau tao thanh tam giac deu
    //7. Một trong ba cạnh là số lớn hơn giới hạn Integer.MAX_VALUE:
    public static boolean checkTriangle(String sideA, String sideB, String sideC) {
        try {
            // Chuyển đổi các cạnh từ chuỗi sang kiểu số nguyên
            int a = Integer.parseInt(sideA);
            
            int b = Integer.parseInt(sideB);
            
            int c = Integer.parseInt(sideC);

            // Kiểm tra điều kiện ba cạnh
            if (a <= 0 || b <= 0 || c <= 0) {
                
                return false; // Một trong ba cạnh là số không hợp lệ (âm hoặc bằng 0)
                
            } else if (a + b <= c || a + c <= b || b + c <= a) {
                
                return false; // Tổng hai cạnh bất kỳ nhỏ hơn hoặc bằng cạnh còn lại
                
            } else {
                
                return true; // Các cạnh hợp lệ để tạo thành tam giác
                
            }
        } catch (NumberFormatException e) {
            
            return false; // Lỗi chuyển đổi chuỗi sang số nguyên
            
        }
    }
    
    /**
     * 
     * @param number
     * @return 
     */
    //8. TH so nt
    //9.th la so nhưng ko phai so nguyen so
    //10. empty
    //11.String
    //12.so 0
    //13.so am
    //14.so 1
    public static boolean isPrime(String number) {
        try {
            // Chuyển đổi số từ chuỗi sang kiểu số nguyên
            int n = Integer.parseInt(number);

            if (n <= 1) {
                return false; // Số nguyên tố phải lớn hơn 1
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; // Số không là số nguyên tố nếu có ước khác 1 và chính nó
                }
            }

            return true; // Số là số nguyên tố nếu không có ước khác 1 và chính nó
        } catch (NumberFormatException e) {
            return false; // Lỗi chuyển đổi chuỗi sang số nguyên
        }
    }
    
    
    
    //15.Testcase hợp lệ - Số nguyên dương:5-120
    //16.Testcase hợp lệ - Số 0:
    //17.Testcase không hợp lệ - Chuỗi rỗng
    //18.Testcase không hợp lệ - Chuỗi không phải là số:abcd
    //19.Testcase không hợp lệ - Số âm:
    //20.Testcase không hợp lệ - Số nguyên quá lớn:
    /**
     * 
     * @param number
     * @return 
     */
    public static long calculateFactorial(String number) {
        try {
            // Chuyển đổi số từ chuỗi sang kiểu số nguyên
            int n = Integer.parseInt(number);

            if (n < 0) {
                throw new IllegalArgumentException("Số không hợp lệ. Số phải là số không âm.");
            }
            
            long factorial = 1;
            
            for (int i = 2; i <= n; i++) {
                
                factorial *= i;
                
            }

            return factorial;
        } catch (NumberFormatException e) {
            
            throw new IllegalArgumentException("Chuỗi đầu vào không hợp lệ. Vui lòng nhập một số nguyên không âm.");
        }
    }
    
    /**
     * 
     * @param password
     * @return 
     */
    //21.Testcase hợp lệ - Mật khẩu đủ 8 kí tự, có chữ hoa, số và ký tự đặc biệt:password = "Abc123!@"
    //22Testcase không hợp lệ - Mật khẩu ít hơn 8 kí tự:password = "Abc123"
    //23.Testcase ko hợp lệ - Mật khẩu đủ 8 kí tự, chỉ có chữ hoa và số:password = "Abc12345"
    //24.Testcase ko hợp lệ - Mật khẩu đủ 8 kí tự, chỉ có chữ thường và ký tự đặc biệt:password = "abc!@#$%"
    //25.Testcase không hợp lệ - Mật khẩu chỉ gồm chữ hoa:
    //26.Testcase không hợp lệ - Mật khẩu chỉ gồm số:
    //27.Testcase không hợp lệ - Mật khẩu chỉ gồm chữ thường
    //28.Testcase không hợp lệ - Mật khẩu chỉ gồm ký tự đặc biệt
    //29.Testcase không hợp lệ - Mật khẩu không có chữ hoa, số và ký tự đặc biệt:
    public static boolean isValidPassword(String password) {
        
        if (password.length() < 8) {
            
            return false; // Mật khẩu có ít hơn 8 kí tự
        }
        
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            //Kiem tra co ki tu in hoa
            if (Character.isUpperCase(c)) {
                
                hasUppercase = true;
                
            //Kiem tra co ki tu chu
            } else if (Character.isDigit(c)) {
                
                hasDigit = true;
                
            //Kiem tra co ki tu dac biet    
            } else if (!Character.isLetterOrDigit(c)) {
                
                hasSpecialChar = true;
                
            }
            
            // Kiểm tra sớm: nếu đã đáp ứng đủ các yêu cầu, không cần kiểm tra tiếp
            if (hasUppercase && hasDigit && hasSpecialChar) {
                return true;
            }
        }
        
        return false; // Mật khẩu không đáp ứng các yêu cầu
    }
    /**
     * 
     * @param phoneNumber
     * @return 
     */
    //30.valid dô dai, toan so, so dau tien là 0:0123456789
    //31.Testcase hợp lệ - Số điện thoại đúng độ dài và có khoảng trắng và dấu gạch ngang 0123-456-789
    //32.Testcase không hợp lệ - Số điện thoại không đúng độ dài:01234567899
    //33.Testcase không hợp lệ - Số điện thoại chứa ký tự không hợp lệ:0123asfasd
    //34.Testcase không hợp lệ - Số điện thoại không bắt đầu bằng số 0:123456895
    //35.Testcase không hợp lệ - empty
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Xóa khoảng trắng và dấu gạch ngang trong số điện thoại
        String sanitizedPhoneNumber = phoneNumber.replaceAll("\\s|-", "");
        
        // Kiểm tra độ dài số điện thoại
        if (sanitizedPhoneNumber.length() != 10) {
            
            return false; // Số điện thoại không đúng độ dài
            
        }
        
        // Kiểm tra xem tất cả các ký tự trong số điện thoại có phải là chữ số không
        for (char c : sanitizedPhoneNumber.toCharArray()) {
            
            if (!Character.isDigit(c)) {
                return false; // Số điện thoại có ký tự không hợp lệ
                
            }
        }
        
        // Kiểm tra tiền tố của số điện thoại (theo yêu cầu cụ thể của quốc gia)
        // Ví dụ: Số điện thoại Việt Nam bắt đầu bằng số 0
        if (!sanitizedPhoneNumber.startsWith("0")) {
            
            return false; // Số điện thoại không bắt đầu bằng số 0
        }
        
        return true; // Số điện thoại hợp lệ
    }
    //36.Test hop le - 5
    //37.Test hơp le - vung bien 1
    //38.Test hơp le - vung bien 10
    //39.test ko hop le - so nguyen am : -4
    //40.test ko hop le - so 0
    //41.test ko hop le - so nguyen duong ngoai khoang cho phep 20
    //42.test ko hop le - blank input
    //43.test ko hop le - nhap string khac so : abc!@#
    /**
     * 
     * @param input
     * @return 
     */
    public static boolean isPositiveNumberInRange(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 1 && number <= 10;
        // Không thể chuyển đổi chuỗi thành số nguyên
        } catch (NumberFormatException e) {
            return false; 
        }
    }
}
