
    import java.math.BigDecimal;

    public class Products {

        static void setProductTypes(ProductTypes productType) {

        }

        private BigDecimal price;
        private ProductTypes productType;

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public ProductTypes getProductType() {
            return productType;
        }

        public void setProductType(ProductTypes productType) {
            this.productType = productType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Products product = (Products) o;

            if (price != null ? !price.equals(product.price) : product.price != null) return false;
            return productType == product.productType;

        }

        @Override
        public int hashCode() {
            int result = price != null ? price.hashCode() : 0;
            result = 31 * result + (productType != null ? productType.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "price=" + price +
                    ", productType=" + productType +
                    '}';
        }


    }

