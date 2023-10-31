class ShowRoom
{
	String name;
	String color;
	String brand;
	int noOfBikes;
	String location;
	String area;
	double cost;
	int noOfEmployees;
	ShowRoom()
	{
		System.out.println("This is default connstructor");
	}
	ShowRoom(String name)
	{
		this.name=name;
	}
	ShowRoom(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
	ShowRoom(String name,String color,String brand)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
	}
	ShowRoom(String name,String color,String brand,int noOfBikes)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.noOfBikes=noOfBikes;
	}
	ShowRoom(String name,String color,String brand,int noOfBikes,String location)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.noOfBikes=noOfBikes;
		this.location=location;
	}
	ShowRoom(String name,String color,String brand,int noOfBikes,String location,String area)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.noOfBikes=noOfBikes;
		this.location=location;
		this.area=area;
	}
	ShowRoom(String name,String color,String brand,int noOfBikes,String location,String area,double cost)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.noOfBikes=noOfBikes;
		this.location=location;
		this.area=area;
		this.cost=cost;
	}
	ShowRoom(String name,String color,String brand,int noOfBikes,String location,String area,double cost,int noOfEmployees)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.noOfBikes=noOfBikes;
		this.location=location;
		this.area=area;
		this.cost=cost;
		this.noOfEmployees=noOfEmployees;
	}
}
	
	