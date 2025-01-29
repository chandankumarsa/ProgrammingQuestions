package Jan21;

class Car{
	int num;
	static int x=1000;
	String color;
	{
		num =x;
		x++;
	}
	Car(){
		color = "white";
	}
	Car(String c){
		color =c;
	}
}
public class Test {
public static void main(String[] args) {
	Car c1 = new Car();
	Car c2 = new Car("Black");
	System.out.println(c1.num);
	System.out.println(c1.color);
	System.out.println(c2.num);
	System.out.println(c2.color);
}
}

