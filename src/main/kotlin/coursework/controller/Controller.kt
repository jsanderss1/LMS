package coursework.controller

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.asJdbcDriver
import com.zaxxer.hikari.HikariDataSource
//import coursework.database.Database
//import coursework.database.FACULTY
//import coursework.database.LECTURER
//import coursework.model.DDBB
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

object Controller {

    val path = "src/main/resources/LibBase.sqlite"

 /*   private val pcs = PropertyChangeSupport(this)

    var lecturerList: List<LECTURER> = getLecturers()
        get() = field
        private set(value) {
            val old = field
            field = value
            pcs.firePropertyChange("lecturerList", old, field)
        }

    var facultyList: List<FACULTY> = getFaculties()
        get() = field
        private set(value) {
            val old = field
            field = value
            pcs.firePropertyChange("facultyList", old, field)
        }

    private fun getLecturers(): List<LECTURER> {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        return sqlQueries.allLecturers().executeAsList()
    }

    private fun getSqlDriver(path: String ): SqlDriver {
        val ds = HikariDataSource()
        ds.jdbcUrl = "jdbc:sqlite:" + path
        ds.driverClassName = "org.sqlite.JDBC"
        ds.username = ""
        ds.password = ""
        return ds.asJdbcDriver()
    }

    fun add_lecturer(name: String, age: Long, status: String, gender: String, faculty: Long?=null) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertLecturer(name,age,status,gender,faculty)
        lecturerList = getLecturers()
    }

    private fun getFaculties(): List<FACULTY> {
        val database = Database(getSqlDriver(path))
        val facultyQueries = database.cWQueries
        return facultyQueries.allFaculties().executeAsList()
    }


    fun addFaculty(name: String) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertFaculty(name)
        facultyList = getFaculties()
    }


    fun addPropertyChangeListener(pcl: PropertyChangeListener?) {
        pcs.addPropertyChangeListener(pcl)
    }

    fun removePropertyChangeListener(pcl: PropertyChangeListener?) {
        pcs.removePropertyChangeListener(pcl)
    }


}

fun main() {
    Controller.lecturerList.forEach { it ->
        println(it)
    }
    Controller.add_lecturer("RAFITA",18,"married","male",null)
    Controller.lecturerList.forEach { it ->
        println(it)
    }*/
}