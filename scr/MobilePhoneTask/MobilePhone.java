package MobilePhoneTask;

public class MobilePhone {
    private String brand;
    private String model;
    private int battery_capacity;
    private int battery_amount;
    private int memory;
    private int free_memory;


    public MobilePhone(String brand, String model, int battery_capacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.battery_capacity = battery_capacity;
        this.battery_amount = battery_capacity;
        this.memory = memory;
        this.free_memory = memory;

    }

    public void charge() {
        System.out.println(brand + model + " has been charged. Remain battery capacity: " + (battery_capacity = battery_amount) + "mAh");

    }

    public int installApplication(String appName, int memoryTaken) {

        if ((free_memory - memoryTaken) >= memoryTaken && memory > memoryTaken) {
            System.out.println("Application " + appName + " has been installed on " + brand + model + " Remain memory: " + (free_memory - memoryTaken) + " MB");
        } else {
            System.out.println("Application " + appName + " can't be installed on " + brand + model + ".There are no enough memory");
        }
        return free_memory -= memoryTaken;

    }

    public int use(String appName, int numberOfHours) {
        int appConsumption = (100 * numberOfHours);
        int leftEnergy = (battery_capacity - appConsumption);

        if ((leftEnergy <= battery_amount) && ((appConsumption < battery_amount) & leftEnergy >= 0)) {
            System.out.println("Application " + appName + " has been ran for " + numberOfHours + " hours on " + brand + model + ". Remain battery capacity: " + leftEnergy + " mAh");
        } else if (appConsumption == battery_capacity) {
            System.out.println("Application " + appName + " has been used for " + numberOfHours + " hours on " + brand + model + ". Phone has been discharged.");
        } else {
            System.out.println("Application " + appName + " can't be run on " + brand + model + ". Phone discharged");
        }
        return battery_capacity -= appConsumption;
    }

}

