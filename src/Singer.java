public class Singer extends Parent{


     private String bandName;
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println(getName()+" is interesting "+getDesignation()+" music");
    }
    public void playGutar(){
        System.out.println(getName()+ " listen always musics from "+ getBandName()+" band group");
        super.learn();
        super.eat();
        super.walk();

    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
