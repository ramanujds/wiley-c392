package com.foodieapp.menuservice.api;

import com.foodieapp.menuservice.model.MenuItem;
import com.foodieapp.menuservice.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menus")
public class MenuItemApi {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("/{id}")
    public MenuItem getMenuItem(long id){
        return menuItemService.getMenuItem(id);
    }

    @GetMapping
    public java.util.List<MenuItem> getAllMenuItems(){
        return menuItemService.getAllMenuItems();
    }

    @GetMapping("/name/{name}")
    public MenuItem getMenuItemByName(String name){
        return menuItemService.getMenuItemByName(name);
    }

    @PostMapping
    public MenuItem createMenuItem(MenuItem menuItem){
        return menuItemService.createMenuItem(menuItem);
    }

}
