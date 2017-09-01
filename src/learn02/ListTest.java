package learn02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by anderson on 17-8-31.
 */
public class ListTest
{
    public static void main(String[] args)
    {
        String[] strs = {"Zhangsan", "Lisi", "Wangwu", "Zhaoliu"};
        List<String> list = Arrays.asList(strs);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
