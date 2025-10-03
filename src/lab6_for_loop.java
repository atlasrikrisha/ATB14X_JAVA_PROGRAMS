public class lab6_for_loop {
    public static void main(String[] args) {
        int[] data = {5, 8, 12, 20, 25};
        int target = 12;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}
