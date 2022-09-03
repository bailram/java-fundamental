package methodvariableargument;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] nilai = {80,80,80,80};
        sayCongratsOld("Dhimas", nilai);
        sayCongrats("Bayu", 80, 50, 50, 80);
    }

    static void sayCongratsOld(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var ipk = total / values.length;
        if (ipk >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    // method variable argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var ipk = total / values.length;
        if (ipk >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
