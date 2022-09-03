package switchstatement;

public class SwitchStatement {
    public static void main(String[] args) {
        var a = "A";

        switch (a) {
            case "A" :
                System.out.println("Nilai A");
                break;
            case "B" :
                System.out.println("Nilai B");
                break;
            default:
                System.out.println("tidak ditemukan");
        }

        // switch case lamda, support di java 14 keatas
//        switch (a) {
//            case "A" -> System.out.println("Nilai A");
//            case "B", "C" -> System.out.println("Nilai B atau C");
//            default -> {
//                System.out.println("Tidak ditemukan");
//            }
//        }

        // switch case pake yield, Support di java 14 keatas
//        var value = switch (a) {
//            case "A" :
//                yield "Nilai A";
//            case default :
//                yield "tidak ditemukan";
//        };
//        System.out.println(value);
    }
}
