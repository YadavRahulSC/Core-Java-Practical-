package Enums;

//Before Enums what problems we have faced
public class E_part1 {

    public static void main(String[] args) {
        //A payment service has status->success,failed,pending, a constant value.
        PaymentStatus p = new PaymentStatus();
        int status = p.success;
        System.out.println(status);

    }
}

//problem (
//1 Type safety since its a integer so anyone can give any value rather 1,2,3
// 2 Poor readability

/// 3 Duplicate values can also be given without enums


//we made a class representing the status for constants
class PaymentStatus {
    public final int success = 1;
    public final int failed = 1;
    public final int pending = 1;
}


