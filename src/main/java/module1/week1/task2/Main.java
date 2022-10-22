package module1.week1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("S.No.\t  Data Type\t   Size\t  Min. Value\t\t\t  Max. Value\t");

        // Since Byte is 8 Bit, We can encode 2**8 symbols (256 s.)
        System.out.println("1\t\t\t" + "Byte\t\t" + Byte.SIZE + "\t\t" + Byte.MIN_VALUE + "\t\t\t\t\t" + Byte.MAX_VALUE);

        // Since Byte is 8 Bit, We can encode 2**32 symbols (4294967296 s.)
        System.out.println("2\t\t\t" + "Integer\t\t" + Integer.SIZE + "\t\t" + Integer.MIN_VALUE + "\t\t\t\t" + Integer.MAX_VALUE);

        // Since Byte is 8 Bit, We can encode 2**16 symbols (65536 s.)
        System.out.println("3\t\t\t" + "Short\t\t" + Short.SIZE + "\t\t" + Short.MIN_VALUE + "\t\t\t\t\t" + Short.MAX_VALUE);

        // Since Byte is 8 Bit, We can encode 2**32 symbols (4294967296 s.)
        System.out.println("4\t\t\t" + "Float\t\t" + Float.SIZE + "\t\t" + Float.MIN_VALUE + "\t\t\t\t\t" + Float.MAX_VALUE);

        // Since Byte is 8 Bit, We can encode 2**64 symbols (1.8446744e+19 s.)
        System.out.println("5\t\t\t" + "Long\t\t" + Long.SIZE + "\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);

        // Since Byte is 8 Bit, We can encode 2**64 symbols (1.8446744e+19 s.)
        System.out.println("6\t\t\t" + "Double\t\t" + Double.SIZE + "\t\t" + Double.MIN_VALUE + "\t\t\t\t" + Double.MAX_VALUE);

        // Since Byte is 8 Bit, We can encode 2**16 symbols (65536 s.)
        System.out.println("7\t\t\t" + "Character\t" + Character.SIZE);
    }
}
