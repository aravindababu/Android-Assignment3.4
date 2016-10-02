/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

/**
 *
 * @author user2
 */
public class StudentDetails {
    
    //declaring the variables of Student like Name,Section and rank
    
    String Name,Section;
    int Rank;
    
    //Defining Constructor with parameters to assign Values
    StudentDetails(String Name,String Section,int Rank){
        
        this.Name=Name;
        this.Section=Section;
        this.Rank=Rank;  
    }
    
    //Defining a method "display" for student details
    void display(){
        System.out.println("Student Name = "+Name+ " ,Section = "+Section+" ,Rank = "+Rank);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Defining 3 StudentDetails objects S1,S2,S3 and passing values to them 
        StudentDetails S1=new StudentDetails("Mark","Section A",1);
        StudentDetails S2=new StudentDetails("Vincent","Section B",2);
        StudentDetails S3=new StudentDetails("Rosy","Section C",3);
        
        //Using the display method created above and assigning the Values to display through new objects S1,S2,S3
        
        S1.display();
        S2.display();
        S3.display();
    }
    
}
