package sort_Algorithm;

public class Quick_Sort {
	 int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
	 public  Quick_Sort(){  
	     quick(a);  
	     for(int i=0;i<a.length;i++)  
	         System.out.println(a[i]);  
	 }
	
	public int getMiddle(int[] list,int low,int high){
	 int temp = list[low];
	 while(low<high){
		 
		 while(low<high&&list[high]>=temp){
			 high--;
		 }
		 list[low] = list[high];   //比中轴小的记录移动到低端
		 while(low<high&&list[low]<=temp){
			 low++;
		 }
		 list[high] = list[low];    //比中轴大的记录移动到高端
	 }
	 list[low] = temp;
	 return low;
	}
	
   public void quick(int[] a2) {
		if(a2.length>0){
			_quicksort(a2,0,a2.length-1);
		}
	}

public void _quicksort(int[] list, int low, int high) {
	if(low<high){
		int middle = getMiddle(list,low,high);
		_quicksort(list,low,middle-1);
		_quicksort(list,middle+1,high);
	}
	
}  
}
