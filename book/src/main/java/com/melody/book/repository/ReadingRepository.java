package com.melody.book.repository;

import com.melody.book.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * @author Melody
 * @date 2022/8/22 16:30
 */
public interface ReadingRepository extends JpaRepository<Reader, String> {
}
