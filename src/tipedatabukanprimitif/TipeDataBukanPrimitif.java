package tipedatabukanprimitif;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        int iniInt = 23;
        Integer age = iniInt;

        System.out.println(age);

        // konversi dari tipe data object ke primitif
        short shortValue = age.shortValue();
        byte byteValue = age.byteValue();
        long longValue = age.longValue();

        System.out.println(shortValue);
        System.out.println(byteValue);
        System.out.println(longValue);
    }
}
