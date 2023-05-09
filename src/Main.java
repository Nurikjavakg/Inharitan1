public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Syimyk"," Python","Google");
        System.out.println();
        programmer.coding();
        System.out.println(programmer);
        System.out.println();

        Dancer dancer = new Dancer("Januzak","breakeDance","Nightdancer");
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer("Baktulan","pop","Starboy");
        System.out.println();
        singer.singing();
        singer.playGutar();

    }
}