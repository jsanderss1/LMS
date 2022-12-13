package coursework.IO/*
package coursework.IO

import coursework.database.FACULTY
import coursework.database.LECTURER
import coursework.database.Lecturer_by_Faculty
import coursework.model.DDBB
import coursework.sorting.Bubble
import coursework.sorting.QuickSort

object Interpreter {

    fun LECTURER.toRow(): String =
        "${this.id}\t${this.NAME}\t${this.AGE}" +
        "\t${this.STATUS}\t${this.GENDER}\t${this.FACULTY_ID}"

    fun FACULTY.toRow(): String = "${this.id}\t${this.NAME}"
    fun Lecturer_by_Faculty.toRow(): String = "${this.NAME}\t${this.AGE}\t${this.STATUS}\t${this.GENDER}"


    fun main() {

        Utilities.help()
        var code = 1 // Hack
        do {
            try {
                code = Utilities.prompt_Int()
                when (code) {
                    1 -> DDBB.getLecturers().forEach { lec ->
                        println(lec.toRow())
                    }

                    2 -> DDBB.getFaculties().forEach { faculty ->
                        println(faculty.toRow())
                    }

                    3 -> {
                        val name = Utilities.prompt_String("\t Name : ")
                        DDBB.addFaculty(name)
                    }

                    4 -> {
                        val name = Utilities.prompt_String("\t Name : ")
                        val age = Utilities.prompt_Int("\t Age : ").toLong()
                        val status = Utilities.prompt_String("\t Status : ")
                        val gender = Utilities.prompt_String("\t Gender : ")
                        DDBB.add_lecturer(name, age, status, gender)
                    }

                    5 -> {
                        val scrambled = ArrayList(DDBB.getLecturers())
                        val choice = Utilities.prompt_Int("\tBubble(1),MergeSort(2),QuickSort(3) : ")
                        var n = 0
                        when (choice) {
                            1 -> {
                                n = Bubble.sort(scrambled)
                                scrambled.forEach { lec ->
                                    println(lec.toRow())
                                }
                            }

//                            2 -> {
//                                val pair = MergeSort.sort(scrambled)
//                                n = pair.second
//                                pair.first.forEach { lec ->
//                                    println(lec.toRow())
//                                }
//                            }

                            3 -> {
                                n = QuickSort.sort(scrambled)
                                scrambled.forEach { lec ->
                                    println(lec.toRow())
                                }
                            }
                        }
                        println("--------------------")
                        println("Ticks ${n}")
                    }

                    6 -> {
                        val id = Utilities.prompt_Int("\t Code : ")
                        DDBB.lecturesByFaculty(id.toLong()).forEach {
                            println(it.toRow())
                        }
                    }

                    0 -> println("Bye!")
                    10 -> Utilities.help()
                    else -> println("Uncorrect command")
                }
            } catch (e: Exception) {
                println("Uncorrect command")
            }
        } while (code != 0)
    }
}



*/
