//Aidan Weygandt 09/27/21
// Purpose of Program: 
// Modifying a class to add a constructor and methods to 
// give it complete functionality for dealing with rational numbers  

public class Lab03B_Rational_Weygandt{

  private int n1;//numerator
  private int n2;//denominator
  public Lab03B_Rational_Weygandt(){//constructor
      n1 = n2 = 1;
   }
  public Lab03B_Rational_Weygandt(int num1, int num2){//overloaded constructor
      n1 = num1;
      n2 = num2;
   }

   public String getOriginal(){
      String fraction = n1 + "/" + n2;
      return fraction;
   }
   
   public double getDecimal(){//returns decimal version of fraction as integer
      double decimal = (double)n1 / (double)n2;
      return decimal;
   }
   
   public String getReduced(){//finds greatest common factor of fraction and returns reduced version as a string
      String reduced = n1/getGCF(n1, n2) + "/" + n2/getGCF(n1, n2);
      return reduced;
   }
   
	public void displayData(){//prints the original, decimal and reduced version of fraction
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}

  public void multiply(Lab03B_Rational_Weygandt f1, Lab03B_Rational_Weygandt f2){//multiplies two fractions together
    n1 = f1.n1 * f2.n1;
    n2 =  f1.n2 * f2.n2;
    System.out.println();
    System.out.println(f1.getOriginal() + " * " + f2.getOriginal() + " = " + getReduced());
  }

  public void divide(Lab03B_Rational_Weygandt f1, Lab03B_Rational_Weygandt f2){//divides a fraction by another
    n1 = f1.n1 * f2.n2;
    n2 =  f1.n2 * f2.n1;
    System.out.println();
    System.out.println(f1.getOriginal() + " / " + f2.getOriginal() + " = " + getReduced());
  }

  public void add(Lab03B_Rational_Weygandt f1, Lab03B_Rational_Weygandt f2){//adds two fractions together
    n1 = (f1.n1 * f2.n2) + (f2.n1*f1.n2);
    n2 = f1.n2 * f2.n2;
    System.out.println();
    System.out.println(f1.getOriginal() + " + " + f2.getOriginal() + " = " + getReduced());
  }

  public void minus(Lab03B_Rational_Weygandt f1, Lab03B_Rational_Weygandt f2){//minuses a fraction by another
    n1 = (f1.n1 * f2.n2) - (f2.n1 * f1.n2);
    n2 = f1.n2 * f2.n2;
    System.out.println();
    System.out.println(f1.getOriginal() + " - " + f2.getOriginal() + " = " + getReduced());
  }

	public int getGCF(int num1, int num2){//i didnt understand the other one so i found this https://math.stackexchange.com/questions/1346109/understanding-recursive-function-for-finding-gcf-of-2-numbers
      if(num2 == 0){
           return num1;
      }else{
           return getGCF(num2, num1%num2);//finds common factor by repeating modulo until its remainder is zero. after that it returns the factor before zero
      }
   }
}