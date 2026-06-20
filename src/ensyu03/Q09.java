package ensyu03;

public class Q09 {
    public static void main(String[] args) {
        int weight = 60;
        if (weight == 60){
            System.out.println("等しい");
        }

        int age1 = 20;
        int age2 = 15;
        if ((age1 + age2) * 2 > 60){
            System.out.println("60超え");
        }

        int age = 3;
        if ((age % 2) == 1){
            System.out.println("奇数");
        }

        String name = "湊";
        if (name.equals("湊")){
            System.out.println("等しい");
        }
    }
}
