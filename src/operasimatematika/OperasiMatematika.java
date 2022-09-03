package operasimatematika;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // operasi augmented assignments
        int c = 2;

        c = c + 10; // operasi matematika
        System.out.println(c);
        c += 10; // augmented assignment
        System.out.println(c);
        c -= 10; // augmented assignment
        c /= 10; // augmented assignment
        c *= 10; // augmented assignment
        c %= 10; // augmented assignment
        System.out.println(c);

        // unary operator
        b++; // b = b + 1
        b--; // b = b - 1
        c = +1; // gak wajib ditambahkan +, default sudah positif
        c = -1;
        System.out.println(b);
        System.out.println(c);
    }
}
