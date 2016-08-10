class Rectangle 
{ 
    int length,breath;
 
    Rectangle(int x,int y) 
    { 
        length=x; 
        breath=y; 
    } 
    Rectangle(int x) 
    { 
        length=x; 
        breath=10; 
    } 
    Rectangle() 
    { 
        length=31; 
        breath=11; 
    } 
    float GetRectangleData() 
    { 
        return(length*breath); 
    } 
} 


class Square 
{ 
    int side;
     
    Square(int s) 
    { 
        side = s;         
    } 

    Square() 
    { 
        side = 8;
    } 

    float GetSquareData() 
    { 
        return(side * side); 
    } 
} 


public class Session5Assignment3
{
    public static void main(String [] args) 
    {
            Rectangle Rect = new Rectangle(); 
            Rectangle Rect1 = new Rectangle(200); 
            Rectangle Rect2 = new Rectangle(200,700); 

            Square s1 = new Square(); 
            Square s2 = new Square(12);  

            System.out.println("Area of First Rectangle is : "+Rect.GetRectangleData()); 
            System.out.println("Area of Second Rectangle is : "+Rect1.GetRectangleData()); 
            System.out.println("Area of Third Rectangle is : "+Rect2.GetRectangleData()); 

            System.out.println("Area of First Square is : "+s1.GetSquareData()); 
            System.out.println("Area of Second Square is : "+s2.GetSquareData()); 
   }
}