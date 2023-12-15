Feature: Purchase of products on the website

  Scenario: Select, add, and validate products successfully
    Given 'The user' that I am on the homepage of luegopago.com
    When I select products list and add them to the shopping cart
      | category              | subcategory                    | product                                                           | amount |
      | Celulares y Teléfonos | Cables de Audio y TV           | Cable Tipo C A Jack 3.5mm                                         | 3      |
      | Juegos y Juguetes     | Armas y Lanzadores de Juguetes | Juguete Espada Minecraft Niños Led Sonido Dizfras + Baterias Azul | 2      |
    Then I can verify that the total number of products and the price are correct

  Scenario: validate individual product
    Given 'The user' that I am on the homepage of luegopago.com
    When I select products list and add them to the shopping cart
      | category              | subcategory          | product                                                 | amount |
      | Celulares y Teléfonos | Colgantes y Soportes | Soporte Para Teléfono De Motocicleta Resistente Al Agua | 10     |
    Then should see the product value for unit is correct

@prueba
  Scenario: validate product with discount
    Given 'The user' that I am on the homepage of luegopago.com
    When the user select the firts product on offer
    Then should see the discount is applied correctly

