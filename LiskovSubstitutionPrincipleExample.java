import java.util.Scanner;
import java.io.*;
interface Shape
{
    void area();
}

class Rectangle implements Shape
{
    int rectangleHeight,rectangleWidth;
    
    void setHeightAndWidthOfRectangle(int height,int width)
    {
        rectangleHeight = height;  
        rectangleWidth = width;
    }
    public void area()
    {
        int areaOfRectangle = rectangleWidth * rectangleHeight;
        System.out.println("The area of rectangle is: "+areaOfRectangle);
    }
}
class Square implements Shape
{
    int squareSide;
    void setSideOfSquare(int side)
    {
        squareSide = side;
    }
    public void area()
    {
        int areaOfSquare = squareSide * squareSide;
        System.out.println("The area of square is: "+areaOfSquare);
    }
}
public class LiskovSubstitutionPrincipleExample
{
	public static void main(String[] args) 
	{
		System.out.println("What do you want to find?");
		System.out.println("1- Area Of Rectangle");
		System.out.println("2- Area Of Square");
		System.out.println("Enter your choice");
		Scanner scanInput = new Scanner(System.in);
		int choiceOfUser = scanInput.nextInt();
		
		switch(choiceOfUser)
		{
		    case 1:
		           {
		               System.out.println("Enter Height Of rectangle");
		               int height = scanInput.nextInt();
		               System.out.println(" Enter width of rectangle");
		               int width = scanInput.nextInt();
		               Rectangle objectForRectangle = new Rectangle();
		               objectForRectangle.setHeightAndWidthOfRectangle(height,width);
		               objectForRectangle.area();
		               break;
		               
		           }
		   case 2:
		           {
		              System.out.println("Enter Side of square");
		              int side = scanInput.nextInt();
		              Square objectForSquare = new Square();
		              objectForSquare.setSideOfSquare(side);
		              objectForSquare.area();
		              break;
		           }
		}
	}
}
