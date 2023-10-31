class KeyBoardMain
{
	public static void main(String[] keyboard)
	{
		System.out.println("starting main in keyboard ");
		KeyBoard keyBoard=new KeyBoard();
		System.out.println("keyboard brand:"+keyBoard.brand);
		System.out.println("keyboard color:"+keyBoard.color);
		System.out.println("keyboard noOfKeys:"+keyBoard.noOfKeys);
		System.out.println("keyboard type:"+keyBoard.type);
		System.out.println("keyboard cost:"+keyBoard.cost);
		
		KeyBoard keyBoard1=new KeyBoard("DELL");
		System.out.println("keyboard1 brand:"+keyBoard1.brand);
		System.out.println("keyboard1 color:"+keyBoard1.color);
		System.out.println("keyboard1 noOfKeys:"+keyBoard1.noOfKeys);
		System.out.println("keyboard1 type:"+keyBoard1.type);
		System.out.println("keyboard1 cost:"+keyBoard1.cost);
		
		KeyBoard keyBoard2=new KeyBoard("DELL","black");
		System.out.println("keyboard2 brand:"+keyBoard2.brand);
		System.out.println("keyboard2 color:"+keyBoard2.color);
		System.out.println("keyboard2 noOfKeys:"+keyBoard2.noOfKeys);
		System.out.println("keyboard2 type:"+keyBoard2.type);
		System.out.println("keyboard2 cost:"+keyBoard2.cost);
		
		KeyBoard keyBoard3=new KeyBoard("DELL","black",105);
		System.out.println("keyboard3 brand:"+keyBoard3.brand);
		System.out.println("keyboard3 color:"+keyBoard3.color);
		System.out.println("keyboard3 noOfKeys:"+keyBoard3.noOfKeys);
		System.out.println("keyboard3 type:"+keyBoard3.type);
		System.out.println("keyboard3 cost:"+keyBoard3.cost);
		
		KeyBoard keyBoard4=new KeyBoard("DELL","black",105,"wireless");
		System.out.println("keyboard4 brand:"+keyBoard4.brand);
		System.out.println("keyboard4 color:"+keyBoard4.color);
		System.out.println("keyboard4 noOfKeys:"+keyBoard4.noOfKeys);
		System.out.println("keyboard4 type:"+keyBoard4.type);
		System.out.println("keyboard4 cost:"+keyBoard4.cost);
		
		KeyBoard keyBoard5=new KeyBoard("DELL","black",105,"wireless",2000);
		System.out.println("keyboard5 brand:"+keyBoard5.brand);
		System.out.println("keyboard5 color:"+keyBoard5.color);
		System.out.println("keyboard5 noOfKeys:"+keyBoard5.noOfKeys);
		System.out.println("keyboard5 type:"+keyBoard5.type);
		System.out.println("keyboard5 cost:"+keyBoard5.cost);
	}
}

		