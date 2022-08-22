package com.melody.book.repository;

import java.util.List;

import com.melody.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Melody
 * @date 2022/8/22 9:09
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
