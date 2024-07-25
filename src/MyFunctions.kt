import kotlinx.coroutines.delay

class MyFunctions {

    fun checkPerson(personChoice: String): String {
        //Функция формирования исключения при вводе неверного значения

        val check: Boolean = personChoice == "1" || personChoice == "2" || personChoice == "0"

        if (!check) {
            throw Exception(
                "Введено недопустимое значение"
            )
        }
        return personChoice
    }

    suspend fun readDataPersonList(map: Map<Person, Int>) {
        //Функция вывода конечной карты сотрудников на печать с задержкой

        var k = 0
        for (i in map) {
            delay(1000L)
            println("Сотрудник: ${i.key}; пароль: ${i.value}")
            k++
            if (k == map.size) break
        }
    }
}