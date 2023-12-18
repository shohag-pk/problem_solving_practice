package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindJudge {
    public static int findJudge(int n, int[][] trust) {

        List<Integer> judge = new ArrayList<>();

       for (int i=1; i<=n; i++){
           judge.add(i);
       }

        for (int i=0; i<trust.length; i++){
            if (judge.contains(trust[i][0])){
                judge.remove(judge.indexOf(trust[i][0]));
            }
        }

        int checkJudge = -1;

        if(judge.size()>0){

            checkJudge = judge.get(0);
            for (int i = 1; i <= n; i++) {

                if(i == checkJudge) continue;

                boolean hasTrust = false;

                for (int j = 0; j < trust.length; j++) {
                    if(trust[j][0] == i && trust[j][1] == checkJudge){
                        hasTrust = true;
                        break;
                    }
                }

                if(!hasTrust){
                    checkJudge = -1;
                    break;
                }

            }

        }

        return checkJudge;
    }

    public static void main(String[] args) {
        int trust[][] = {{1,3},{2,3},{3,1}};
        int n = 3;
        findJudge(n, trust);
    }
}
