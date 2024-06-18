package com.foodieapp.orderservice.dto;

import java.util.List;



public record OrderRequestDto(List<MenuItemDto> menuItems) {



}
