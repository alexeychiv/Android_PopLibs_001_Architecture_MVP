package gb.android.android_poplibs_001_architecture_mvp

import androidx.annotation.IntRange


class CountersModel {

    private val counters = Counters(0, 0, 0)

    fun inc1(): Int {
        return ++counters.counter1
    }

    fun inc2(): Int {
        return ++counters.counter2
    }

    fun inc3(): Int {
        return ++counters.counter3
    }

    fun set(@IntRange(from = 1, to = 3) index: Int, value: Int) {
        when (index) {
            1 -> counters.counter1 = value
            2 -> counters.counter2 = value
            3 -> counters.counter3 = value
            else -> error("ERROR: Wrong counter index!")
        }
    }

}

