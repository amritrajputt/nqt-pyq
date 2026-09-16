// You have a list of students with their marks. Your task is to print the top K students
// ranked by their marks in descending order. If there are fewer than K students, print
// all.
// Sample Input:
// 2 4
// 85 Alice
// 92 Bob
// 78 Charlie
// 90 David 
// Sample Output:
// Bob: 92
// David: 90

import java.util.*;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            String name = sc.next();
            arr.add(new Student(marks, name));
        }
        ArrayList<Student> topStudents = new ArrayList<>();
        topKStudents(arr, k, topStudents);
        for (Student s : topStudents) {
            System.out.println(s.name + ": " + s.marks);
        }
        sc.close();
    }

    static void topKStudents(ArrayList<Student> arr, int k, ArrayList<Student> topStudents) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Student s : arr) {
            pq.add(s);
            while (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            topStudents.add(pq.poll());
        }
        Collections.reverse(topStudents);
    }
}
class Student  implements Comparable<Student>{
    int marks;
    String name;
    Student(int marks, String name){
        this.marks = marks;
        this.name = name;   
    }
    public int compareTo(Student other){
        if(this.marks == other.marks){
            return this.name.compareTo(other.name);
        }
        return Integer.compare(other.marks, this.marks);
    }
}