package com.example.josephuscodingproblem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG",JosephusSolution(5,2).toString())
    }
}
/*There are N Children are seated on N chairs arranged around a circle.
The chairs are numbered from 1 to N. The game starts going in circles counting
the children starting with the first chair. Once the count reaches K, that child leaves the game,
removing his/her chair. The game starts again, beginning with the next chair in the circle.
The last child remaining in the circle is the winner. Find the child that wins the game.*/

fun JosephusSolution(chairs:Int,count:Int):Int{
    var result = 0

    // For finding out the removed
    // chairs in each iteration
    for (i in 2..chairs) {
        result = (result + count) % i
    }

    return result + 1
}