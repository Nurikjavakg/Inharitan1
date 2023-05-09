public class Parent {

    private String name;
    private String designation;

    public Parent(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void learn(){
        System.out.println(name+" want to learn "+designation);
    }
    public void eat(){
        System.out.println(name+" like eat lagman");
    }
    public void walk(){
        System.out.println(name+" walk everyday in the Park");

    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
