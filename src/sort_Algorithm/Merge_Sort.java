package sort_Algorithm;

import java.util.Arrays;

public class Merge_Sort {
	int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
	public  Merge_Sort(){  
	    sort(a,0,a.length-1);  
	    for(int i=0;i<a.length;i++)  
	        System.out.println(a[i]);  
	}
	private void sort(int[] data, int left, int right) {
		if(left<right){
			//找出中间索引
			int center = (left+right)/2;
			//对左边数组进行递归
			sort(data,left,center);
			//对右边数组进行递归
			sort(data,center+1,right);
		    //合并
			merge(data,left,center,right);
		}
	}
	private void merge(int[] data, int left, int center, int right) {
		//申明一个暂时存放数据的中间数组
		int [] tmpArray = new int[data.length];
		int mid = center+1;
		
		int third = left;   //记录中间数组的索引
		int tmp = left;
		
		while(left<=center&&mid<=right){
			
			//取出小的放入中间数组
			if(data[left]<=data[right]){
				tmpArray[third++] = data[left++];
			}else{
				tmpArray[third++] = data[mid++];
			}
		}
		
		while(mid<=right){
			tmpArray[third++]=data[mid++];
		}
		while(left<=center){
			tmpArray[third++]=data[left++];
		}
		
		while(tmp<=right){
			//将中间数组的内容复制回原数组
			data[tmp] = tmpArray[tmp++]; 
		}
		System.out.println(Arrays.toString(data));
	}  
}
