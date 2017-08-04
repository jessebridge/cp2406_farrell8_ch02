import javax.swing.JOptionPane;

public class DebugTwo4 {
    public static void main(String[] args) {
        String coststring;
        double cost;
        final double tax = 0.06;
        coststring = JOptionPane.showInputDialog(null,"Enter price of item you are buying", "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        cost = Double.parseDouble(coststring);
        JOptionPane.showMessageDialog(null, "With " + tax * 100 +
                "% tax,  purchase  is $" + (cost - cost * tax));
    }
}
