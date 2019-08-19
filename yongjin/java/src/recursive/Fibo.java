package recursive;

public class Fibo {
    public static int fibo(int number) {

        if (number == 0 || number == 1)
            return number;

        else
            return fibo(number - 1) + fibo(number - 2);

    }

    public static void main(String[] args){
        System.out.println(fibo(0));
    }
}
