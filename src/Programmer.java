public class Programmer extends Parent{

    private String companyName;
    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println(getName()+" coding in java");
        super.learn();
        super.eat();
        super.walk();
    }

    @Override
    public String toString() {
        return "He work in " +
                "" + companyName+" company "+""
                ;
    }
}
