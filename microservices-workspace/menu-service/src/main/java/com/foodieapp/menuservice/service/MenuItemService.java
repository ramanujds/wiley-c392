package com.foodieapp.menuservice.service;

import com.foodieapp.menuservice.model.MenuItem;

import java.util.List;

public interface MenuItemService {

    public MenuItem createMenuItem(MenuItem menuItem);
    public MenuItem getMenuItem(long id);
    public List<MenuItem> getAllMenuItems();
    public MenuItem getMenuItemByName(String name);

}
