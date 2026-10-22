package p1;
//using RECURSION
public class DemoBinarySearch {
    public static void main(String[] args){
        int[] a = {2,4,7,9,12,15};
        //System.out.println(binarySearch(a,0, a.length-1,20));
        System.out.println(binarySearch(a,20));

    }
    //both space and time complexity are log n
    //(regular while loop is) O(1) for space, time logn

    public static int binarySearch(int[] arr, int key){//wrapper method:
        //wraps around another method, which in this case happens to be a recursive method.
        return binarySearch(arr,0, arr.length-1, key);
    }

    private static int binarySearch(int[] arr, int start, int end, int key) {
        int mid = (start+end)/2;//convention for iterators like c++ ?
        if (start > end){//Basecase + by this point we must've gone through the entire array
            return -1;
        }
        if (arr[mid]  == key){
            return mid;
        } else if(arr[mid] > key) {
            end = mid-1;
        }                //mid -1 or mid + 1 because we know its not 1
        else {
            start = mid+ 1;
        }

        return binarySearch(arr,start,end,key);
    }
}
