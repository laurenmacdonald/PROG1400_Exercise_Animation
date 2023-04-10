import java.awt.*;

public class Ball {
    private Color ballColor;
    private int width;
    private int height;
    private int xPosition;
    private int yPosition;
    private int xSpeed = 50;

    public Ball(Color ballColor, int width, int height, int xPosition, int yPosition) {
        this.setBallColor(ballColor);
        this.setWidth(width);
        this.setHeight(height);
        this.setxPosition(xPosition);
        this.setyPosition(yPosition);
    }

    public void drawBall(Graphics g){
        g.setColor(this.getBallColor());
        g.fillOval(this.getxPosition(), this.getyPosition(), this.getWidth(), this.getHeight());

    }
    public void moveBall(){
        this.setxPosition((this.getxPosition() + this.getxSpeed()));
    }

    public Color getBallColor() {
        return ballColor;
    }

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
}
