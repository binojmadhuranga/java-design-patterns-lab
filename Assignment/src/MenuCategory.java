import java.util.*;

class MenuCategory extends MenuComponent {
    private String name;
    private List<MenuComponent> items =
            new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        items.add(component);
    }

    public void display() {
        System.out.println(name);

        for (MenuComponent item : items) {
            item.display();
        }
    }
}