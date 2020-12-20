package soru1;

public class Application {

	public static void main(String[] args) {
		
		LnkdList<Integer> list = new LnkdList<>();

        list.push(1);
        list.push(8);
        list.push(7);
        list.push(3);
        list.push(6);
        list.push(1);
        list.push(8);

        System.out.println("print()");
        list.print();
        System.out.println("printBackword()");
        list.printBackword();
        System.out.println("drop(7)");
        list.drop(7);
        System.out.println("print after drop(7)");
        list.print();



	}

}
