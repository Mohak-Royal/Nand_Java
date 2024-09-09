// Scenario 3: Math Calculations
// In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.



class MathUtils{
    final void squareRoot(){
        System.out.println("This is Square Root");
    }

    final void logarithm(){
        System.out.println("This is Logarithm");
    }
}



class MathsScientific extends MathUtils{
    @Override
    final void squareRoot(){

    }

    @Override
    void logarithm(){

    }
}