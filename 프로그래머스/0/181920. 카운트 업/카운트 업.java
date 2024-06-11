import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        List<Integer> array = new ArrayList<>();
        
        for(int i=start_num; i<=end_num; i++){
            array.add(i);
        }
        
        answer = new int[array.size()];
        
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}