package com.example.demo.serviceTask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface services_Task extends JpaRepository <services_Task, Long> {

    List <Task> task_List_Cont(String title);
}
