# README
## Project Description
`A simple web-application, where you can create Article, which have its own authors, data creating and
the jornal, where this article is. Of course you can edite it, save, find using different ways and
delete it.`
## Features:
* ✅ **Inject data for Quick Start**
* ✅ **Create new Article**
* ✅ **Get article by ID**
* ✅ **Get all articles**
* ✅ **Get articles between data (from/to)**
* ✅ **Get article by key word in title**
* ✅ **Get article by key word in content**
* ✅ **Delete article by ID**


## 📝 List of technologies used in the project
* Intellij IDEA
* H2SQL
* Spring Boot

## 📀 Instructions for launching the project

1. Clone project (need to push Code button and choose in what way you want to get project)
2. Open with **IntelliJ IDEA** (if you do not have this program - download it [here](https://www.jetbrains.com/idea/))
3. So, we have Intellij and Browser(Safari, Google Chrome etc.)
4. Find the TestTaskApplication(path: src/main/java/article/test_task/TestTaskApplication.java)
5. Push the RUN button 👉 application will start it's work

### INJECT
#### Injecting prepared data (for fast start to see how it works)
- First You need to Inject data to see how this app works. You have to write http://localhost:8080/articles/inject

##### If you want to see how data looks in database, here you can check it in easy way. Just write in your browser: http://localhost:8080/h2-console. Then you must find file **_application.properties_** in this project. The path to the file is (src/main/resources/application.properties), check there for JDBC URL, User Name and write the PASSWORD for connection.
#### Important! 
#### Before going to h2-console, be sure that you made INJECT


### Creating yours own data
- It is very easy. Please write (**_as example_**): http://localhost:8080/articles/create/FirstArticleTitle/FirstArtContent/NewYork/Bob/Bobinson/2022-01-10
    - **`http://localhost:8080/articles/`** - is a main way to create your data
    - **`/create`** - you asking for create data
    - **`/FirstArticleTitle`** - here you have to write yours articles Title
    - **`/FirstArtContent`** - here you have to write FirstArticles Content
    - **`/NewYork`** - is example JournalTitle where your article is (you can write here yours)
    - **`/Bob`** - is example FirstArticle's author's first name (you can write here yours)
    - **`/Bobinson`** - is example FirstArticle's author's last name (you may write here yours)
    - **`/2022-01-10`** - is data when FirstArticle was written (you may write here yours)

#### How to get existing data by Id
- Please write in browser: http://localhost:8080/articles/1
    - **`http://localhost:8080/articles/`** - is a main way to get your data
    - **`/1`** - is an example number-Id, which you can get

#### How to get ALL data 
- Please write in browser: http://localhost:8080/articles/getAll
  - **`http://localhost:8080/articles/`** - is a main way to get your data
  - **`/getAll`** - write it if you want to get all data

#### How to find articles FROM one date To another date
- Please write in browser: http://localhost:8080/articles/byDate/from2010-01-01/to2010-01-01
  - **`http://localhost:8080/articles/`** - is a main way to get your data
  - **`byDate/from2010-01-01/to2010-01-01`** -is a way to get articles between 2010-01-01 and 2010-01-01

#### How to get article by key word in title
- Please write in browser: http://localhost:8080/articles/by-title/One
  - **`http://localhost:8080/articles/`** - is a main way to get your data
  - **`/by-title/One`** - is a way to get article where in title is a word "**One**"

#### How to get article be key word in content
- Please write in browser: http://localhost:8080/articles/by-content/first
  - **`http://localhost:8080/articles`** - is a main way to get your data
  - **`by-content/first`** - is a way to get article where in content is a key word "**first**"

#### How to delete article by Id
- Please write in browser: http://localhost:8080/articles/delete1
  - **`http://localhost:8080/articles`** - is a main way to get your data
  - **`/delete1`** - is a way delete article with Id = 1# testArticle
