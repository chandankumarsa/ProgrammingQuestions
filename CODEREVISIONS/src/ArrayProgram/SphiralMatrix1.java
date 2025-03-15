package ArrayProgram;
public class SphiralMatrix1 {
public static void main(String[] args) {
	int n =5;
	int a[][]=new int [n][n];
	int row =0;
	int col =-1;
	char dir='a';
	for(int i=1;i<=n;i++) {
		switch(dir) {
		case 'a':{
			col++;
			a[row][col]=i;
			if(col==a.length-1 ||a[row][col+1]!=0 )dir='b';
		}
		break;
		case 'b':{
			row++;
			a[row][col]=i;
			if(row==a.length-1 ||a[row+1][col]!=0 )dir='c';
		}
		break;
		case 'c':{
			col++;
			a[row][col]=i;
			if(col==a.length-1 ||a[row][col+1]!=0 )dir='b';
		}
		break;
		case 'd':{
			col++;
			a[row][col]=i;
			if(col==a.length-1 ||a[row][col+1]!=0 )dir='b';
		}
		break;
		}
	}
}
}
