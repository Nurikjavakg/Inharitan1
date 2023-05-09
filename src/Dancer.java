public class Dancer extends Parent{

    private String groupName;
    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println(getName()+" love dance "+getDesignation()+" and he want to create '"+groupName+ "' group");
        super.learn();
        super.eat();
        super.walk();
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
