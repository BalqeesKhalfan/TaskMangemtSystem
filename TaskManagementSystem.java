
import java.util.Scanner;
public class TaskManagementSystem {
      public static void main(String[] args) {
       Scanner input1=new Scanner(System.in);
       System.out.println("ADD NEW TASK:");
       System.out.println("\nEnter title name:");
       String title=input1.nextLine();
       System.out.println("\nTitle:" + title);
       System.out.println("\nEnter description:");
       String description=input1.nextLine();
       System.out.println("\ndescription:"+description);
       System.out.println("\nEnter priority(High-Mediem-Low):");
       String priority=input1.next();
       System.out.println("\npriority:"+priority);
       System.out.println("\nEnter due date(YYYY-MM-DD):");
       String dueDate=input1.next();
       System.out.println("\ndue date:"+dueDate);
    }
}
