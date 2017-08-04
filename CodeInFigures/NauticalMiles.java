import javax.swing.*;
// Adapted the required program so that you could put your own input in to calculate the distance, instead of having just 1 set distance that it would always calculate

public class NauticalMiles {
    public static void main(String[] args) {
        double KILOMETER = 1.852, MILES = 1.150779,UserInputToDouble;
        String NauticalMilesString;
        NauticalMilesString = JOptionPane.showInputDialog(null, "Please insert the number of Nautical miles you wish to convert to km or miles");
        UserInputToDouble = Double.parseDouble(NauticalMilesString);
        double NauticalMileToMile = UserInputToDouble * MILES, NauticalMileToKm = UserInputToDouble * KILOMETER;
        JOptionPane.showMessageDialog(null, UserInputToDouble + " nautical miles are equal to " + NauticalMileToKm +" kilometers and " + NauticalMileToMile + " Miles"  );

    }
}

