package com.example.student.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public List<Student> findAll() { return new ArrayList<>(students); }
    public Student findById(Long id) {
        return students.stream().filter(s -> s.getStudentId().equals(id)).findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student not found: " + id));
    }
    public Student register(Student student) {
        student.setStudentId(sequence.getAndIncrement());
        students.add(student);
        return student;
    }
    public void delete(Long id) { students.remove(findById(id)); }
}
