package com.example.QuickNote.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity // Bu sınıfın bir veritabanı tablosu olduğunu belirtir.
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false) // Notun boş olamayacağını belirtir.
    private String title;
    
    @Column(nullable = false, length = 1000) // Notun boş olamayacağını ve maksimum 1000 karakter olabileceğini belirtir.
    private String content;
    
    @Column(nullable = false) // Notun boş olamayacağını belirtir.
    private LocalDateTime createdAt;
    
    // Getter ve Setter metotları
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
}
