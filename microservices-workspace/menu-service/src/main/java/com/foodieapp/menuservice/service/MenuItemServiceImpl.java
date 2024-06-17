package com.foodieapp.menuservice.service;

import com.foodieapp.menuservice.model.MenuItem;
import com.foodieapp.menuservice.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemServiceImpl implements MenuItemService{

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @Override
    public MenuItem getMenuItem(long id) {
        return menuItemRepository.findById(id).get();
    }

    @Override
    public java.util.List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @Override
    public MenuItem getMenuItemByName(String name) {
        return menuItemRepository.findByName(name);
    }

}
