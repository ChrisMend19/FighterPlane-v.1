/*
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Trail extends GameObject {

    private float alpha = 1;
    private Handler handler;
    private Color color;

    private float life;

    public Trail(int x, int y, ID id, Color color, float life, Handler handler) {
        super(x, y, id);
        this.color = color;
        this.life = life;

    }

    public void tick() {
        if (alpha > life) {
            alpha -= (life - 0.0001f);
        }
        else{ 
            handler.removeObject(this);
        }

    }

    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));
        g.setColor(color);
        g.fillRect(x,y,20,20);
        g2d.setComposite(makeTransparent(1));

    }

    private AlphaComposite makeTransparent(float alpha) {
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);

    }

    public Rectangle getBounds() {
        return null;
    }

    

    
    
    
}
*/