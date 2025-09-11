public class Shape{
    public static void main(String[] args) {
        Rectangle a = new Rectangle();  //creating new object of the Rectangle class
        int area = a.area(20 ,30);  //calling the methods of the Rectangle class
        int perimeter = a.perimeter(20, 30);

        System.out.println("Area of rectangle:"+area);
        System.out.println("Perimeter of rectangle:"+perimeter);
    }                                  
}
class Circle{                           //making new class
    double area(int radius){     //defining method inside the class
        return Math.PI*radius*radius;
    }
    double perimeter(int radius){
        return 2*Math.PI*radius;
    }
}
class Rectangle{
    int area(int a,int b){
        return a*b;
    }
    int perimeter(int a,int b){
        return 2*(a+b);
    }
}