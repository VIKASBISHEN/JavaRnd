
public class addition
{
     public static void main(String args[])
     {
    	 int a[][]={{1,2,3},{2,3,4}};
    	 int b[][]={{3,4,5},{6,7,8}};
    	 
    	//creating another matrix to store the sum of two matrices  
    	 int c[][]=new int[2][3];  
    	 
    	//adding and printing addition of 2 matrices  
    	 for(int i=0;i<2;i++){  
    	 for(int j=0;j<3;j++){  
    	 c[i][j]=a[i][j]+b[i][j];  
    	 System.out.print(c[i][j]+" ");  
    	 }  
    	 System.out.println();//new line  
    	 } 
    	 
    	 String str="Am I Vikas";
    	 StringBuffer str1=new StringBuffer(str);
    	 str1.replace(0, 2, "He");
    	 
    	 System.out.println(str1);
    	 
       }
     }

