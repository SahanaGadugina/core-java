class MatchBox
{
	String brand;
	int noOfSticks;
	int length;
	double price;
	double size;
	int weight;
	String type;
	
	MatchBox()
	{
		System.out.println("This is just a default constructor");
	}
	MatchBox(String brand)
	{
		this.brand=brand;
	}
	MatchBox(String brand,int noOfSticks)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
	}
	MatchBox(String brand,int noOfSticks,int length)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
	}
	MatchBox(String brand,int noOfSticks,int length,double price)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
	}
	MatchBox(String brand,int noOfSticks,int length,double price,double size)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.size=size;
	}
	MatchBox(String brand,int noOfSticks,int length,double price,double size,int weight)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.size=size;
		this.weight=weight;
		
	}
	MatchBox(String brand,int noOfSticks,int length,double price,double size,int weight,String type)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.size=size;
		this.weight=weight;
		this.type=type;
	}
}

	
	
	
	