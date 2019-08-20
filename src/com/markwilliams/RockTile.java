package com.markwilliams;

import java.awt.image.BufferedImage;

public class RockTile extends Tile {

    public RockTile(int id) {
        super(Assets.stone1, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
