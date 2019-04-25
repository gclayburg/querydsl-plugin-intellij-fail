## 2018-2-23
This project was created to demonstrate this [query dsl issue](https://github.com/ewerk/gradle-plugins/issues/93)

## 2019-4-25 update
It appears the issue above is no longer reproducible with IntelliJ 2019.1.1

## 

This project now demonstrates the [issue described here](https://stackoverflow.com/questions/55835115/is-it-possible-to-override-the-gradle-tasks-intellij-idea-chooses-to-run-when-de)
  
 To reproduce:
 1. Import this project into IntelliJ IDEA 2019.1.1
 2. Verify the project will build with the gradle tool window (gradle->tasks->build->build)
 3. Try building the project with IntelliJ (Build->Build Project)
 
 If Intellij is using the default setting to delegate builds to gradle, it fails with a message that begins with:

```
2:30:21 PM: Executing tasks ':classes :testClasses :querydslClasses'...
``` 

