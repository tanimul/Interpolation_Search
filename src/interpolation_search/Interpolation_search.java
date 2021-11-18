package interpolation_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fuad
 */
public class Interpolation_search {

    static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers[] = {5, 2, 3, 4, 8, 10, 40, 50};
        int low = 0, high = numbers.length - 1;
        boolean isFound = false;
        Arrays.sort(numbers);
        System.out.println("Numbers after sorted: " + Arrays.toString(numbers));
        System.out.println("enter a value:");
        int value = getInput.nextInt();

        while (low <= high && value >= numbers[low] && value <= numbers[high]) {

            int index = low + ((value - numbers[low]) * (high - low)) / (numbers[high] - numbers[low]);

            if (numbers[index] < value) {
                low = index + 1;
            } else if (numbers[index] > value) {
                high = index - 1;
            } else {
                isFound = true;
                System.out.println(value + " found at index: " + index);
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Element not found!");
        }
    }

}
