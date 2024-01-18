package OverloadingMethodsAndObjectComparisons;

public class Student implements Comparable<Student>{
    
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Let's create a method to compare
    public boolean equals (Student other) {
        if (this.name == other.name) {
            return true;
        } 
        else {
            return false;
        }
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return "Student(" + this.name + ")";
    }
}
