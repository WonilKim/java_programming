package Tetris;

public class Block {

    private String color;
    private String shape;
    private int xPos;
    private int yPos;
    private int rotation;

    public Block() {
        this.color = "white";
        this.shape = "ㄱ";
        this.xPos = 4;
        this.yPos = 10;
        this.rotation = 0;
    }

    public Block(String color, String shape) {
        this.color = color;
        this.shape = shape;

        this.xPos = 4;
        this.yPos = 20;
        this.rotation = 0;

    }

    public void Drop() {

        while(yPos > 0) {
            System.out.println(this.toString());

            yPos--;
            
            //딜레이
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }

    public void MoveLeft() {
        this.xPos--;
    }

    public void MoveRight() {
        this.xPos++;
    }

    public void MoveDown() {
        this.yPos--;
    }

    public void Rotate() {
        this.rotation += 90;

        this.rotation = this.rotation % 360;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "color=" + this.color + ", shape=" + this.shape + ", xPos=" + this.xPos + ", yPos=" + this.yPos + ", rotation=" + this.rotation;
    }

}
