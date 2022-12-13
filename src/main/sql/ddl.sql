CREATE TABLE if not exists Books (
BookID INTEGER PRIMARY KEY AUTOINCREMENT,
Title TEXT NOT NULL,
AuthorID INTEGER,
Year INTEGER NOT NULL,
PublisherID INTEGER,
Subject TEXT NOT NULL,
FOREIGN KEY(AuthorID) REFERENCES Authors(ID),
FOREIGN KEY(PublisherID) REFERENCES Publishers(ID)
);

allBooks:
SELECT *
FROM Authors;

CREATE TABLE if not exists Authors (
 ID INTEGER PRIMARY KEY AUTOINCREMENT,
 Name TEXT NOT NULL,
 Surname TEXT NOT NULL
);

CREATE TABLE if not exists Publishers (
 ID INTEGER PRIMARY KEY AUTOINCREMENT,
 Name TEXT NOT NULL
);

drop table Books
drop table Authors
drop table Publishers
