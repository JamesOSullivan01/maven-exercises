import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public static void main(String[] args) {
        String world = "world";
        System.out.println(StringUtils.prependIfMissing(world, "Hello, "));
    }
}
