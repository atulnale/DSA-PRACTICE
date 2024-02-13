package problem22;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        List<String> strings = approach1.generateParenthesis(1);
        for(String str : strings){
            System.out.printf(str+"\t");
        }

    }

    @Test
    void basic2() {
        List<String> strings = approach1.generateParenthesis(2);
        for(String str : strings){
            System.out.printf(str+"\t");
        }

    }

    @Test
    void basic3() {
        List<String> strings = approach1.generateParenthesis(3);
        for(String str : strings){
            System.out.printf(str+"\t");
        }

    }
}