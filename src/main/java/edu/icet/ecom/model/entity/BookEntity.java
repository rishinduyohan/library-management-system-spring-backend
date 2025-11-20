package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookEntity {
    @Id
    private String id;
    private String isbn;
    private String name;
    private String author;
    private String publishedDate;
    private double price;
}
