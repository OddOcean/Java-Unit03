//Aidan Weygandt 09/24/21
// Purpose of Program:
// First time creation and use of objects, using the Bank class
class Lab03A_Weygandt {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("");
    //constructor parameters name, checking, savings
    String john = "John";
    String eric = "Eric";
    String terry = "Terry";
    //create a bank object named john with the default constructor and print john
    Lab03A_Bank_Weygandt John = new Lab03A_Bank_Weygandt();//creates john object
    System.out.println(John);//prints john object string

    //on line 35 print john
    //for john set the name to "John" and run program to see output
    John.setNameAccountHolder(john);
    //System.out.println(John);
    
    //for john set the checking account balance to -500 and run the program to see what happens
    John.Lab03A_Bank_Weygandt(john, -500.0, 0);
    //System.out.println(John);
    
    //try to directly access john.checking by subtracting 600 john.checking -= 600 run program to see what happens
    //John.checking -= 600;
    //in Bank change checking to public and run program again to see if line above works.  If it works comment line out and change variable back to private
 
    //for john set the checking account balance to 500 and run the program to see what happens
    John.Lab03A_Bank_Weygandt(john, 500.0, 0);
    //System.out.println(John);

    //for john set the savings account balance to 500 and run the program to see what happens
    John.Lab03A_Bank_Weygandt(john, 500.0, 500);
    //System.out.println(John);
    
    //print john
    System.out.println(John);

    //create eric with overloaded constructor and ("Eric", 200, 600)
    Lab03A_Bank_Weygandt Eric = new Lab03A_Bank_Weygandt();
    Eric.Lab03A_Bank_Weygandt(eric, 200.0, 600.0);
    
    //create terry with overloaded constructor and ("Terry", 200, 600)
    Lab03A_Bank_Weygandt Terry = new Lab03A_Bank_Weygandt();
    Terry.Lab03A_Bank_Weygandt(terry, 200.0, 600.0);
    
    //print eric
    System.out.println(Eric);
    //print terry
    System.out.println(Terry);

    //have terry transfer $250 to eric
    Terry.transferFromCheckingTo(Eric, 250.0);
    
    //print eric
    System.out.println(Eric);
    //print terry
    System.out.println(Terry);

    //uncomment the method on line 133 in bank and write the required code so:
    //have john transfer $600 from savings to eric's savings and run program to see what happens
    John.transferFromSavingsTo(Eric, 600.0);

    //have john transfer $250 to eric
    John.transferFromSavingsTo(Eric, 250.0);

    //print eric
    System.out.println(Eric);
    //print terry
    System.out.println(Terry);
    //print john
    System.out.println(John);

  }//end main
}//end class