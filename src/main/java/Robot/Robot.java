package Robot;

public class Robot {
    private int poziomBaterii;
    private String nazwaRobota;
    private boolean wlaczony;

    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
        this.poziomBaterii = 50;
        this.wlaczony = false;
    }

    public void poruszRobotem(RuchRobota ruchRobota) {
        if (wlaczony) {
            if (poziomBaterii >= ruchRobota.getPotrzebnaMoc()) {
                poziomBaterii -= ruchRobota.getPotrzebnaMoc();
                System.out.println("Wykonuję ruch: " + ruchRobota);
            } else {
                System.out.println("Zbyt niski poziom baterii.");
            }
        } else {
            System.out.println("Robot musi być włączony.");
        }
    }

    public void naladujRobota() {
        if (!wlaczony) {
            poziomBaterii = 100;
            System.out.println("Bateria naładowana.");
        } else {
            System.out.println("Robot musi być wyłączony do ładowania.");
        }
    }

    public void włączRobota(){
        if(wlaczony){
            System.out.println("Robot jest już włączony.");
            return;
        }
        wlaczony = true;
        System.out.println("Robot został włączony.");
    }

    public void wyłączRobota(){
        if(!wlaczony){
            System.out.println("Robot jest wyłączony.");
            return;
        }
        wlaczony = false;
        System.out.println("Robot został wyłączony.");
    }
}
