package problem5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Approach2Test {
    Approach2 approach2 = new Approach2();
    @Test
    void aaa() {
        String aaa = approach2.longestPalindrome("aaa");
    }
    void a() {
        String a = approach2.longestPalindrome("a");
        assertEquals(a,"a");
    }

    @Test
    void aa() {
        String a = approach2.longestPalindrome("aa");
        assertEquals(a,"aa");
    }
    @Test
    void aab() {
        String a = approach2.longestPalindrome("aab");
        assertEquals(a,"aa");
    }
    @Test
    void baab() {
        String a = approach2.longestPalindrome("baab");
        assertEquals(a,"baab");
    }
    @Test
    void babad() {
        String a = approach2.longestPalindrome("babad");
        assertEquals(a,"bab");
    }
    @Test
    void cbbd() {
        String a = approach2.longestPalindrome("cbbd");
        assertEquals(a,"bb");
    }

    @Test
    void aacabdkacaa() {
        String a = approach2.longestPalindrome("aacabdkacaa");
        assertEquals(a,"aca");
    }
    @Test
    void aacakbacaa() {
        String a = approach2.longestPalindrome("aacakbacaa");
        assertEquals("aca",a);
    }

    @Test
    void bacabab() {
        String a = approach2.longestPalindrome("bacabab");
        assertEquals("bacab",a);
    }
    @Test
    void bacab() {
        String a = approach2.longestPalindrome("bacab");
        assertEquals("bacab",a);
    }
    @Test
    void biggerString() {
        String a = approach2.longestPalindrome("nmngaowrbsssvihklwmuqshcddwlxrywrlwtennwfvrevgvhsvgeccfulmuvrcksdmgeqrblnlwoepefhcwhmgyvgcoyyygrmttyfycxwbqktpurlcfhzlakhmrddsydgygganpmaglaxyhfwjusukzcnakznygqplngnkhcowavxoiwrfycxwdkxqfcjqwyqutcpyedbnuogedwobsktgioqdczxhikjrbkmqspnxcpngfdwdaboscqbkwforihzqdcppxjksiujfvlpdjryewaxgmdgigvxdlstxwngtbdrrkfudjinzyxbdmkautclvvyguekuzwwetmsxittgtxbnvvrgasvnlogdiepltweaehubwelznidltzlbzdsrxmhjpkmylnwkdsxnpkplkdzywioluaqguowtbaoqzqgjfewphqcvlnwlojbxgomvxxkhwwykawegxubjiobizicuxzeafgautefsurgjlbhcfevqzsbhwxycrcaibdsgluczcuewzqupakbzmcvzsfodbmgtugnihyhqkvyeboqhqldifbxuaxqzxtyejoswikbzpsvzkxcndgeyvfnyrfbkhlalzpqjueibnodamgpnxlkvwvliouvejcpnakllfxepldfmdzszagkyhdgqqbkb");
        assertEquals("uczcu",a);
    }
}