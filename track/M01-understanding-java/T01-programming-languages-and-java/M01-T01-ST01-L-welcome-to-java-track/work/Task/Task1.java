
class Task1 {

    public static void main(String[] args) {
        int m1 = 90;
        int m2 = 92;
        int m3 = 87;
        int m4 = 30;
        int m5 = 50;
        int total = m1 + m2 + m3 + m4 + m5;

        double percentage = (m1 > 0 && m1 < 100) && (m2 > 0 && m2 < 100) && (m3 > 0 && m3 < 100) && (m4 > 0 && m4 < 100) && (m5 > 0 && m5 < 100) ? total / 500.0 * 100 : 0;
        System.out.println(percentage);
        String result = (percentage < 40) ? "Fail" : (percentage < 60) ? "pass" : (percentage < 80) ? "First Class" : "Distinction";
        System.out.println(result);
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        int i = 1;
        while (i <= 5) {
            System.out.print(" " + i);
            i++;
        }
        do {
            System.out.println(" " + i);
            i++;
        } while (i <= 5);

        int j = 1;
        do {
            int k = 1;
            while (k <= 2) {
                System.out.println(j + " " + k);
                k++;
            }
            j++;
        } while (j <= 3);
    }
}
