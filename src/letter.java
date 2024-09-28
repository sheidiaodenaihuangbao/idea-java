public class letter {
    public static void main(String[] args) {
        int arr[] =new int[26];
        for(int i = 0;i < 26;i++){
            arr[i] = 'A' + i;
            System.out.print((char)arr[i] + " ");
        }
    }
}
