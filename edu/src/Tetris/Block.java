package Tetris;

public class Block {

    private String color;
    private String shape;
    private int rotation;
    private int xPos;
    private int yPos;

    public Block(String c, String s) {

        this.color = c;
        this.shape = s;
        this.rotation = 0;
        this.xPos = 4;
        this.yPos = 20;
    }
    
    protected void Drop() {
        while(this.yPos > 0) {
            System.out.println("블럭 " + this.toString());
            this.yPos--;

            //1초를 쉬도록 하는 코드
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {

        String msg = "color=" + this.color 
        + ", shape=" + this.shape 
        + ", rotation=" + this.rotation 
        + ", xPos=" + this.xPos 
        + ", yPos=" + this.yPos; 

        return msg;
    }

    protected void MoveLeft(){
        this.xPos--;
    }

    protected void MoveRight(){
        this.xPos++;
    }

    protected void Acc(){
        this.yPos--;
    }

    protected void Rotate(){
        this.rotation += 90;
        this.rotation = this.rotation % 360;

    }

}
