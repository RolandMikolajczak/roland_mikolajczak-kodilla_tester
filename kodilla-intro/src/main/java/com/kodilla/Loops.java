package com.kodilla;

public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int a = names.length - 1; a >= 0; a--) {
            System.out.println(names[a]);
            int i = 0;
            while (i <= 10) {
                System.out.println(i);
                i++;
            }
        }
    int[] numbers = new int[]{1,2,3,4,5,6,};
        Loops tablica = new Loops();
        int result = tablica.sumNumbers(numbers);
        System.out.println(result);
    }

        public int sumNumbers ( int[] numbers){
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;
        }


}






