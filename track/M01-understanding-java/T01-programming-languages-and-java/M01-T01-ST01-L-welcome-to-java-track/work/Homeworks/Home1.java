
class Home1 {

    public static void main(String[] args) {
        System.out.println("While Break");
        //While Break
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("While Continue");

        // While Continue
        int j = 1;
        while (j <= 5) {
            if (j != 3) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }

        System.out.println("do-while Break");

        // dowhile break
        int k = 1;
        do {
            if (k == 3) {
                break;
            }
            System.out.println(k);
            k++;
        } while (k <= 5);

        System.out.println("do-while Continue");

        // dowhile continue
        int l = 1;
        do {
            if (l == 3) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        } while (l <= 5);
    }
}
