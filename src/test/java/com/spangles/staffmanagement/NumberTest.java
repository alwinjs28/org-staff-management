package com.spangles.staffmanagement;


public class NumberTest {
    public static void main(String[] args) {
        int a[] = new int[7];
        a[0] = 110;
        a[1] = 110;
        a[2] = 110;
        a[3] = 110;
        a[4] = 110;
        a[5] = 110;
        a[6] = 110;

        for (int i = 0; i < 7; i++) {
            for (int j = 1+i; j < 7; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("Sorted: " + a[i]);
        }
        int j = 0;
        int temp[] = new int[7];

        for (int i = 0; i < 6; i++) {
            if ( a[i] != a[i + 1]) {
                temp[j++] = a[i];
                if (i == 5){
                    temp[j] = a[6];
                }
            }
            if(i == 5 && j == 0){
                temp[j] = a[6];
            }
        }


        for (int i=0;i<6;i++) {
            System.out.println("Sorted Number is : " + temp[i]);
        }
    }
}
