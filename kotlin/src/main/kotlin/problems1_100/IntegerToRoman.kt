package problems1_100

import java.util.TreeMap

enum class IntegerToRoman {
    DEFAULT {
        override fun intToRoman(num: Int): String = recurse(ROMANS, num)

        fun recurse(romans: TreeMap<Int, String>, num: Int): String {
            val floor = romans.floorKey(num)
            if (num == floor) {
                return romans[num]!!
            }
            return romans[floor] + recurse(romans, num - floor)
        }
    },
    ;

    abstract fun intToRoman(num: Int): String

    companion object {
        private val ROMANS = TreeMap<Int, String>()

        init {
            ROMANS[1000] = "M"
            ROMANS[900] = "CM"
            ROMANS[500] = "D"
            ROMANS[400] = "CD"
            ROMANS[100] = "C"
            ROMANS[90] = "XC"
            ROMANS[50] = "L"
            ROMANS[40] = "XL"
            ROMANS[10] = "X"
            ROMANS[9] = "IX"
            ROMANS[5] = "V"
            ROMANS[4] = "IV"
            ROMANS[1] = "I"
        }
    }
}
