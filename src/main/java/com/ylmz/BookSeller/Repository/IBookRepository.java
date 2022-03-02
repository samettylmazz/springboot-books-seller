package com.ylmz.BookSeller.Repository;

import com.ylmz.BookSeller.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {

}
