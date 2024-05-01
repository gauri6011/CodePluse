class fruit{
String name;
double price;
String color;

public fruit displayname(){
System.out.println(name);
return this;
}
public fruit displayprice(){
System.out.println(price);
return this;
}
public fruit displaycolor(){
System.out.println(color);
return this;
}
}
class MethodChaining{
public static void main(String[]args){
fruit f1=new fruit();
f1.name="Mango";
f1.price=300;
f1.color="Orange";

//method chaining
f1.displayname().displayprice(). displaycolor();
}
}

Output:
Mango
300.0
Orange