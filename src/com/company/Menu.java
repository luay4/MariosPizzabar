package com.company;

import java.util.ArrayList;

public class Menu {

    public ArrayList<Pizza> pizzaMenu = new ArrayList<>();

    /*public String udskrivMenu(){
    return  "1.  Vesuvio:.......tomatsauce, ost, skinke og oregano.....................................................................57 kr.\n" +
            "2.  Amerikaner:....tomatsauce, ost, oksefars og oregano...................................................................53 kr.\n" +
            "3.  Cacciatore:....tomatsauce, ost, pepperoni og oregano..................................................................57 kr.\n" +
            "4.  Cabonara:......tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano........................................63 kr.\n" +
            "5.  Dennis:........tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano..........................................65 kr.\n" +
            "6.  Bertil:........tomatsauce, ost, bacon og oregano......................................................................57 kr.\n" +
            "7.  Silvia:........tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano..........................................61 kr.\n" +
            "8.  Victoria:......tomatsauce, ost, skinke, ananas, champignon og oregano.................................................61 kr.\n" +
            "9.  Toronfo:.......tomatsauce, ost, skinke, bacon, kebab, chili og oregano................................................61 kr.\n" +
            "10. Capricciosa:..tomatsauce, ost, skinke, champignon og oregano.........................................................61 kr.\n" +
            "11. Hawai:........tomatsauce, ost, skinke, ananas og oregano.............................................................61 kr.\n" +
            "12. Le Blissola:..tomatsauce, ost, skinke, rejer og oregano..............................................................61 kr.\n" +
            "13. Venezia:......tomatsauce, ost, skinke, bacon og oregano..............................................................61 kr.\n" +
            "14. Mafia:........tomatsauce, ost, skinke, pepperoni, bacon, løg og oregano..............................................61 kr.\n" +
            "15. Salat Pizza:..tomatsauce, ost, kebab, salat, creme fraiche og oregano................................................61 kr.\n" +
            "16. Marco Polo:...tomatsauce, ost, kylling, grøn peber, jalapenos og oregano.............................................61 kr.\n" +
            "17. Charlie:......tomatsauce, mozzarella, gorgonzola, parmesan, cheddar, spaghetti, kylling, rejer og oregano............65 kr.\n" +
            "18. Mexicano:.....tomatsauce, ost, kødsauce, jalapenos, løg og oregano...................................................63 kr.\n" +
            "19. Roma:.........tomatsauce, ost, pepperoni, ananas, salat og oregano...................................................61 kr.\n" +
            "20. Neptun:.......tomatsauce, ost, pepperoni, kødsauce, champignon, rejer og oregano.....................................63 kr.\n" +
            "21. Pratt:........tomatsauce, ost, kylling, pepperoni, kødsauce, bacon og oregano........................................63 kr.\n" +
            "22. Chicken:......tomatsauce, ost, kylling, jalapenos og oregano.........................................................61 kr.\n" +
            "23. Margherita:...tomatsauce, ost og oregano.............................................................................53 kr.\n" +
            "24. Yankee:.......tomatsauce, ost, pepperoni, grøn peber og oregano......................................................61 kr.\n" +
            "25. Sicily:.......tomatsauce, ost, spaghetti, ansjoser og oregano........................................................61 kr.\n" +
            "26. DK:...........tomatsauce, ost, kødsauce, banan, ananas og oregano....................................................61 kr.\n" +
            "27. Vegetariana:..tomatsauce, ananas salat, champignon, løg og oregano...................................................61 kr.\n" +
            "28. Bodil:........tomatsauce, ost, pepperoni, creme fraiche og oregano...................................................57 kr.\n" +
            "29. Bowser:.......tomatsauce, ost, gorgonzola, kebab, løg, rød peber, jalapenos og oregano...............................63 kr.\n" +
            "30. Mamma Mia:....tomatsauce, ost, skinke, bacon, pepperoni, kylling, kebab, cocktailpølser, kødsauce og oregano.........69 kr.\n";

    }*/

    public String udskrivMenu() {
        String menu = "";
        for (Pizza pizza : pizzaMenu) {
            menu += pizza + "\n";
        }
        return menu;
    }

