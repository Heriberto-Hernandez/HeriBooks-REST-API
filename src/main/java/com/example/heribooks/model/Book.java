package com.example.heribooks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private int idBook;

    @Column(name="tittle_book", length = 50, nullable = false)
    private String tittle;

    @Column(name="autor_book", length = 50, nullable = false)
    private String autor;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    private Category category;

    @Column(nullable = false)
    private boolean enabled;
}
