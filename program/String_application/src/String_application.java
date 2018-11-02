import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class String_application {

    public void judgeDigit(String[] str) {
        for(int i=0;i<str.length;i++)
        {
            Pattern p = Pattern.compile("[^0-9]");
            Matcher m = p.matcher(str[i]);
            if(m.find())
            {
                System.out.println(str[i]+"该字符串不全是数字");
            }
            else
            {
                System.out.println(str[i]+"该字符串全是数字");
            }
        }

    }

    public void judgeUpper(String[] str){
        for(int i=0;i<str.length;i++)
        {
            Pattern p = Pattern.compile("[^A-Z]+");
            Matcher m = p.matcher(str[i]);
            if(m.find())
            {
                System.out.println(str[i]+"该字符串不全是大写字母");
            }
            else
            {
                System.out.println(str[i]+"该字符串全是大写字母");
            }
        }
    }

    public void judgelower(String[] str){
        for(int i=0;i<str.length;i++)
        {
            Pattern p = Pattern.compile("[^a-z]+");
            Matcher m = p.matcher(str[i]);
            if(m.find())
            {
                System.out.println(str[i]+"该字符串全是小写字母");
            }
            else
            {
                System.out.println(str[i]+"该字符串不全是小写字母");
            }
        }
    }

    /*public void lower_to_upper(String[] str){
        Pattern p1 = Pattern.compile("[a-z][A-Z]");//判断是否全为字母
        for(int i=0;i<str.length;i++)
        {
            Matcher m = p1.matcher(str[i]);
            if(m.find())
            {
                p1=toUpperCase()
            }
        }
    }*/

    public static void main(String[] args) {
        String str = new String();
        str = "cbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String[] str0 = str.split(",");
        String_application method = new String_application();
        method.judgeDigit(str0);

        System.out.println("\n");

        method.judgeUpper(str0);

        System.out.println("\n");

        method.judgelower(str0);
    }

}