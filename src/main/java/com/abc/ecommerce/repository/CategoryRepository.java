package com.abc.ecommerce.repository;

import com.abc.ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
