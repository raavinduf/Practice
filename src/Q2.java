import java.util.Scanner;
public class Q2 implements Num {
    int x;
    int y;

    public Q2(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your numbers");
        this.x=input.nextInt();
        this.y=input.nextInt();
    }
    public void sum(){
        System.out.println("Sum\t=\t"+(this.x+this.y));
    }
    public void average(){
        System.out.println("Average\t=\t"+((this.x+this.y)/2));
    }
    public void largest(){
        int largest;
        if(this.x>this.y)
            largest=this.x;
        else
            largest=this.y;
        System.out.println("Largest number\t=\t"+largest);
    }

    public void smallest(){
        int smallest;
        if(this.x>this.y)
            smallest=this.y;
        else
            smallest=this.x;
        System.out.println("Smallest number\t=\t"+smallest);
    }

    public void product(){
        System.out.println("Product\t=\t"+(this.x*this.y));
    }
}


