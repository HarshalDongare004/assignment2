
public class SubsetArray {

    static boolean findSubArray(int [] arr1, int [] arr2 , int len1 ,int len2)
    {
        int i=0,j=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]==arr2[j])
            {
                ++i;
                ++j;
                if(j==len2)
                    return true;
            }
            else
            {
                i=i-j+1;
                j=0;

            }

        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,1,2,4,5,6,7,2};
        int len1=arr1.length;
        int [] arr2={4,5,6,7,8};
        int len2=arr2.length;
        boolean ans=findSubArray(arr1,arr2,len1,len2);
        System.out.println(ans);
        
        int[] arr3 = {1,2,3,4,5,6}; 
        int len3 = arr3.length;
        boolean ans1 = findSubArray(arr1, arr3, len1, len3);
        System.out.println(ans1);
        
    }
}