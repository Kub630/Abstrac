public class Horse extends Animals{
    private String color;
    public Horse(){

    }

    public Horse(String weight, int age, String gender, String nicName, String color) {
        super(weight, age, gender, nicName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


