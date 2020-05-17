import java.util.*

fun main() {
    var sc = Scanner(System.`in`);
    var n = sc.nextInt();
    var p = arrayOfNulls<Int>(n);
    var s = arrayOfNulls<Int>(n);
    var overlap = mutableSetOf<Array<Int?>>();
    for(i in 0..n-1){
        var element = sc.nextInt();
        p.set(i,element);
    }
    for(i in 0..n-1){
        var element = sc.nextInt();
        s.set(i,element);
    }
    var shuffle = arrayOfNulls<Int>(n);
    var copy_shuffle = arrayOfNulls<Int>(n);
    for(i in 0..n-1){
        shuffle.set(i,i);
    }
    var answer = 0;
    while(true){
        var check = false;
        for(i in 0..n-1){
            if(i%3 != p[shuffle[i]!!]) {
                check= true;
                break;
            };
        }
        if(!check){
            println(answer);
            return;
        }
        for(i in 0..n-1){
            copy_shuffle[i] = shuffle[i];
        }
        if( answer >= 200000){
            println(-1);
            return;
        }
        for(i in 0..n-1){
            shuffle[s!!.get(i)!!] = copy_shuffle[i];
        }
        answer++;
    }
}

