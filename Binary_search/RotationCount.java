package Binary_search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int res = pivot(arr)+1;
        System.out.printf("the array is rotated %d times.", res);
    }

    public static int pivot(int[] arr){
        int ans = 0;
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int mid = start + (end - start)/2;

            if(arr[end]>arr[start]) return arr.length;

            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;

            if(arr[mid]==arr[start] && arr[mid]==arr[end]){

                if(arr[start]>arr[start+1]) return start;
                start++;
                if(arr[end]<arr[end-1]) return end;
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid;
            }
            else end = mid-1;

            ans = mid;
        }
        
        return ans;
    }
}

