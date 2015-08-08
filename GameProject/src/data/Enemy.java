package data;

import org.newdawn.slick.opengl.Texture;
import static helpers.Artist.*;

public class Enemy 
{
	private float x;
	private float y;
	private int width;
	private int height;
	private int health;
	private float speed;
	private Tile startTile;
	Texture texture;
	
	public Enemy(Texture texture, Tile startTile, int width, int height, float speed)
	{
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = width;
		this.height = height;
		this.speed = speed;
	}
	
	public void Draw()
	{
		drawQuadText(texture, x, y, width, height);
	}
	
}