import java.util.*

class Solution1 {
    fun correct(a:String,b:String):Boolean{
        var check = 0;
        for(i in 0..a.length-1){
            if(a[i]==b[i]) continue;
            else check++;
        }
        return check == 1
    }
    fun solution(begin: String, target: String, words: Array<String>): Int {
        var answer = 0
        var q: Queue<String> = LinkedList();
        var visited = mutableMapOf<String,Int>()
        q.add(begin);
        visited[begin] = 0;
        while(!q.isEmpty()){
            var temp = q.remove();
            //println(temp);
            if(temp == target) return visited[temp]!!;
            for(i in 0..words.size-1){
                if(correct(temp,words[i]) && !visited.containsKey(words[i])){
                    q.add(words[i]);
                    visited[words[i]] = visited[temp]!! + 1;
                }
            }
        }
        return 0;
    }
}
fun main() {
    var s = Solution1();
    var a :Array<String> = arrayOf("hot","dot","dog","lot","log","cog");
    println(s.solution("hit","cog",a));
}