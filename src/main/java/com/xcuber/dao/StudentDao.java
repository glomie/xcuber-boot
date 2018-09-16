package com.xcuber.dao;

import com.xcuber.model.Student;

public interface StudentDao {

    Student findById(Long id);
}
