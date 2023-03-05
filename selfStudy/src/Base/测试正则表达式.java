package Base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 测试正则表达式 {
    public static void main(String[] args) {
//        String pattern = "\\d{10}";
//        String content = "2030200233";
//        System.out.println(content.matches(pattern)?"正确":"请输入正确格式的学号");
//        String str = "";
//        for (String s : str.split("[ ]+")) {
//            System.out.println(s);
//        }

//        Pattern pattern = Pattern.compile("(\\d{6})(\\d{8})(\\d{2})(\\d)(\\d|X|x)");
//        Matcher matcher = pattern.matcher("41078120000812201X");
//        if(matcher.matches()){
//            System.out.println("可能是一个身份证号");
//            System.out.println("出生地区编号为  " + matcher.group(1) + "\t");
//            System.out.println("出生年月为:    " + matcher.group(2) + "\t");
//            System.out.println("办理此人身份证明的派出所编号为:" + matcher.group(3) + "\t");
//            System.out.println(matcher.group(4).equals("1")?"性别：    男":"性别：    女");
//        }
//        System.out.println(matcher.start());
//        System.out.println(matcher.end());

//        //全文检索，找到含有o的字母
//        Pattern pattern = Pattern.compile("\\w*o\\w*");
//        String s = "the quick brown fox jumps over the lazy dog.";
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()){
//            System.out.print(s.substring(matcher.start(),matcher.end()) + "     ");
//        }

        //含通配符的批量替换
        String date = "2022 11 18 02 18";
        String s = date.replaceAll("(\\d{4})", "<$1>");
        System.out.println(s);


    }
}
