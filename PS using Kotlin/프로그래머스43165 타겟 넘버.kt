import java.util.*
import java.util.concurrent.CopyOnWriteArraySet
var ans:Int = 0
var num = intArrayOf();
class Solution {
    fun dfs(x:Int,sum:Int,max:Int,target:Int){
        if(x == max){
            if(sum + num[x] == target || sum-num[x] == target) ans++;
            return;
        }
        dfs(x+1,sum+num[x],max,target);
        dfs(x+1,sum-num[x],max,target);
        return;
    }
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0;
        num = numbers;
        dfs(0,0,numbers.size-1,target);
        answer = ans;
        return answer;
    }
}
fun main() {
    var s = Solution();
    var a:IntArray = intArrayOf(1,1,1,1,1);
    print(s.solution(a,3));
}