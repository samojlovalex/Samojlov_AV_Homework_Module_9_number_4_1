import kotlinx.coroutines.delay

class Password(list: MutableList<Person>) {

    private val listIn = list

    suspend fun addPassword(): Map<Person, Int> {
        //Генерация пароля с задержкой и формирование карты со списком сотрудников
        // в качестве ключей
        val mapOut = mutableMapOf<Person, Int>()
        var password = 0
        for (i in listIn.indices) {
            delay(500L)

            fun passwordGenerate(): Int {
                val firstPasswordChar = ('1'..'9').random()
                val passwordSecond = (0..4).map { ('0'..'9').random() }.toMutableList()
                passwordSecond.add(0, firstPasswordChar)
                val passwordOutput = passwordSecond.toList().fold("") { a, b -> "$a$b" }.toInt()
                return passwordOutput
            }

            password = passwordGenerate()

            mapOut[listIn[i]] = password
        }
        return mapOut
    }
}