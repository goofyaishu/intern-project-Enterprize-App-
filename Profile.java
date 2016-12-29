/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aashirwaad
 */
 class StudentProfile //student profile
{
     String name;
     String e_mail;
     String ph;
     String roll;

     public StudentProfile() //initialize all variables of student profile
     {
         System.out.println("Enter your name");
         Scanner n=new Scanner(System.in);
         name=n.nextLine();
         System.out.println("Enter your roll number");
         roll=n.nextLine();
         System.out.println("Enter your e-mail id");
         e_mail=n.nextLine();
         System.out.println("Enter your phone number");
         ph=n.nextLine();
         
     }
     void display() //display variable values
     {
         System.out.println("NAME IS              "+name);
         System.out.println("ROLL NUMBER IS       "+roll);
         System.out.println("E-MAIL IS            "+e_mail);
         System.out.println("PHONE NUM IS         "+ph);
         
     }
     
     
 }
class LearningGoalService //goal & skill management
{
     List<String> areas_interest; //areas of interest
     List<String> skill_known; //skills known
      List<String> learning_goal; //goals to be achieved
     int interest,language,goal;//no. of items
     public LearningGoalService() //initialize and add list elements
     {
         Scanner n=new Scanner(System.in);
         System.out.println("Enter your areas of interest. Press 'a' when done ");
         int i=0;
         String r;
         String p;
         p = "a";
         areas_interest=new ArrayList();
         skill_known=new ArrayList();
         do
         {
              r=n.nextLine();
             //boolean add;
              areas_interest.add(r);
         i++;
         }while(!r.equals(p));
         interest=i-1;
         System.out.println("Enter the languages/skills you know. Press 'a' when done ");
          i=0;
        
        // p = "a";
         do
         {
              r=n.nextLine();
         skill_known.add(r);
         i++;
         }while(!r.equals(p));
         language=i-1;
         System.out.println("Enter your learning goals. Press 'a' when done ");
          i=0;
        
         p = "a";
         learning_goal=new ArrayList();
         do
         {
              r=n.nextLine();
         learning_goal.add(r);
         i++;
         }while(!r.equals(p));
         goal=i-1;
     }
     void display()
     {
         System.out.println("AREAS OF INTEREST ARE:");
         for(int i=0;i<interest;i++)
         {
             System.out.println(i+"    "+areas_interest.get(i));
         }
         
         System.out.println("LANGUAGES/SKILLS KNOWN ARE:");
         for(int i=0;i<language;i++)
         {
             System.out.println(i+"     "+skill_known.get(i));
         }
         System.out.println("LEARNING GOALS ARE:");
         for(int i=0;i<goal;i++)
         {
             System.out.println(i+"    "+learning_goal.get(i));
         }
         
         
     }
    
    void addgoal()
     {
          String r;
          System.out.println("Enter the goal to be added");
          Scanner n=new Scanner(System.in);
          r=n.nextLine();
          learning_goal.add(r);
     }
    void skillsknown()
    {
        String r;
        int j;
        System.out.println("Enter the goal to be updated as skill");
          Scanner n=new Scanner(System.in);
          //r=n.nextLine();
          System.out.println("LEARNING GOALS ARE:");
         for(int i=0;i<goal;i++)
         {
             System.out.println(i+"     "+learning_goal.get(i));
         }
         System.out.println("Enter the goal NUMBER to be updated as skill");
         j=n.nextInt();
         r=learning_goal.get(j);
         learning_goal.remove(j);
         skill_known.add(r);
    }
}
public class Profile {

    /**anu
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentProfile obj;
        obj = new StudentProfile();
        LearningGoalService obj1;
        obj1=new LearningGoalService();
         Scanner n=new Scanner(System.in);
        obj.display();
        obj1.display();
        int choice=1;
        while(choice==1)
        {
            System.out.println("Press 1 to add a learning goal and 2 to delete a goal and add it to skillset");
            choice=n.nextInt();
            switch(choice)
            {
                case 1:
                {
                    obj1.addgoal();
                }
                break;
                case 2:
                {
                    obj1.skillsknown();
                }
                break;
            }
            //obj.display();
            obj1.display();
            System.out.println("Press 1 to continue 2 to exit");
            choice=n.nextInt();
        }
        
       System.out.println("The final list is      ");
       obj.display();
       obj1.display();
    }
    
}
