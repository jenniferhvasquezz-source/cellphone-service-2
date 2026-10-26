package com.pluralsight;

public class CellPhone {
    public static void main(String[] args) {
// Fields
        private String serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        // Constructor
        public CellPhone(String serialNumber, String model, String carrier, String phoneNumber, String owner,) {
            this.serialNumber = serialNumber;
            this.odel = model;
            this.carrier = carrier;
            this.phoneNumber = phoneNumber;
            this.owner = owner;
        }
        // Step 1: Add the dial method here
        public void dial(String numberToCall){
            System.out.println(owner + "'s phone is calling " + numberToCall) "
        }
        // Getters
        public String getSerialNumber() { return serialNumber; }
        public String getModel() { return model; }
        public String getCarrier() { return carrier; }
        public String getPhoneNumber() { return phoneNumber; }
        public String getOwner() { return owner; }
        }
    }
}
