package ensyu04;

//焼売の漢字に焼くが入ってるのは、焼くに蒸すって意味も入ってるから
public class Q12 {
    public static void main(String[] args) {
        int[] points = new int[4];
        double[] weight = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];

        int[] moneyList = {121902,8302,55100};
        for (int i = 0; i < 3; i++) {
            System.out.println(moneyList[i]);
        }
        for (int i : moneyList) {
            System.out.println(i);
        }


        int[] numbers = {3,4,9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i < 3; i++) {
            if (numbers[i] == input){
                System.out.println("アタリ！");
            } else System.out.println("はずれ！！");
        }

        //この問題は拡張for文の方がいいらしい、添え字を直接使うか中身を見てるかの差、慣れないー
    }
}
