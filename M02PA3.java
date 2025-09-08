import java.util.Scanner;

public class M02PA3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number (1s and 0s): ");
        String binaryString = input.nextLine(); //input for binaryString

        //try catch exception block
        try
        {
            int decimal = bin2Dec(binaryString);//call bin2dec method
            System.out.println("Decimal Value: " + decimal); //output the decimal equivalent
        } 
        catch (NumberFormatException ex) {System.out.println("Error: Not a binary number");} //error message

        input.close();//close input stream
    }

    // Method to convert binary string to decimal
    public static int bin2Dec(String binaryString) throws NumberFormatException 
    {
        int decimal = 0;

        for (int i = 0; i < binaryString.length(); i++) 
        {
            char ch = binaryString.charAt(i); //check each value

            if (ch != '0' && ch != '1') {throw new NumberFormatException();} //if not a binary, throw binary exception otherwise continue

            decimal = decimal * 2 + (ch - '0'); //convert to decimal
        }

        return decimal;
    }
}