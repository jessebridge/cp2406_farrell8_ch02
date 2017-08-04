import java.util.Scanner;
/* This program takes a user input and removes the last digit and then divides the new number by 7 which
is used to be compared against the last number to determine whether a ticket is fake or real for a travel
ticket company */

public class TicketNumber {
    public static void main(String[] args) {
        long TicketIdNumber = GetTicketNumber();
        long RemoveLastNumber = RemoveTicketLastNumber(TicketIdNumber);
        System.out.println(RemoveLastNumber);
        long Remainder = DivideNumber(RemoveLastNumber);
        System.out.println(Remainder);
        long LastNumber = FindLastNumberOfTicket(TicketIdNumber);
        System.out.println(LastNumber);
        boolean Result = TicketVerification(Remainder, LastNumber);
        System.out.println(Result);


    }

    // This method is used to get the input from the user which becomes the Tickets ID number
    public static long GetTicketNumber() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println(" Please enter your ticket number ");
        long UsersTicketNumber = UserInput.nextLong();
        return UsersTicketNumber;

    }

    //  This method removes the last number of the ticket, by converting the long to a string and then removing the last character and then converting it back to a number
    public static Long RemoveTicketLastNumber(long ticketIdNumber) {
        String TicketIdNumberAsString = String.valueOf(ticketIdNumber);
        String NewTicketNumber = TicketIdNumberAsString.substring(0, TicketIdNumberAsString.length() - 1);
        long EditedTicketNumber = Long.parseLong(NewTicketNumber);
        return EditedTicketNumber;


    }

    //  This method uses the number - the last number and modulos it by 7 and then returns the remainder to be compared
    public static long DivideNumber(long RemoveLastNumber) {
        long RemainderOfTicketNumber = RemoveLastNumber % 7;
        return RemainderOfTicketNumber;
    }

    //  This method uses the complete ticket number to determine the last number that was in the sequence to be compared to the divided number
    public static long FindLastNumberOfTicket(long TicketIdNumber) {
        long EndTicketNumber = TicketIdNumber % 10;
        return EndTicketNumber;

    }

    //  This method uses boolean to determine whether the remained and the last number on the ticket match, if they do it returns true, if they don't it returns false
    private static boolean TicketVerification(long remainder, long lastNumber) {
        return remainder == lastNumber;
    }

}
