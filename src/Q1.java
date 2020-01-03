import java.util.Scanner;
public class Q1{
    int x;
    int y;
    //int z;
    public Q1(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Numbers=");
        this.x=input.nextInt();
        this.y=input.nextInt();
        //this.z=input.nextInt();
    }
    public void answers(){
        System.out.println("Sum\t\t=\t"+ (this.x+this.y));
        System.out.println("Product\t\t=\t"+(this.x*this.y));
        System.out.println("Difference\t=\t"+(this.x-this.y));
        System.out.println("Quotient\t=\t"+(this.x/this.y));
    }
}