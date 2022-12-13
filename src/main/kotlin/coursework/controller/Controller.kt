/*
package coursework.controller

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.asJdbcDriver
import com.zaxxer.hikari.HikariDataSource
import coursework.database.Database
import coursework.database.Authors
import coursework.database.Publishers
import coursework.database.Books
import coursework.model.DDBB
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

object Controller {

    val path = "src/main/resources/Libbase.sqlite"

    private val pcs = PropertyChangeSupport(this)

    var booksList: List<Books> = getBooks()
        get() = field
        private set(value) {
            val old = field
            field = value
            pcs.firePropertyChange("booksList", old, field)
        }

    var authorsList: List<Authors> = getAuthors()
        get() = field
        private set(value) {
            val old = field
            field = value
            pcs.firePropertyChange("authorsList", old, field)
        }

    var publishersList: List<Publishers> = getPublishers()
        get() = field
        private set(value) {
            val old = field
            field = value
            pcs.firePropertyChange("publishersList", old, field)
        }

    private fun getBooks(): List<Books> {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        return sqlQueries.allBooks().executeAsList()
    }

    private fun getSqlDriver(path: String ): SqlDriver {
        val ds = HikariDataSource()
        ds.jdbcUrl = "jdbc:sqlite:" + path
        ds.driverClassName = "org.sqlite.JDBC"
        ds.username = ""
        ds.password = ""
        return ds.asJdbcDriver()
    }

    fun add_books(Title: String, AuthorID: Long, Year: Long, PublisherID: Long, Subject: String, Authors: Long?=null, Publishers: Long?=null) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertBooks(Title,AuthorID,Year,PublisherID,Subject)
        booksList = getBooks()
    }

    private fun getAuthors(): List<Authors> {
        val database = Database(getSqlDriver(path))
        val authorsQueries = database.cWQueries
        return authorsQueries.allAuthors().executeAsList()
    }

    private fun getPublishers(): List<Publishers> {
        val database = Database(getSqlDriver(path))
        val publishersQueries = database.cWQueries
        return publishersQueries.allPublishers().executeAsList()
    }


    fun addAuthors(name: String, surname: String) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertAuthors(name,surname)
        authorsList = getAuthors()
    }

    fun addPublishers(name: String) {
        val database = Database(getSqlDriver(path))
        val sqlQueries = database.cWQueries
        sqlQueries.insertPublishers(name)
        publishersList = getPublishers()
    }


    fun addPropertyChangeListener(pcl: PropertyChangeListener?) {
        pcs.addPropertyChangeListener(pcl)
    }

    fun removePropertyChangeListener(pcl: PropertyChangeListener?) {
        pcs.removePropertyChangeListener(pcl)
    }


}

fun main() {
    Controller.booksList.forEach { it ->
        println(it)
    }
    Controller.add_books("RAFITA",18,"married","male",null)
    Controller.booksList.forEach { it ->
        println(it)
    }
}
controller*/
