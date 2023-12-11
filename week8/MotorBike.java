class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model, 
    String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get info.
     */
    public String getInfo() {
        return "Motor Bike:\n" + "\tBrand: " + super.getBrand() + "\n\tModel: " + super.getModel() 
        + "\n\tRegistration Number: " + super.getRegistrationNumber() 
        + "\n\tHas Side Car: " + this.hasSidecar + "\n\tBelongs to " 
        + super.getOwner().getName() + " - " + super.getOwner().getAddress();
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
