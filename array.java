package adarsh;

public class array {
	public static void main(String[] args) {
	int a[][]={{1,2,2},{3,4,5}};
	int b[][]={{1,2,3},{3,4,6}};
	int c[][]= new int[2][3];
	for(int j=0;j<2;j++){
		for(int k=0;k<3;k++){
			c[j][k]=a[j][k]*b[j][k];
			System.out.print(c[j][k]+"  ");
		}
		 System.out.println();
	}

	}

}
