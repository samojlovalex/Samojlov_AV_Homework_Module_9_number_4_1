class PersonManager(private val personList: List<Person>) {

    val listPersonManager = personList.toMutableList()
    //Список сотрудников (старых и добавленных)

    fun addPerson(name: String, salary: Int){
        //Функция добавления сотрудников в список listPersonManager

        val personOne = Person (name, salary)
        listPersonManager.add(personOne)
    }

}