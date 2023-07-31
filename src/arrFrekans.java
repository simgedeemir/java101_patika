public class arrFrekans {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frequencies = new int[numbers.length];
        boolean[] checked = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (checked[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    checked[j] = true;
                }
            }

            frequencies[i] = count;
        }

        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < numbers.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println(numbers[i] + " sayısı " + frequencies[i] + " kere tekrar edildi.");
            }
        }
    }
}
