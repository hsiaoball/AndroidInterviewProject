package com.chiyo.interviewproject

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class TestCode {
    fun main() {

        var t1 : TreeNode? = TreeNode(0)
        val t = TreeNode(1)

        while (t1 != null) {
            t1.`val`
        }
        t.`val`
        t.let {     }

        val ll = LinkedList<Int>()
        val array = IntArray(3)
        val arrayList3 = ArrayList<Int>()
        arrayList3.size
        array.contains(3)
        array.forEach { item ->  arrayList3.add(item)}
        arrayList3.first()
        val arrayList = ArrayList<TreeNode>(initialCapacity = 0)
        
        arrayList.toArray()
        val root = TreeNode(3)
        val inList = listOf<TreeNode>()
        val p = Pair<Char, Int>('a', 3)
        val a = Integer.MAX_VALUE
        val map = HashMap<Int, Int>()
        for (pair in map) {
            pair.key
        }

        map[3] = map.getOrDefault(3, 0) + 1
        val intArrayList = ArrayList<Int>()
        intArrayList.toList().toIntArray()
        intArrayList.toIntArray()
        val list = listOf<Int>()
        list.toIntArray().sort()
        Note(1, true)
        var intA = 9
        intA.toString()[0]
        val s = "aa"
        var b = "bb"
        b.substring(4)
        if (s == b) {

        }
        s.replace('9', 'a').toInt()
        s.toMutableList().joinToString("")
        var array4 = arrayList3.clone() as ArrayList<Int>
        array4.removeAt(0)
        array4.add(3, 4)

        val arrayString : Array<String> = arrayOf("A")
        arrayString.contains("a")
        arrayString.toMutableList()
        arrayString.toHashSet()
        var in3 = 3
        in3.toChar()

    }

    fun helper(num: Int) : Int {
        var t = num
        t = 3
        return t
    }
}

data class Note(val id: Int, var hasApple: Boolean, var child: ArrayList<Note> = ArrayList())

internal class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
