package oops.abc;

public class Demo1  extends mohterBoard  {
	int dell;
	String s;
	public Demo1(int chip_id, String company, int dell, String s) {
		super(chip_id, company);
		System.out.println("inside const");
		this.dell = dell;
		this.s = s;
	}
	public static void main(String[] args) {
		System.out.println("inside main ");
		Demo1 d=new Demo1(12,"hp", 463, "dell");	
	}
	@Override
	void Getname() {
		System.out.println("inside Getname");
		// TODO Auto-generated method stu
	}
}

abstract class mohterBoard{
	int chip_id;
	String company;
	static final  int ic_id=102;
	public mohterBoard(int chip_id, String company) {
		super();
		System.out.println("parent const");
		this.chip_id = chip_id;
		this.company = company;
	}
	void get() {
		System.out.println("get method");
	}
	abstract void Getname();

}
