public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                System.out.print(i);
            }else if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.print(" - " + "FizzBuz");
            }else if((i % 3) == 0){
                System.out.print(" - " + "Fizz");
            }else if((i % 5) == 0){
                System.out.print(" - " + "Buzz");
            }else{
                System.out.print(" - " + i);
            }
        }
    }
}
