package gb.android.android_poplibs_001_architecture_mvp

import androidx.annotation.IntRange


class CountersModel {

    private val counters = mutableListOf(0, 0, 0)

    fun getCurrent(@IntRange(from = 0, to = 2) index: Int): Int {
        return counters[index]
    }

    fun inc(@IntRange(from = 0, to = 2) index: Int): Int {
        counters[index]++
        return getCurrent(index)
    }

    fun set(index: Int, value: Int) {
        counters[index] = value
    }

}

