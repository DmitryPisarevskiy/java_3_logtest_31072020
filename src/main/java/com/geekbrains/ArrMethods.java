package com.geekbrains;

public class ArrMethods {
    public static int[] arrAfterLastFour (int[] arr) {
        int i=arr.length-1;
        while (i>=0 && arr[i]!=4) {
            i--;
        }
        if (arr[i]==4) {
            int[] arr2 = new int[arr.length-1-i];
            System.arraycopy(arr,i+1,arr2,0,arr.length-1-i);
            return arr2;
        } else {
            throw new RuntimeException();
        }
    }

    public static boolean isArrFromOneFour(int[] arr) {
        boolean isContainsOne=false;
        boolean isContainsFour=false;
        for (int i : arr) {
            switch (i) {
                case 1:
                    isContainsOne=true;
                    break;
                case 4:
                    isContainsFour=true;
                    break;
                default:
                    return false;
            }
        }
        return isContainsFour && isContainsOne;
    }
}
