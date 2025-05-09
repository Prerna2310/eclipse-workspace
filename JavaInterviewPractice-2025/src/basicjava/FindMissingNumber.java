package basicjava;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		 //1+2+4+5=12
		 //1+2+3+4+5=15
		 //15-12=3
		 
		 int a[]= {   };//should be sorted array
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];//0+1=1,1+2=3...=12
		 }
		 System.out.println(sum);
		 int sum1=0;
		 for(int j=-1;j<=9;j++)
		 {
			 sum1=sum1+j;//0+1,1+2,1+3,1+4..=15 adding simple integers from 1 to 5
		 }
		 System.out.println(sum1);
		 System.out.println("Missing integer is "+(sum1-sum));
	}

}
