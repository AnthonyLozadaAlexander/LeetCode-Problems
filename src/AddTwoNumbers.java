import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoNumbers {
    void main() {

        ArrayList<Integer> L1 = new ArrayList<Integer>();
        ArrayList<Integer> L2 = new ArrayList<Integer>();

        int[] resultado = new int[3];

        L1.addAll(Arrays.asList(2, 4, 3));
        L2.addAll(Arrays.asList(5, 6, 4));

        int carry = 0;
        int sum = 0;

        for (int i = 0; i < L1.size(); i++) {
            if (carry == 1) {
                sum = L1.get(i) + L2.get(i) + carry;
            } else {
                sum = L1.get(i) + L2.get(i);
            }
            carry = sum / 10; // el carry sera 1 si la suma es mayor a 10 y 0 si es menor a 10
            resultado[i] = sum % 10;

        }

        int count = 0;
        for (int i : resultado) {
            System.out.println("Resultado[" + count + "] = " + i);
            count++;
        }

    }
}
