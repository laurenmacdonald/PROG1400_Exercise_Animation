import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DrawingPanel extends JPanel {

    private Timer timer = new Timer(100, new TimerAction());

    private Ball myBall;

    public DrawingPanel(){
        myBall = new Ball(Color.magenta, 70, 70, 450, 250);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startOrStopMoving(e);

            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);	
        myBall.drawBall(g);
    }

    private void startOrStopMoving(MouseEvent e){
        if(timer.isRunning()){
            myBall.setxSpeed(myBall.getxSpeed() * -1);
        }else{
            timer.start();
        }

    }



    public void moveThings(){
        myBall.moveBall();
        checkForWallHit(myBall);
        this.repaint();
    }

    public void checkForWallHit(Ball myBall){
        JTextArea gameOverMsg = new JTextArea();
        gameOverMsg.setBounds(400,250,200,200);
        gameOverMsg.setFont(new Font("Times New Roman", Font.BOLD, 40));
        if((myBall.getxPosition() + myBall.getWidth()) >= this.getWidth()){
            this.repaint();
            gameOverMsg.setText("Game Over!");
            add(gameOverMsg);
        }else if (myBall.getxPosition() <=0){
            gameOverMsg.setText("Game Over!");
            add(gameOverMsg);
            this.repaint();
        }
    }



    private class TimerAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            moveThings();
        }
    }

}
