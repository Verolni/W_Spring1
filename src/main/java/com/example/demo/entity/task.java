package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Column(name = "create_Date", nullable = false)
    private LocalDate create_Date;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    public task() {
    }

    public task(LocalDate create_Date, String description, Long id, String status, String title) {
        this.create_Date = create_Date;
        this.description = description;
        this.id = id;
        this.status = status;
        this.title = title;
    }

    public LocalDate getCreate_Date() {
        return create_Date;
    }

    public void setCreate_Date(LocalDate create_Date) {
        this.create_Date = create_Date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "task{" +
                "create_Date=" + create_Date +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

