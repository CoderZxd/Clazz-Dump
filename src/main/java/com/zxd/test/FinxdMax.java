package com.zxd.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: Clazz-Dump
 * @Package com.zxd.test
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2019-02-14 20:45
 **/
public class FinxdMax {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,3,3,4,7,9,5,5,5,5,2};
//        int[] arr = new int[]{1,2,3,4,7,9,5,2};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int end = arr.length-1;
        int start = 0;
        while (start < end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                start = mid +1;
            }else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]){
                end = mid -1;
            }else if(arr[mid] == arr[mid-1] && arr[mid] == arr[mid+1]){
                for(int i=1;;i++){
                    if(mid-1-i>=0 && mid+1+i<=end){
                        if(arr[mid-1-i] > arr[mid+1+i] ){
                            end = mid -1;
                            break;
                        }else if(arr[mid-1-i] < arr[mid+1+i]){
                            start = mid +1;
                            break;
                        }
                    }else if(mid-1-i>=0){
                        if(arr[mid-1-i] > arr[mid+i] ){
                            end = mid -1;
                            break;
                        }else if(arr[mid-1-i] < arr[mid+i]){
                            start = mid +1;
                            break;
                        }
                    }else if(mid+1+i<=end){
                        if(arr[mid-i] > arr[mid+1+i] ){
                            end = mid -1;
                            break;
                        }else if(arr[mid-i] < arr[mid+1+i]){
                            start = mid +1;
                            break;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
