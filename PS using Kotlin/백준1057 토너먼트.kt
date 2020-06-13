import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.pow
import java.util.*
import kotlin.collections.ArrayList
fun main(){
    val bf = BufferedReader(InputStreamReader(System.`in`))
    var str = bf.readLine()
    var n = str.split(" ").get(0).toInt();
    var num1 = str.split(" ").get(1).toInt();
    var num2 = str.split(" ").get(2).toInt();
    for(i in 1..n){
        var interval = pow(2.0,(i).toDouble()).toInt() - 1
        var start = 0;
        var dest = 0;
        while(true){
            start = dest + 1;
            if(start > n) break;
            dest = start + interval
            if(dest>n) dest = n;
            //print("$start $dest\n")
            if(num1>=start && num1<=dest && num2>=start && num2<=dest){
                print("$i")
                return;
            }
        }
    }
    return;
}