public abstract class Animals {
    private String weight;
    private int age;
    private String gender;
    String nicName;

    public Animals() {
        System.out.println("");
    }

    public Animals(String weight, int age, String gender, String nicName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nicName = nicName;
    }

    public void eat() {
        System.out.println("EATING");
    }

    public void run() {
        System.out.println("RUNNING");
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        return weight + " "
                + " " + age
                + " " + gender+" "
                + nicName;
    }
}
