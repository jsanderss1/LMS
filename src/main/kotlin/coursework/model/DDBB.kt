package coursework.model/*package coursework.model

import coursework.database.LECTURER
import coursework.database.Database
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.asJdbcDriver
import com.zaxxer.hikari.HikariDataSource
import coursework.database.FACULTY
import coursework.database.Lecturer_by_Faculty


object DDBB {


    val path = "src/main/resources/lecturer.sqlite"

    fun lecturesByFaculty( id: Long): List<Lecturer_by_Faculty> {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        return sqlQueries.lecturer_by_Faculty(id).executeAsList()
    }


    fun getLecturers(): List<LECTURER> {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        return sqlQueries.allLecturers().executeAsList()
    }

    fun add_lecturer(name: String, age: Long, status: String, gender: String, faculty: Long?=null) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertLecturer(name,age,status,gender,faculty)
    }


    private fun getSqlDriver(path: String ): SqlDriver {
        val ds = HikariDataSource()
        ds.jdbcUrl = "jdbc:sqlite:" + path
        ds.driverClassName = "org.sqlite.JDBC"
        ds.username = ""
        ds.password = ""
        return ds.asJdbcDriver()
    }

    fun addFaculty(name: String) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertFaculty(name)
    }
    fun getFaculties(): List<FACULTY> {
        val database = Database(getSqlDriver(path))
        val facultyQueries = database.cWQueries
        return facultyQueries.allFaculties().executeAsList()
    }

}*/


// this is for testing.
//fun main() {
//    val lectures = DDBB.getLecturers()
//    for (lecture in lectures) {
//        println(lecture)
//    }
//    println(lectures)
//
//    val faculties = DDBB.getFaculties()
//    for (faculty in faculties) {
//        println(faculty)
//
//    }
//}

