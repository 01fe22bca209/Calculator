/**
 * The Calculator1 class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two float operands.
 */
class Calculator1{
    // The code you provided is defining three methods: `addition`, `subtraction`, and
    // `multiplication`.
    /**
     * The function "addition" takes two float numbers as input and returns their sum.
     * 
     * @param op1 The first operand for addition. It is a float data type.
     * @param op2 The parameter "op2" is a float type variable that represents the second operand in
     * the addition operation.
     * @return the sum of the two input operands (op1 and op2).
     */
    float addition(float op1,float op2){
        return(op1+op2);
    }
   /**
    * The function performs subtraction of two floating-point numbers.
    * 
    * @param op1 The first operand for subtraction. It is a float data type.
    * @param op2 The op2 parameter is the second operand in the subtraction operation.
    * @return the result of subtracting `op2` from `op1`.
    */
    float subtraction(float op1,float op2){
        return(op1-op2);
    }
    /**
     * The function "multiplication" takes two float numbers as input and returns their product.
     * 
     * @param op1 The first operand for multiplication. It is a floating-point number.
     * @param op2 The second operand for the multiplication operation.
     * @return the product of the two input operands, op1 and op2.
     */
    float multiplication(float op1,float op2){
        return(op1*op2);
    }
    /**
     * The division function takes two float operands and returns their quotient.
     * 
     * @param op1 The first operand for division.
     * @param op2 The second operand for the division operation.
     * @return the result of dividing op1 by op2.
     */
    float division(float op1,float op2){
        return(op1/op2);
    }
    int square(int num){
        return(num*num);
    }
    int cube(int num){
        return(num*num*num);
    }
   // The code you provided is the main method of the Calculator1 class. The main method is the entry
   // point of the Java program and it is where the program starts executing.
    public static void main(String[] args){
        float op1=10;
        float op2=20;
        int num=3;
        Calculator1 cal=new Calculator1();
        float resultAdd=cal.addition(op1,op2);
System.out.println("Result of addition:"+resultAdd);
float resultSubtract=cal.subtraction(op1,op2);
System.out.println("Result of subtraction:"+resultSubtract);
float resultMultiply=cal.multiplication(op1,op2);
System.out.println("Result of multiplication:"+resultMultiply);
float resultDivide=cal.division(op1,op2);
System.out.println("Result of division:"+resultDivide);
int resultsq=cal.square(num);
System.out.println("Square of "+num+"is"+resultsq);
int resultcu=cal.cube(num);
System.out.println("Cube of "+num+"is"+resultcu);
    }
}

