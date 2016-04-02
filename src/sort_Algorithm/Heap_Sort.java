package sort_Algorithm;

import java.util.Arrays;

public class Heap_Sort {
   int a[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
   public  Heap_Sort(){  
       heapSort(a);  
   }
    public  void heapSort(int[] a2) {
	System.out.println("begin:");
	int arrayLength=a.length;
	
	for(int i=0;i<arrayLength;i++){
		//建堆
		buildMaxHeap(a,arrayLength-1-i);
		//交换堆顶和最后一个元素
		swap(a,0,arrayLength-1-i);
		System.out.println(Arrays.toString(a));
	}
	
}
	private void swap(int[] a2, int i, int j) {
		int temp = a2[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	private void buildMaxHeap(int[] data, int lastIndex) {
		
		//从lastIndex处节点（最后一个节点）的父节点开始
		for(int i =(lastIndex-1)/2;i>=0;i--){
			//k保存正在判断的节点
			int k =i;
			//如果当前k节点的子节点存在
			while(k*2+1<=lastIndex){
				//k节点的左子节点的索引
				int biggerIndex = 2*k+1;
				//如果biggerIndex小于lastIndex，即k节点的右子节点存在
				if(biggerIndex<lastIndex){
					//如果右子节点的值较大
					if(data[biggerIndex]<data[biggerIndex+1]){
						//biggerIndex总是记录较大子节点的索引
						biggerIndex++;
					}
				}
				
				//如果k子节点的值小于其较大的子节点的值
				if(data[k]<data[biggerIndex]){
					//交换
					swap(data,k,biggerIndex);
					//将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的
					k=biggerIndex;
				}else{
					break;
				}
			}
		}
	}  
   
}
