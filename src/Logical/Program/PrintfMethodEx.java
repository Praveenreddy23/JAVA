package Logical.Program;

public class PrintfMethodEx {
    /*
    printf() -> an optional method to control, format,and display text to the console window
                two arguments = format String +(object/variable/value)
                %[flags] [precision] [width] [conversion-character]
     */
    public static void main(String[] args) {
       // System.out.printf("%d This is a format string ", 123);//123 This is a format string
        //System.out.printf("\nThis is a format string %d", 123);// This is a format string 123

        boolean myBoolean = true;
        char myChar = '$';
        String myString = "Da";
        int myInt = 23;
        double myDouble = 23;
        double myDouble1 = 100;

        //System.out.printf(" \n %s",myString);
        //System.out.printf(" \n %c",myChar);
        //System.out.printf(" \n %b",myBoolean);
        //System.out.printf(" \n %d",myInt);
        //System.out.printf(" \n %f",myDouble);

        /*
        [width]
        ->minimum number of characters to be written as output.
         */
        System.out.printf("Hello %s",myString);//Hello Da
        System.out.printf("Hello %10s",myString);//Hello         Da
        System.out.printf("Hello %-10s",myString);//Hello Da

        /*
        [precision]
        ->sets number of digits of precision when outputting floating point values.
         */
      //  System.out.printf("%f",myDouble);//23.000000
        //System.out.printf("%.2f",myDouble);//23.00
        //System.out.printf("%.1f",myDouble);//23.0

        /*
        [flag]
        ->adds an effect to output based on the flag added to format specifier
          - : left-justify
          + : output a plus ( + ) or minus ( - ) sign for a numeric value
          0 : numeric values are zero-padded
          , : comma grouping separator if numbers > 1000
         */
        //System.out.printf("%f",myDouble1);//100.000000
        //System.out.printf("%+f",myDouble1);//+100.000000
       // System.out.printf("%020f",myDouble1);//0000000000100.000000



    }
}
