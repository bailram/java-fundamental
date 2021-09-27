package tipedatanumber;

public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer Number
        byte iniByte = 0;
        short iniShort = 0;
        int iniInt = 0;
        long iniLong = 0;
        long iniLong2 = 0L;
        long iniLong3 = 0l;

        System.out.println("integer number");
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(iniLong3);
        System.out.println();

        // Floating Point Number
        float iniFloat = 3.14F;
        float iniFloat2 = 3.14f;
        double iniDouble = 3.14;

        System.out.println("floating point number");
        System.out.println(iniFloat);
        System.out.println(iniFloat2);
        System.out.println(iniDouble);
        System.out.println();

        // Kode Literals
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        System.out.println("kode literals");
        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);
        System.out.println();

        // Kode Underscore
        long balance = 1_000_000_000_000L;
        long sum = 60_000_000;

        System.out.println("kode underscore");
        System.out.println(balance);
        System.out.println(sum);
        System.out.println();

        // Konversi Tipe Data Number
        byte dByte = 10;
        short dShort = dByte;
        int dInt = dShort;
        long dLong = dInt;
        float dFloat = dLong;
        double dDouble = dFloat;

        float cFloat = (float) dDouble;
        long cLong = (long) cFloat;
        int cInt = (int) cLong;
        short cShort = (short) cInt;
        byte cByte = (byte) cShort;
    }
}
