package study;

class FishFrame {

    int fid;
    String color;
    int eyes = 2;

    FishFrame() {
        this.fid = 0;
        this.color = "노란색";
    }

    FishFrame(int f, String c) {
        this.fid = f;
        this.color = c;
    }

    FishFrame(String c, int f) {
        this.fid = f;
        this.color = c;
    }

    int getEyes() {
        return this.eyes;
    }

    int getEyes(int i) {
        return this.eyes;
    }



    FishFrame getFish() {

        FishFrame fish = new FishFrame();

        return fish;
    }

    void setFish(FishFrame fish) {

        this.fid = fish.fid;
        this.color = fish.color;
        

    }


}


public class Test10 {
    public static void main(String[] args) {

        FishFrame fish1 = new FishFrame();
        FishFrame fish2 = new FishFrame(10, "까만색");

        System.out.println(fish1.fid);
        System.out.println(fish1.color);

        System.out.println(fish2.fid);
        System.out.println(fish2.color);

        int e = fish2.getEyes();
        int e1 = fish2.getEyes(11);


        FishFrame fish3 = new FishFrame();

        FishFrame fish4 = fish3.getFish();

        fish4.setFish(fish3);
        
    }
}
