public class JavaVariableExamples {
    public static void main(String[] args) {
        /*
        * What is a variable?
         * A variable is a representation of a value. 
         * Techincally, a variable is a storage location in memory that is represented by a name.
         */

        /*
         * Example 1: The Power of Variables and Representation
         * In this example, the power of a variable can be illustrated.
         * For this example, simply change the value of the variable "name" to your name.
         */
        String name = "Veren Villegas";
        
        System.out.println("Hello " + name+"!\n Did you know:" +
         name + " that you are awesome?\n"
        +"You know who else is awesome " + name+ "\n Your viewers!\n"+
        "Okay "+ name + ". Goodbye!");

        /*
         * Example 2: Variable Types (Statically and Dynamically Typed Variables)
         * In all programming languages, variables have a type. 
         * A type determines what type of data a variable can hold. 
         * 
        */
        String message = "Hello World";
        /* 
         * 
         * Some languages are statically typed (The type of a variable is declared at runtime)
         * This means that you have to specify the type of the variable when you declare it.
         * Statically typed languages include Java, C, C++, etc. 
         * 
         * Dynamically typed languages are languages that interpret the type of a variable at runtime.
         * The type of a variable is determined by the data it holds. 
         * Dynamically typed languages include JavaScript, Python , etc.
         * 
         * The type of a variable is important depending on what you wan to do with the variable.
         */

         /*In Java, there are 8 primitive data types
          * Primitive data types are those that are predefined in a language
          *Primitive data types also have their values stored directly rather than by reference.
          */
        int intVariable;            //32 bit integer
        long longVariable;          //64 bit integer
        short shortVariable;        //16 bit integer
        byte byteVariable;          //8 bit integer
        double doubleVariable;      //64 bit floating point
        float floatVariable;        //32 bit floating point
        char charVariable;          //Unicode character
        boolean booleanVariable;    //False and true

        /*
         * Non-primitive data types are those that are not predefined in a language.
         * Non-primitive data types also have their values stored through reference.
         * Non-primitive data types include Strings and arrays, as well as classes that you define. 
         */
        String stringVariable;
        int[] intArrayVariable;

        /*
         * Example 3: Variable naming conventions
         * When declaring a variable, remember the syntax: 
         * VARIABLE TYPE | VARIABLE NAME | ASSIGNMENT OPERATOR (=) | VARIABLE VALUE | ;
         */

        /*
         * Variable names are case sensitive
         */

         //These two variables are not the same.
         int v = 1; 
         int V = 1;

         /* 
         * Make sure you use good variable names.
         */

         //Bad example
         String a = "Veren Villegas";
         int b = 19; 
         boolean c = true; 

         //Good example
         String personName = "Veren Villegas";
         int age = 19;
         boolean isMale = true;

         String nameOfTheFootballClubVariable; 

         /*
          * Different programming languages have different variable naming conventions
          *In Java, variable names are camelCase. 
          */

        String messageToTheWorld = "Hello World";
        int goalsScored = 0;
        boolean hasDisease = false;
    }
}