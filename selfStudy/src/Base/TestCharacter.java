package Base;

public class TestCharacter {
    public static void main(String[] args) {
        Character a = new Character('a');
        System.out.println(a);
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isWhitespace(' '));
        float a1 = 1.0f;
        int a2 = 2;
        String a3 = "3";
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s",a1 , a2, a3);

        System.out.printf("\n他的名字是%s,他的班级是%s,他的性别是%s,他的分数是%d","徐阳","软件2005","男",99);
    }

}
