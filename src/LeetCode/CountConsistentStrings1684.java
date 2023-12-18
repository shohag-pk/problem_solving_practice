package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allow = new HashSet<>();
        for (int i = 0; i <allowed.length() ; i++) {
            allow.add(allowed.charAt(i));
        }
        for (int i = 0; i < words.length ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                if (!allow.contains(words[i].charAt(j))){
                    break;
                }
                if (j == words[i].length() - 1){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String allowed = "sxhjmknuqr";
        String words[] = {"jrmnnnuu",
                "mr",
                "qxxhks",
                "hqjsqnn",
                "sx",
                "ssmq",
                "qr",
                "srnkkmhsk",
                "kjgxgtdda",
                "xnmjusm",
                "hrsn",
                "snmnusuxn",
                "xriwfq",
                "pytlwunjl",
                "rxkuknuq",
                "pgduynckcg",
                "mjjsrnms",
                "dkniacooes",
                "kms",
                "agkgowgwt",
                "uxmn",
                "rlbcplbwo",
                "rqhhjkx",
                "rrmxs",
                "nxxjqsu",
                "snuqkhhujq",
                "qkxn",
                "dcfrf",
                "sjxxnu",
                "asqcmtmjx",
                "xskujj",
                "icr",
                "ihyvefknod",
                "nn",
                "qumrns",
                "kruj",
                "sx",
                "x",
                "hkxr",
                "xh",
                "dmvvh",
                "qms",
                "mnrshhuh",
                "djeuqsz",
                "mmqqnx",
                "wmt",
                "u",
                "h",
                "ohspnqyb",
                "nxmksn",
                "xsnx",
                "sn",
                "hnrmenm",
                "hkqkkuhrmu",
                "vssvzd",
                "xq",
                "juxhh",
                "r",
                "ns",
                "rh",
                "s",
                "ujh",
                "mqqjquq",
                "rtanmwbe",
                "kxn",
                "qumssuuqm",
                "nhmnkq",
                "yfbzxsjlri",
                "y",
                "js",
                "xqnkhuxjsm",
                "khs",
                "iuode",
                "rhhmkm",
                "hurumhkjk",
                "feeswaaws",
                "t",
                "uusxqrhxmh",
                "jsur",
                "hksmkqur",
                "oud",
                "hunnlw",
                "njjhxmmxrq",
                "q",
                "hums",
                "sjmhxhmkqq",
                "xrms",
                "qusqshs",
                "eplvk",
                "vmncdlocfl",
                "sxm",
                "kxrj",
                "xrshxsqhhs",
                "rn",
                "qrhr",
                "hh",
                "xxqnrhkskq",
                "nuj",
                "nurskmqxrs",
                "inbnmdbol",
                "pt",
                "jq",
                "snurrsjqnn",
                "bju",
                "psv",
                "uuuk",
                "hmnxhxmr",
                "gxouij",
                "keld",
                "juns",
                "pbvmlhgux",
                "e",
                "cgmn",
                "urpwcomzyp",
                "hnqrj",
                "knxshmk",
                "tvgslwj",
                "srmshmknmm",
                "s",
                "vvivypquw",
                "zojswirgyg",
                "pznhheumue",
                "jqnquj",
                "xhksjkumrr",
                "fkjtcjoj",
                "mqnbd",
                "jkhjjmqru",
                "smmsskhj",
                "rmkunx",
                "unhrhsnu",
                "ssxrsqrq",
                "n",
                "x",
                "jmx",
                "krqhnjrrq",
                "nqhxxqs",
                "jhm",
                "nxsqjuqq",
                "fcpjuu",
                "rnrkqjhkhh",
                "hxsxmj",
                "smsnnxju",
                "sjx",
                "mhuxj",
                "fqwuavqiq",
                "xnnhukxrnm",
                "quj",
                "xnrr",
                "znykrpqp",
                "xxuhsn",
                "p",
                "azbtwq",
                "l",
                "jkkmq",
                "dausiqk",
                "kxksmk",
                "jhmqunsj",
                "n",
                "xmk",
                "qu",
                "qn",
                "ugohe",
                "rnn",
                "z",
                "uhqkmhu",
                "rcwhrikkrg",
                "mhmhqjm",
                "atcwdddjng",
                "qg",
                "runssxxr",
                "gif",
                "qjmrrnumuk",
                "nxj",
                "njt",
                "rhxk",
                "gkqejdzqu",
                "uxsqrmqnqm",
                "qntd",
                "hnxqkxknm",
                "xx",
                "dfmanol",
                "j",
                "l",
                "hrjrrsu",
                "cxomduo",
                "qkkknx",
                "shj",
                "qnruqm",
                "suqnmq",
                "omibh",
                "q",
                "xmnqsnujkh",
                "kxux",
                "qknnkr",
                "ur",
                "usmsrqjn",
                "xjnnqsnukx"};
        countConsistentStrings(allowed,words);
    }
}
