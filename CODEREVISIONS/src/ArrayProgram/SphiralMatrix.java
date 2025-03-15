package ArrayProgram;
import java.util.Scanner;
public class SphiralMatrix {
public static void main(String[] args) {
	System.out.println("ENter the size");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[][]= new int [n][n];
	char dir='a';
	int row =0;
	int col =-1;
	for(int i =1;i<=n*n;i++) {
		switch(dir) {
		case 'a':{
			col++;
			a[row][col]=i;
			if(col==a.length-1 || a[row][col+1]!=0)dir='b';
		}
		break;
		case 'b':{
			row++;
			a[row][col]=i;
			if(row==a.length-1 || a[row+1][col]!=0)dir='c';
		}
		break;
		case 'c':{
			col--;
			a[row][col]=i;
			if(col==0 || a[row][col-1]!=0)dir='d';
		}
		break;
		case 'd':{
			row--;
			a[row][col]=i;
			if(a[row-1][col]!=0)dir='a';
		}
		break;
		}
	}
	for(int i=0;i<a.length;i++) {
		for(int j =0;j<a[i].length;j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
}
}