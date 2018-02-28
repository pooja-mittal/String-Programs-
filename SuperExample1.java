class Parent
{
	int num;
	Parent(int num) {
		this.num=num;
		System.out.println("it's superclass constructor with arguments ");
	}

	Parent()
	{
		System.out.println("it's superclass constructor without arguments");
	}
}

class Child extends Parent
{
	int num;
	Child() {
		System.out.println("baseclass constructor without arguments");
	}

	Child(int num) {
		super(10);
		this.num=num;
		System.out.println("baseclass constructor with arguments");
	}

	void Display()
	{
		System.out.println("base "+ num);
		System.out.println("parent " + super.num);
	}
}

class Test
{
	public static void main(String[] args)
	{
		//Parent p=new Parent(10);
		//System.out.println();
		Child c=new Child();
		c.Display();
		Child c1=new Child(5);
		c1.Display();
	}
}



