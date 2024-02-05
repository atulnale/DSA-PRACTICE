package problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void a() {
        String a = approach1.longestPalindrome("a");
        assertEquals(a,"a");
    }

    @Test
    void aa() {
        String a = approach1.longestPalindrome("aa");
        assertEquals(a,"aa");
    }
    @Test
    void aab() {
        String a = approach1.longestPalindrome("aab");
        assertEquals(a,"aa");
    }
    @Test
    void baab() {
        String a = approach1.longestPalindrome("baab");
        assertEquals(a,"baab");
    }
    @Test
    void babad() {
        String a = approach1.longestPalindrome("babad");
        assertEquals(a,"aba");
    }
    @Test
    void cbbd() {
        String a = approach1.longestPalindrome("cbbd");
        assertEquals(a,"bb");
    }

    @Test
    void aacabdkacaa() {
        String a = approach1.longestPalindrome("aacabdkacaa");
        assertEquals(a,"aca");
    }
    @Test
    void aacakbacaa() {
        String a = approach1.longestPalindrome("aacakbacaa");
        assertEquals("aca",a);
    }

    @Test
    void bacabab() {
        String a = approach1.longestPalindrome("bacabab");
        assertEquals("bacab",a);
    }
    @Test
    void bacab() {
        String a = approach1.longestPalindrome("bacab");
        assertEquals("bacab",a);
    }
    @Test
    void biggerString() {
        String a = approach1.longestPalindrome("nmngaowrbsssvihklwmuqshcddwlxrywrlwtennwfvrevgvhsvgeccfulmuvrcksdmgeqrblnlwoepefhcwhmgyvgcoyyygrmttyfycxwbqktpurlcfhzlakhmrddsydgygganpmaglaxyhfwjusukzcnakznygqplngnkhcowavxoiwrfycxwdkxqfcjqwyqutcpyedbnuogedwobsktgioqdczxhikjrbkmqspnxcpngfdwdaboscqbkwforihzqdcppxjksiujfvlpdjryewaxgmdgigvxdlstxwngtbdrrkfudjinzyxbdmkautclvvyguekuzwwetmsxittgtxbnvvrgasvnlogdiepltweaehubwelznidltzlbzdsrxmhjpkmylnwkdsxnpkplkdzywioluaqguowtbaoqzqgjfewphqcvlnwlojbxgomvxxkhwwykawegxubjiobizicuxzeafgautefsurgjlbhcfevqzsbhwxycrcaibdsgluczcuewzqupakbzmcvzsfodbmgtugnihyhqkvyeboqhqldifbxuaxqzxtyejoswikbzpsvzkxcndgeyvfnyrfbkhlalzpqjueibnodamgpnxlkvwvliouvejcpnakllfxepldfmdzszagkyhdgqqbkb");
        assertEquals("uczcu",a);
    }

}
