
class Solution {
    public int isvalid(int[] arr,int pages ){
        int pagescount=0;
        int students=1;
        for(int a:arr){
            if(pagescount+a <= pages){
                pagescount+=a;
            }else{
                students++;
                pagescount=a;
            }
        }return students;
    }
    public int findPages(int[] arr, int k) {
        if(k > arr.length) return -1;
        int low =0;
        int high=0;
        for(int num:arr){
            low = Math.max(low, num);
            high+=num;
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isvalid(arr,mid)<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}