package sort_Algorithm;

public class Shell_Sort {
	public void  shellSort(){  
	  int a[]={1,54,6,3,78,34,12,45,56,100};  
	  double dl = a.length;
	  int temp = 0;
	  while(true){
		  dl=Math.ceil(dl/2);
		  int d = (int)dl;
		  for(int x=0;x<d;x++){
			  for(int i=x+d;i<a.length;i+=d){
				  int j=i-d;
				  temp=a[i];
				  for(;j>=0&&temp<a[j];j-=d){
					  a[j+d]=a[j];
				  }
				  a[j+d]=temp;
			  }
		  }
		  if(d==1)
			  break;
	  }
	  for(int i=0;i<a.length;i++)
		  System.out.println(a[i]);
	}
}
