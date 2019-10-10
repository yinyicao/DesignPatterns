package CustomerClone;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer clone = (Customer)customer.clone();
        System.out.println(customer == clone);
        System.out.println(customer.getAddress() == clone.getAddress());

        CustomerDeepClone customerDeepClone = new CustomerDeepClone();
        CustomerDeepClone clone1 = (CustomerDeepClone)customerDeepClone.clone();
        System.out.println(customerDeepClone == clone1);
        System.out.println(customerDeepClone.getAddress() == clone1.getAddress());
    }

}
