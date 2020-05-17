import java.lang.StringBuilder
import java.util.*
fun main() {
    val sc = Scanner(System.`in`);
    var n = sc.nextInt();
    var x = sc.nextInt();
    var answer:StringBuilder = StringBuilder();
    if(n*26<x || x<1*n){
        print("!")
        return;
    }
    var sum:Int = 0;
    for(i in 1..n){
        for(j in 'A'..'Z'){
            var value:Int = j - 'A' + 1;
            if( 26 * (n-i) >= x - sum - value){
                answer.append(j);
                sum += value;
                break;
            }
        }
    }
    print(answer);
    return;
}