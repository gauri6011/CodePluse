class Fan{
    String brand;
    double price;
    String color;
    

    Fan(){
        System.out.println(" No Argument Method !!");
    }

    Fan(String brand){
        this.brand=brand;
        System.out.println(brand);

    }
   

   Fan(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

        public void displayFan(){
            System.out.println(brand);
            System.out.println(price);
            System.out.println(color);


        
    }
}
public class ConstructorOverloding {
    public static void main(String[]args){
        new Fan();
        System.out.println("*******************");
        new Fan("LG");
        System.out.println("*******************");
        Fan f1=new Fan("LG",7500,"Silver");
        f1.displayFan();

    }
    
}
Output:
No Argument Method !!
*******************
LG
*******************
LG
7500.0
Silver