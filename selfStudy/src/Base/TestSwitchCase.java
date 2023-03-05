package Base;

public class TestSwitchCase {
    public static void main(String[] args) {
        int score = 84;
        switch (score / 10){
            case 10:
                System.out.println("优秀");
                break;
            case 9:
                System.out.println("一般");
                break;
            case 8:
                System.out.println("中等");
                break;
            default:
                System.out.println("较差");
        }
    }
}
