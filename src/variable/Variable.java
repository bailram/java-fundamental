package variable;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Dhimas Bayu Ilham Ramadhan";

        int age = 21;
        String address = "Malang";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

//        var name1; // error
//        name1 = "Dhimas Bayu Ilham Ramadhan";

        var age1 = 21;
        var address1 = "Malang";

//        System.out.println(name1);
        System.out.println(age1);
        System.out.println(address1);

        final String name2 = "Dhimas Bayu Ilham Ramadhan";
        var age2 = 21;
        var address2 = "Malang";

//        name2 = "Nama diubah"; // error

        System.out.println(name2);
        System.out.println(age2);
        System.out.println(address2);
    }
}
