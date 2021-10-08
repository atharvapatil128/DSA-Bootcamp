//Find position of an element in a sorted array of infinite numbers
package com.company;

public class Binary_search_amazon_q {

    public static void main(String[] args) {
        int[] arr = {1,2,34,45,59,390,242,444};
        System.out.println(searchSE(arr,45));

    }
    static int searchSE(int arr[], int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
                int temp  = end+1;
                end = end+(end-start+1)*2;
                start=temp;
            }
        return binarySearch(arr,target,start,end);
        }


    static int binarySearch(int arr[], int target,int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
