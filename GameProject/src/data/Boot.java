package data;

import static helpers.Artist.*;


import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

public class Boot 
{
	public Boot()
	{
		beginSession();
		
		Tile tile = new Tile(0, 0, 64, 64, TileType.Grass);
		Tile tile2 = new Tile(0, 64, 64, 64, TileType.Dirt);
		
		
		while(!Display.isCloseRequested())
		{
			tile.Draw();
			tile2.Draw();
			Display.update();
			Display.sync(60);
		}
	}
	
	public static void main(String[] args)
	{
		new Boot();
	}
}
