import java.util.Random;

public class VoucherCode{
    public static void main(String[] args){
        Random voucherCode = new Random();

        for (int i = 0; i < 10; i++){
            String code = new String("");
            for (int j = 0; j < 5; j++){
                code += voucherCode.nextInt(10);  
                code += ((char) (voucherCode.nextInt(26) + 'A'));     
            }
            System.out.println("Voucher kode yang berlaku: " + code);
        }
    }
}