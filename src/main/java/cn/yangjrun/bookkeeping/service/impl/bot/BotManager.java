package cn.yangjrun.bookkeeping.service.impl.bot;

import org.apache.ibatis.scripting.xmltags.SetSqlNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jirun.yang
 * @date 2020-04-10 09:20
 **/
public class BotManager {

    public static void main(String[] args) {
        Set<String> semanticSet = new HashSet<>();
        semanticSet.add("吗");
        semanticSet.add("?");

        String str = "这是一段中文吗?";
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            String var1 = str.substring(i,i+1);
            String var2 = "";
            for (int j = i + 1; j < str.length(); j++) {
                if (semanticSet.contains(str.substring(j, j + 1))) {
                    wordSet.add(str.substring(j, j + 1));
                } else {
                    var2 = var2 + str.substring(j, j + 1);
                    wordSet.add(var1 + var2);
                }
            }
        }
        wordSet.stream().forEach(System.out::println);
    }

}
