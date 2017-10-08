package com.aya.springboot.test.repository;

import com.aya.springboot.test.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
