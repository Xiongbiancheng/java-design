package com.star.design.suanfa;


public class SortUtil {

    //选择排序
    public static int[] selectSort(int[] arr){

        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                if(arr[j] < arr[minIndex]) minIndex=j;
            }
            swap(minIndex,i,arr);
        }
        return arr;
    }
    //二分选择排序
    public static int[] secondSelectSort(int[] arr){

        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            int maxIndex = arr.length-1-i;
            for (int j = i+1; j < arr.length-i; j++) {
                if(arr[j] < arr[minIndex]) minIndex = j;
                if(arr[j] > arr[maxIndex]) maxIndex = j;
            }
            swap(minIndex,i,arr);
            swap(maxIndex,arr.length-1-i,arr);
        }
        return arr;
    }

    //改良冒泡排序
    public static int[] newBubbleSort(int[] arr){
        //边界处理 外层如果到最后一位了 也没有必要循环了
        //时间复杂度外层(n-1) 内(n-1) 时间复杂度O(n平方) 没有开辟额外空间 空间复杂度O(1)
        for (int i = arr.length-1; i >= 1 ; i--) {
            boolean flag= true;
            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return arr;
    }

    //改良冒泡排序
    //每次循环把最大的放到数组最后面
    public static int[] newBubbleSort2(int[] arr){
        //边界处理 外层如果到最后一位了 也没有必要循环了
        //时间复杂度外层(n-1) 内(n-1) 时间复杂度O(n平git方) 没有开辟额外空间 空间复杂度O(1)
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean flag= true;
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(j,j+1,arr);
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return arr;
    }


    //插入排序
    //每次循环把最小的放到数组最后面
    public static int[] insertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(j,j-1,arr);
                }
            }
        }
        return arr;
    }


    //希尔排序(改良版的插入排序)
    public static int[] shellSort(int[] arr){
        for (int gap = getKnuthGap(arr.length); gap >0 ; gap = (gap-1)/3) {
            for (int i = gap; i <arr.length ; i++) {
                for (int j = i; j >gap-1 ; j-=gap) {
                    if (arr[j] < arr[j-gap]){
                        swap(j,j-1,arr);
                    }
                }
            }
        }
        return arr;
    }

    //希尔排序(改良版的插入排序)
    public static int[] mergeSort(int[] arr){

        return arr;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,7,2,1,4,5,9,8,6,16,11,14,12,15,10,13};
        shellSort(arr);
        printArr(arr);

    }

    //Knuth序列
    private static int getKnuthGap(int size){
        int h =1 ;
        while (h <= size/3){
            h = h*3+1;
        }
        return h;
    }

    private static void swap(int x, int y,int[] arr){
        /*int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;*/
        arr[x] = arr[x]^arr[y];
        arr[y] = arr[x]^arr[y];
        arr[x] = arr[x]^arr[y];
    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
