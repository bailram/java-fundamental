package tipedataarray;

public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Dhim";
        arrayString[1] = "Dhimdhim";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);

        // array initializer
        String[] arrayString2 = new String[2];

        int[] arrayInt = new int[]{
                1,2,3,4
        };

        String[] nama = {
                "Dhimas", "Bayu"
        };

        String[][] squad = {
                {"dhim", "bay"},
                {"il", "ram"}
        };

        // operasi di array
        // set value
        arrayString[0] = "value array 0";
        // get
        System.out.println(arrayString[0]);
        // get length
        System.out.println(arrayString.length);
    }
}
