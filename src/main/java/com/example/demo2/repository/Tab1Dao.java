package com.example.demo2.repository;

import com.example.demo2.model.Tab1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tab1Dao extends JpaRepository<Tab1,String>{
}
