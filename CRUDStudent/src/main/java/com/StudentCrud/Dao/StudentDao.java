package com.StudentCrud.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentCrud.Entities.Students;

//We Use this interface to get ready made methods to manipulate data(In simple words)
public interface StudentDao extends JpaRepository<Students, Integer> {


}