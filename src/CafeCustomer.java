import java.util.Objects;

    public class CafeCustomer {
        // 1. Fields: Customer details
        private int customerId;
        private String firstName;
        private String lastName;
        private String email;


        public CafeCustomer(int customerId, String firstName, String lastName, String email) {
            this.customerId = customerId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String getFullData() {
            return firstName + " " + lastName + " (" + email + ")";
        }

        // 4. Overriding toString(): How the customer looks when printed to the console
        @Override
        public String toString() {
            return "Customer #" + customerId + ": " + getFullData();
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CafeCustomer that = (CafeCustomer) o;

            return customerId == that.customerId || Objects.equals(email, that.email);
        }
    }