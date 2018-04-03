import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a;
        for(;;){
            try{
                a=Double.valueOf(JOptionPane.showInputDialog("Input Double number"));
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error number format");
            }catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "Canseled. Set default value");
                a=5;
                break;
            }
        }
        System.out.println(a);
    }
}
