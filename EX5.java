import java.util.*;
public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for number A and B
        System.out.print("Enter the Number A   : ");
        int A = input.nextInt();

        System.out.print("Enter the Number B   : ");
        int B = input.nextInt();

        // 3. Integer toString(int i)
        System.out.println("Integer toString of A: " + Integer.toString(A));

        // 4. Integer toHexString(int i)
        System.out.println("Hexadecimal of A: " + Integer.toHexString(A));

        // 5. Integer toBinaryString(int i)
        System.out.println("Binary representation of A: " + Integer.toBinaryString(A));

        // 6. Integer toOctalString(int i)
        System.out.println("Octal representation of A: " + Integer.toOctalString(A));

        // 7. Integer.MAX_VALUE
        System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);

        // 8. Integer.MIN_VALUE
        System.out.println("Minimum value of Integer: " + Integer.MIN_VALUE);

        // 9. Integer.compare(int x, int y)
        System.out.println("Compare A and B: " + Integer.compare(A, B));

        // 10. Integer.compareTo(Integer anotherInteger)
        Integer integerA = Integer.valueOf(A);
        Integer integerB = Integer.valueOf(B);
        System.out.println("Compare A and B using compareTo: " + integerA.compareTo(integerB));

        // 11. Integer.equals(Object obj)
        System.out.println("Is A equal to B using equals method: " + integerA.equals(integerB));

        // 13. Integer.reverse(int i)
        System.out.println("Reverse bits of A: " + Integer.reverse(A));

        // 21. Integer.valueOf(int i)
        System.out.println("Value of integer A: " + Integer.valueOf(A));

        // 22. Integer.byteValue()
        System.out.println("Byte value of A: " + integerA.byteValue());

        // 23. Integer.shortValue()
        System.out.println("Short value of A: " + integerA.shortValue());

        // 24. Integer.longValue()
        System.out.println("Long value of A: " + integerA.longValue());

        // 25. Integer.floatValue()
        System.out.println("Float value of A: " + integerA.floatValue());

        // 26. Integer.doubleValue()
        System.out.println("Double value of A: " + integerA.doubleValue());

        // 27. Integer.hashCode()
        System.out.println("Hash code of A: " + integerA.hashCode());
    }
}
