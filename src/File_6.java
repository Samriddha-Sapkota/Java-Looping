public class File_6 {
    public static void main(String[] args) {
        int even_count = 0, odd_count = 0, temp1 = 0, temp2 = 0, temp3 = 0 , temp4 = 0;
        for (int i = 0; i < 11; i++){
            if (i % 2 == 0){
                even_count = even_count + 1;
                temp1 = i;
                temp2 = temp1 + i;
            }else {
                odd_count = odd_count + 1;
                temp3 = i;
                temp4 = temp3 + i;
            }
        }
        System.out.println(temp2);
        System.out.println(temp4);
        if (temp2 > temp4){
            System.out.println(temp2);
        }
        else {
            System.out.println(temp4);
        }
    }
}
