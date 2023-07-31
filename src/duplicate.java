public class duplicate {
    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i==value)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 2, 10, 8, 12, 7, 10, 8, 12, 5, 14};
        int[] numbers2=new int[numbers.length];
        int startIndex=0;
        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        if(!isFind(numbers2,numbers[i]))
                        {
                            numbers2[startIndex++]=numbers[i];

                        }

                        break;
                    }
                }
            }
        }
        for (int value: numbers2){
            if(value !=0)
            {
                System.out.println(value);
            }
        }
    }
}
