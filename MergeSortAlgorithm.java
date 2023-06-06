import java.util.Arrays;
public class MergeSortAlgorithm {

    static void mergeSort(int [] arr , int start , int end)
    {
        if(end-start==1)
            return;
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    static void merge(int [] arr , int start , int mid , int end)
    {
        int [] mix =new int[end - start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        for(;i<mid;i++)
        {
            mix[k]=arr[i];
            k++;
        }
        for(;j<end;j++)
        {
            mix[k]=arr[j];
            k++;
        }
        for(int l=0;l<mix.length;l++)
        {
            arr[l+start]=mix[l];
        }
    }
    public static void main(String[] args) {
        int [] arr={0,-1,7,55,4,2,-2};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}