import java.util.Objects;

    public class MenuItem {
        private String code;
        private String name;
        private double price;
        private String category;

        private static int productCount = 0;

        public MenuItem(String code, String name, double price, String category) {
            this.code = code;
            this.name = name;
            this.price = price;
            this.category = category;

            productCount++;
        }

        public static int getProductCount() {
            return productCount;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return String.format("Product: %s [%s] | Category: %s | Price: %.2f",
                    name, code, category, price);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MenuItem menuItem = (MenuItem) o;
            return Objects.equals(code, menuItem.code);
        }
    }

