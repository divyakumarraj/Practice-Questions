// Piggie Bank 
import java.util.Scanner;
public class AddAmount {
    int initial=50;
    int add;
    int f;
    AddAmount()
    {
        System.out.println("amount not added");
    }
    AddAmount(int add)
    {
        Scanner sc = new Scanner(System.in);
        add= sc.nextInt();
        this.add=add;
        f =initial+add;
        System.out.println("final amount "+f);
    }
    public static void main(String[] args) {
        AddAmount obj=new AddAmount(1);
    }

}
