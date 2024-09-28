public class Days {
    public static void main(String[] args) {
        int hours = 89 ;
        int day_h0urs = 24;
        int total_days = hours / day_h0urs;
        int day = hours % day_h0urs;
        System.out.printf("共"+total_days+"天零"+day+"小时");
    }
}