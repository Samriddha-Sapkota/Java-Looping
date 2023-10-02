public class File_5 {
    public static void main(String[] args) {
        int even_count = 0, odd_count = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                even_count = even_count + 1;
            }else {
                odd_count = odd_count + 1;
            }
        }
        if (even_count > odd_count){
            System.out.println("There are more even numbers.");
        }else if (even_count < odd_count) {
            System.out.println("There are more odd numbers. ");
        } else if (even_count == odd_count) {
            System.out.println("They are equal. ");
        }
    }
}