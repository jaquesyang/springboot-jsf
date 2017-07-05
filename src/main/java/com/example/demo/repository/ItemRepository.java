package com.example.demo.repository;

import com.example.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaquesyang on 2017/7/5.
 */
@Transactional
public interface ItemRepository extends JpaRepository<Item, Long> {
}
