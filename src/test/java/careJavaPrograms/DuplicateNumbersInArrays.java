package careJavaPrograms;
public class DuplicateNumbersInArrays 
{
	public static void main(String[] args) 
	{
//		int a[]={1,2,3,4,6,7,8,9};
//		int b[]={2,3,4,5};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				if(a[i]==b[j])
//				System.out.println(a[i]);
//			}
//		}
		int[] arr = {1, 2, 3, 2, 4, 5, 3};
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            System.out.println("Duplicate Element : "+arr[i]);
		        }
		    }
		}
	}
}