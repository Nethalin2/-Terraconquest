package com.markwilliams;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 91, height = 120;

    public static BufferedImage backLeft, backLeft2, backRight, frontCrouch, right, rightJog, backJump, rightRun, apple, banana, leftJog, leftRun, cherry, leftSprint, leftSprint2, standRight, startRight, runRight, standLeft, sprintRight, startLeft,
    grass1, tundra1, stone1, path1, bush1, path2, fences, snow1, tundra2, grass2, stone2, path3, bush2, stone3, road1, snow2, desert1, grass3, stone4, road2, bush3, bush4, snow3, snow4, snow5, grass5, ice1, lava1, bush5, bush6, snow6, ice2;


    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sprite.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/tileset.jpeg"));

        // top row
        backLeft = sheet.crop(0,0 , width, height);
        backLeft2 = sheet.crop( width, 0, width, height);
        backRight = sheet.crop(width * 2, 0, width, height);
        frontCrouch = sheet.crop(width * 3, 0, width, height);
        right = sheet.crop(width * 4, 0, width, height);
        //Second row
        rightJog = sheet.crop(0, height, width, height);
        backJump = sheet.crop (width, height, width, height);
        rightRun = sheet.crop(width * 2, height, width, height);
        apple = sheet.crop(width * 3, height , width, height );
        banana = sheet.crop(width * 3, height , width, height);
        leftJog = sheet.crop(width * 4, height, width, height);
        // third row
        leftRun = sheet.crop(0, height * 2, width, height);
        cherry = sheet.crop (width, height * 2, width, height);
        leftSprint = sheet.crop (width * 2, height * 2, width, height);
        leftSprint2 = sheet.crop ( width * 3, height * 2, width, height);
        standRight = sheet.crop (width * 4, height * 2, width, height );
        //bottom row
        startRight = sheet.crop(0, height * 3, width, height);
        runRight = sheet.crop(width, height * 3, width, height);
        standLeft = sheet.crop(width * 2, height * 3, width, height);
        sprintRight = sheet.crop(width * 3, height * 3, width, height);
        startLeft = sheet.crop(width * 4, height * 3, width, height);

        //terrain

        //top
        grass1 = sheet2.crop(0,0, 128, 192);
        tundra1 = sheet2.crop(width,0, 128, 192);
        stone1 = sheet2.crop(width * 2,0, 128, 192);
        path1 = sheet2.crop(width * 3,0, 128, 192);
        bush1 = sheet2.crop(width * 4,0, 128, 192);
        path2 = sheet2.crop(width * 5,0, 128, 192);
        fences = sheet2.crop(width * 6,0, 128, 192);
        snow1 = sheet2.crop(width * 7,0, 128, 192);
        //second row
        tundra2 = sheet2.crop(0,height, 128, 192);
        grass2 = sheet2.crop(width ,height, 128, 192);
        stone2 = sheet2.crop(width * 2, height, 128, 192);
        path3 = sheet2.crop(width * 3,height, 128, 192);
        bush2 = sheet2.crop(width * 4,height, 128, 192);
        stone3 = sheet2.crop(width * 5,height, 128, 192);
        road1 = sheet2.crop(width * 6,height, 128, 192);
        snow2 = sheet2.crop(width * 7,height, 128, 192);

        //third row
        desert1 = sheet2.crop(0,height * 2, 128, 192);
        grass3 = sheet2.crop(width,height * 2, 128, 192);
        stone4 = sheet2.crop(width * 2,height * 2, 128, 192);
        road2 = sheet2.crop(width * 3,height * 2, 128, 192);
        bush3 = sheet2.crop(width * 4,height * 2, 128, 192);
        bush4 = sheet2.crop(width * 5,height * 2, 128, 192);
        snow3 = sheet2.crop(width * 6,height * 2, 128, 192);
        snow4 = sheet2.crop(width * 7,height * 2, 128, 192);

        //bottom row
        snow5 = sheet2.crop(0,height * 3, 128, 192);
        grass5 = sheet2.crop(width ,height * 3, 128, 192);
        ice1 = sheet2.crop(width * 2,height * 3, 128, 192);
        lava1 = sheet2.crop(width * 3,height * 3, 128, 192);
        bush5 = sheet2.crop(width * 4,height * 3, 128, 192);
        bush6 = sheet2.crop(width * 5,height * 3, 128, 192);
        snow6 = sheet2.crop(width * 6,height * 3, 128, 192);
        ice2 = sheet2.crop(width * 7,height * 3, 128, 192);

    }
}
