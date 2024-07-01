package com.chinz.category.generic;

public class FindFirstOneInBInaryArray {
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        findFirstOne(arr);
    }

    private static void findFirstOne(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 1 && (mid==0 || arr[mid - 1] == 0)) {
                System.out.println("Index :" + mid);
                break;
            } else if (arr[mid]==0) {
                low = mid+1;
            }else{
                high = mid;
            }
        }
    }
}
