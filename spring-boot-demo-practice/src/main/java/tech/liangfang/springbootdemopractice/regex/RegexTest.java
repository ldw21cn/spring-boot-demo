package tech.liangfang.springbootdemopractice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/26 10:21
 */
public class RegexTest {
    public static void main(String[] args) {

       /* String reg = "(.*)(好的|可以|可以的|行|行吧)(.*)";

        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher("好的我一会过去");

        if (matcher.find() && matcher.groupCount() > 0) {
            String s = matcher.group(3);
            System.out.println(s);
        }*/

        Pattern r = Pattern.compile("(.*)(好的|可以|可以的|行|行吧)(.*)");
        Matcher m = r.matcher("好的我一会过去");
        if (m.find( )) {
            System.out.println(m.group(3));
        }


    }
}
