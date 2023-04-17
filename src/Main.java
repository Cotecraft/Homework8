public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-2");


        int [] bigBox = new int [3];
        bigBox[0] = 1;
        bigBox[1] = 2;
        bigBox[2] = 3;
        double [] mediumBox = new double [3];
        mediumBox[0] = 1.57;
        mediumBox[1] = 7.654;
        mediumBox[2] = 9.986;
        int [] smallBox = new int [2];
        smallBox[0] = 5;
        smallBox[1] = 6;
        System.out.print(bigBox [0] + ", ");
        System.out.print(bigBox [1] + ", ");
        System.out.print(bigBox [2]);
        System.out.println();
        System.out.print(mediumBox [0] + ", ");
        System.out.print(mediumBox [1] + ", ");
        System.out.print(mediumBox [2]);
        System.out.println();
        System.out.print(smallBox [0] + ", ");
        System.out.print(smallBox [1]);
        System.out.println();
        System.out.print(bigBox [2] + ", ");
        System.out.print(bigBox [1] + ", ");
        System.out.print(bigBox [0]);
        System.out.println();
        System.out.print(mediumBox [2] + ", ");
        System.out.print(mediumBox [1] + ", ");
        System.out.print(mediumBox [0]);
        System.out.println();
        System.out.print(smallBox [1] + ", ");
        System.out.print(smallBox [0]);
        System.out.println();

        System.out.println("Задача 4");

        int [] bucket = new int [3];
        bucket[0] = 1;
        int q = bucket[0];
        bucket[1] = 2;
        int w = bucket[1];
        bucket[2] = 3;
        int e = bucket[2];
        bucket[0] = q + 1;
        bucket [2] = e + 1;
        System.out.println(bucket[0]);
        System.out.println(bucket[2]);
        }

    }