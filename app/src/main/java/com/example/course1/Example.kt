package com.example.course1

fun main(){
    println("hello world");
    var myStudent: Student = Student("rishika",19,"vit")
    println(myStudent.name)
    myStudent.name="rish"
    println(myStudent.name)

    var myEmployee: Employee = Employee("rish2",20,"vellore")
    println(myEmployee.getName())
    println(myEmployee.name)
}