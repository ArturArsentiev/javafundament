package com.softserve.edu08.pt.Task1;

public class Department implements Cloneable{
    String name;
    Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    static class Address implements Cloneable {
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }

    @Override
    public Department clone() {
        try {
            Department copy = (Department) super.clone();
            copy.address = address.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
