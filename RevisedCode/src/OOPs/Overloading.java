package OOPs;

public class Overloading {
public static void main(String[] args) {
	System.out.println(Overloading.m(10,20));
	System.out.println(Overloading.m(10,20,30));
	System.out.println(Overloading.m(10,20,40));
}
static int m(int a,int b) {
	return a+b;
}
static int m(int a,int b,int c) {
	return a+b+c;
}
static int m(int a,int b,int c,int d) {
	return a+b+c+d;
}
}
