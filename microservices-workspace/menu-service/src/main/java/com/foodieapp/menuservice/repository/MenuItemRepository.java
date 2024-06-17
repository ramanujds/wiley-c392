package com.foodieapp.menuservice.repository;

import com.foodieapp.menuservice.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem,Long> {

    public MenuItem findByName(String name);
}
