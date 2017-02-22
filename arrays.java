
public class arrays {
	public static void main(String[] args) {
		 int a[][]={{1,2,3},{2,3,4}};
		 int b[][]={{6,5,6},{4,5,6}};
		 int c[][]= new int[2][3]; 
		 for(int j=0;j<2;j++){
			 for(int k=0;k<3;k++){
	  c[j][k]=a[j][k]+b[j][k];  
        System.out.print(c[j][k]+"  "); 
		 }     	 
     System.out.println();
	}

}
}