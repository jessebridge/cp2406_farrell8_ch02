import javax.swing.JOptionPane;
public class SalaryDialog
{
   public static void main(String[] args)
   {
       String wagestring, dependentsstring;
       double wage, weeklyPay;
       int dependents;
       final double HOURS_IN_WEEK = 37.5;
       wagestring = JOptionPane.showInputDialog(null,
          "Enter employee's hourly wage", "Salary dialog 1",
          JOptionPane.INFORMATION_MESSAGE);
       weeklyPay = Double.parseDouble(wagestring) *
          HOURS_IN_WEEK;
       dependentsstring = JOptionPane.showInputDialog(null,
          "How many dependents?", "Salary dialog 2",
          JOptionPane.QUESTION_MESSAGE);
       dependents = Integer.parseInt(dependentsstring);
       JOptionPane.showMessageDialog(null, "Weekly salary is $" +
          weeklyPay + "\nDeductions will be made for " +
          dependents + " dependents");
    }
}