    Pizza vesuvio = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke og oregano", 57);
    Pizza amerikaner = new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
    Pizza cacciatore = new Pizza(3, "Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
    Pizza cabonara = new Pizza(4, "Cabonara", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63);
    Pizza dennis = new Pizza(5, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
    Pizza bertil = new Pizza(6, "Bertil", "tomatsauce, ost, bacon og oregano", 57);
    Pizza silvia = new Pizza(7, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61);
    Pizza victoria = new Pizza(8, "Victoria", "tomatsauce, ost, skinke, ananas, champignon og oregano", 61);
    Pizza toronfo = new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
    Pizza capricciosa = new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61);
    Pizza hawai = new Pizza(11, "Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61);
    Pizza leBlissola = new Pizza(12, "Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61);
    Pizza venezia = new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61);
    Pizza mafia = new Pizza(14, "Mafia", "tomatsauce, ost, skinke, pepperoni, bacon, løg og oregano", 61);
    Pizza salatPizza = new Pizza(15, "Salat Pizza", "tomatsauce, ost, kebab, salat, creme fraiche og oregano", 61);
    Pizza marcoPolo = new Pizza(16, "Marco Polo", "tomatsauce, ost, kylling, grøn peber, jalapenos og oregano", 61);
    Pizza charlie = new Pizza(17, "Charlie", "tomatsauce, mozzarella, gorgonzola, parmesan, cheddar, spaghetti, kylling, rejer og oregano", 65);
    Pizza mexicano = new Pizza(18, "Mexicano", "tomatsauce, ost, kødsauce, jalapenos, løg og oregano", 63);
    Pizza roma = new Pizza(19, "Roma", "tomatsauce, ost, pepperoni, ananas, salat og oregano", 61);
    Pizza neptun = new Pizza(20, "Neptun", "tomatsauce, ost, pepperoni, kødsauce, champignon, rejer og oregano", 63);
    Pizza pratt = new Pizza(21, "Pratt", "tomatsauce, ost, kylling, pepperoni, kødsauce, bacon og oregano", 63);
    Pizza chicken = new Pizza(22, "Chicken", "tomatsauce, ost, kylling, jalapenos og oregano", 61);
    Pizza margherita = new Pizza(23, "Margherita", "tomatsauce, ost og oregano", 53);
    Pizza yankee = new Pizza(24, "Yankee", "tomatsauce, ost, pepperoni, grøn peber og oregano", 61);
    Pizza sicily = new Pizza(25, "Sicily", "tomatsauce, ost, spaghetti, ansjoser og oregano", 61);
    Pizza dk = new Pizza(26, "DK", "tomatsauce, ost, kødsauce, banan, ananas og oregano", 61);
    Pizza vegetariana = new Pizza(27, "Vegetariana", "tomatsauce, ananas salat, champignon, løg og oregano", 61);
    Pizza bodil = new Pizza(28, "Bodil", "tomatsauce, ost, pepperoni, creme fraiche og oregano", 57);
    Pizza bowser = new Pizza(29, "Bowser", "tomatsauce, ost, gorgonzola, kebab, løg, rød peber, jalapenos og oregano", 63);
    Pizza mammaMia = new Pizza(30, "Mamma Mia", "tomatsauce, ost, skinke, bacon, pepperoni, kylling, kebab, cocktailpølser, kødsauce og oregano", 69);

    public Menu() {
        pizzaMenu.add(vesuvio);
        pizzaMenu.add(amerikaner);
        pizzaMenu.add(cacciatore);
        pizzaMenu.add(cabonara);
        pizzaMenu.add(dennis);
        pizzaMenu.add(bertil);
        pizzaMenu.add(silvia);
        pizzaMenu.add(victoria);
        pizzaMenu.add(toronfo);
        pizzaMenu.add(capricciosa);
        pizzaMenu.add(hawai);
        pizzaMenu.add(leBlissola);
        pizzaMenu.add(venezia);
        pizzaMenu.add(mafia);
        pizzaMenu.add(salatPizza);
        pizzaMenu.add(marcoPolo);
        pizzaMenu.add(charlie);
        pizzaMenu.add(mexicano);
        pizzaMenu.add(roma);
        pizzaMenu.add(neptun);
        pizzaMenu.add(pratt);
        pizzaMenu.add(chicken);
        pizzaMenu.add(margherita);
        pizzaMenu.add(yankee);
        pizzaMenu.add(sicily);
        pizzaMenu.add(dk);
        pizzaMenu.add(vegetariana);
        pizzaMenu.add(bodil);
        pizzaMenu.add(bowser);
        pizzaMenu.add(mammaMia);
    }

}
