
    import java.math.BigDecimal;

import java.util.Set;

    public class Orders {

        private Set<OrderItems> orderItems = new HashSet<>();

        public Set<OrderItems> getOrderItems() {
            return Collections.unmodifiableSet(orderItems);
        }

        public BigDecimal getTotal() {
            BigDecimal total = BigDecimal.ZERO;

            for (OrderItems orderItem : orderItems) {
                total = total.add(orderItem.getTotal());
            }
            return total;
        }

        public void setOrderItems(Set<OrderItems> orderItems) {
            this.orderItems = orderItems;
        }

        public void addOrderItem(OrderItems item) {

            boolean found = false;
            for (OrderItems orderItem : orderItems) {
                if (orderItem.getProducts().equals(item.getProducts())) {
                    int current = orderItem.getCount();
                    int itemCount = item.getCount() + current;
                    orderItem.setCount(itemCount);
                    found = true;
                }
            }
            if (!found) {
                orderItems.add(item);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Orders order = (Orders) o;

            return orderItems != null ? orderItems.equals(order.orderItems) : order.orderItems == null;

        }

        @Override
        public int hashCode() {
            return orderItems != null ? orderItems.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "\norderItems=" + orderItems +
                    "\nTotal=>" + getTotal() +
                    "}\n";
        }

    }



