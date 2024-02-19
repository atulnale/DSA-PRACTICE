package problem30;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        List<Integer> result = approach1.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<Integer> result = approach1.findSubstring("barfoofoobarthefoobarman", new String[]{"foo", "bar","the"});
        System.out.println(result);
    }
    @Test
    void basic3() {
        List<Integer> result = approach1.findSubstring("aaaaaaaa", new String[]{"aa","aa","aa"});
        System.out.println(result);
    }
}