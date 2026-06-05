package algorithm.TwoPointers;

import java.util.Scanner;

public class testDsaInterview {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            if (n <= 0);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("invalid input, number must >0");
        }
        System.out.println("Ketqua: "+tinhTong(n));
    }

    //nhập 1 số n và tính tổng từ 1 đến n, kiểm tra tất cả các trường hợp
    //dung long thay vi int ly do:
    public static int tinhTong(int n) {
        if (n <= 0) return 0;
        //cach 1: dung vong lap
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
