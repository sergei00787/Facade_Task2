package netology.patterns;

public class BinOps {
    public String sum(String a, String b) {
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = Integer.parseInt(a, 2);
            num2 = Integer.parseInt(b, 2);
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return Integer.toBinaryString(num1 + num2);
    }

    public String mult(String a, String b) {
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = Integer.parseInt(a, 2);
            num2 = Integer.parseInt(b, 2);
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return Integer.toBinaryString(num1 * num2);
    }


}
