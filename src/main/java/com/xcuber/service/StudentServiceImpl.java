package com.xcuber.service;

import com.xcuber.dao.StudentDao;
import com.xcuber.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudentById(Long id) {
        return studentDao.findById(id);
    }
}
