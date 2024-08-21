import.java.util.Scanner;
int choise,front,rear;
interface Stack
{
    void push();
    void pop();
    void display();

}
interface Queue
(
    void push();
    void pop();
    void display();
    
)

class Exp3 implements Stack,Queue
{
    public static void main(string args[])
    {
        Scanner sc= new Scanner (System.in);
        int choise,top = -1,front,rear;
        int []array = new int [5];
        while(choise !=3)
        {   
            System.out.println("Ente ryour choise:");
            System.out.println("1.stack");
            System.out.println("2.Queue");
            System.out.println("3.EXIT");
            operation=sc.nextINT;

            if(operation==1)
            {
            {
                if(top ==5)
                System.out.println("Stack is Ovewrflow");
            }
            else
            {
                top+=1;
                System.out.println("enter the number to add in stack:");
                array[top]=number;
                System.out.println(number+"inserted succesfuly")
           
             }
            }
            
            if (operation==2)
         {   {
                if(top ==-1)
                System.out.println("Stack is underflow");
            }       
            else
            {
               array[top]=popelement;
               top--;
               System.out.println(+popelement"poped succesful");
            
            }
        }

          if (operation==3)
          {
            {
                if(top == -1)
                System.out.println("Stack is empty");

            }
            else
            {   
               System.out.println("Stack elements are :");
               for(inti=0 ; i<=top ; i++)
               System.out.println(array[i]+" ");
            }
          }
       
       
       
       
       
       
       
        }


    }
}