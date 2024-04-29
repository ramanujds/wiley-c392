**Case Study: Online Food Ordering System**

**Overview:**
An online food ordering system is needed to facilitate the ordering and delivery of food from various restaurants. The system should allow users to browse menus, place orders, track delivery status, and manage their accounts.

**Modules:**

1. **Restaurant Management Module:**
    - User Story 1: As an admin, I want to add new restaurants to the system with details like name, cuisine type, and location.
    - User Story 2: As an admin, I want to update restaurant details such as menu items and opening hours.
    - User Story 3: As an admin, I want to deactivate restaurants temporarily if they are closed or violate policies.

2. **Menu Browsing and Ordering Module:**
    - User Story 1: As a customer, I want to browse menus of available restaurants, filtered by cuisine type or location.
    - User Story 2: As a customer, I want to add items to my cart, specifying quantity and any special instructions.
    - User Story 3: As a customer, I want to place an order, providing delivery address and payment details.

3. **Delivery Management Module:**
    - User Story 1: As a delivery agent, I want to view pending orders assigned to me, along with delivery addresses and contact information.
    - User Story 2: As a delivery agent, I want to update the status of orders (e.g., picked up, en route, delivered) in real-time.
    - User Story 3: As a customer, I want to track the status of my order and receive notifications on its progress.

**Implementation using Java Concepts:**
- Create a base class `Restaurant` with common attributes like name and location.
- Subclasses like `FastFoodRestaurant` and `FineDiningRestaurant` inherit from `Restaurant`, adding specific attributes and behaviors.
- Use `HashMap` or `HashSet` to store restaurant and menu information efficiently.
- Implement methods to add, update, and deactivate restaurants, and to browse menus.
- Handle exceptions like `RestaurantNotFoundException` and `OrderProcessingException` gracefully.
- Use try-catch blocks to handle errors during order processing, such as invalid input or database connectivity issues.

