package librarybooks;

public class bookmain {

	public static void main(String[] args) {
		bookmethods ob1 =new bookmethods();
		ob1.addbooks();
		ob1.displaybooks();
		ob1.isavailable();
		ob1.renamebook();
		ob1.displaybooks();
		ob1.deletebook();
	}

}
