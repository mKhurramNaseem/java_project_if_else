import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
//    public static final int WIDTH = 100;
//    public static final int HEIGHT = 100;
//    public static final int TYPE = BufferedImage.TYPE_INT_RGB;
//    public static final String BASE_PATH = "/home/khurram/Documents/Development/pictures/";
//    static boolean isPresent = true;

//    public static int[] g(int n) {
//        int[] dp = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            dp[i] = dp[i / 2] + (i % 2);
//        }
//        return dp;
//    }


    public static void main(String[] args) {

//        System.out.println(Arrays.toString(g(5)));

        MyList<Integer> myList = new MyList<>();
        myList.add(6);
        System.out.println(myList.get(0));
//        int marks;
//        if(isPresent){
//            marks = 10;
//        }else{
//            marks = 0;
//        }

//        ChessProblem chessProblem = new ChessProblem();
//        System.out.println(chessProblem.bishop("f2","e7",5));
//
//        int mMarks = isPresent ? 10 : 0;
//
//        IfElseAssignment e = new IfElseAssignment();
//        e.questionNo1();
//        e.questionNo2();
//        e.questionNo3();
//        e.questionNo4();
//        e.questionNo5();
//        e.questionNo6();
//        e.questionNo7();
//        e.questionNo8();
//        e.questionNo9();
//        e.questionNo10();
//        e.questionNo11();
//        e.questionNo12();
//        e.questionNo13();
//        e.questionNo14();
//        e.questionNo15();
//        e.questionNo16();
//        e.questionNo17();
//        e.questionNo18();
//        e.questionNo19();
//        e.questionNo20();
//        e.questionNo21();
//        e.questionNo22();
//        e.questionNo23();
//        e.questionNo24();
//        e.questionNo25();
//        e.questionNo26();
//          e.questionNo27();
//          e.questionNo28();
//          e.questionNo29();
//          e.questionNo30();
//          e.questionNo31();
//          e.questionNo32();
//          e.questionNo33();
//          e.questionNo34();
//          e.questionNo35();
//          e.questionNo36();
//          e.questionNo37();
//          e.questionNo38();
//          e.questionNo39();
//          e.questionNo40();
//          e.questionNo41();
//          e.questionNo42();
//          e.questionNo43();
//          e.questionNo44();
//          e.questionNo45();


//        SwitchAssignment s = new SwitchAssignment();
//        s.questionNo1();
//        s.questionNo2();
//        s.questionNo3();
//        s.questionNo4();
//        s.questionNo5();
//        s.questionNo6();
//        s.questionNo7();
//        s.questionNo8();
//        s.questionNo9();
//        s.questionNo10();
//        s.questionNo11();
//        s.questionNo12();
//        s.questionNo13();
//        s.questionNo14();
//        s.questionNo15();
//        s.questionNo16();
//        s.questionNo17();
//          s.questionNo18();
//        s.questionNo19();

//        WhileLoopAssignment w = new WhileLoopAssignment();
//        w.questionNo1();
//      w.questionNo2();
//      w.questionNo3();
//      w.questionNo4();
//      w.questionNo5();
//      w.questionNo6();
//      w.questionNo7();
//      w.questionNo8();
//      w.questionNo9();
//      w.questionNo10();
//      w.questionNo11();
//      w.questionNo12();
//      w.questionNo13();
//      w.questionNo14();
//      w.questionNo15();
//      w.questionNo16();
//      w.questionNo17();
//      w.questionNo18();
//      w.questionNo19();
//      w.questionNo20();
//      w.questionNo21();
//      w.questionNo22();
//      w.questionNo23();
//      w.questionNo24();
//      w.questionNo25();
//      w.questionNo26();
//      w.questionNo27();
//        w.questionNo28();

        ForLoopAssignment f = new ForLoopAssignment();
//        f.questionNo1();
//          f.questionNo2();
//          f.questionNo3();
//          f.questionNo4();
//          f.questionNo5();
//          f.questionNo6();
//          f.questionNo7();
//          f.questionNo8();






//        String format = "jpg";
//        var height = 200;
//        var width = 300;
//        try {
//            BufferedImage imageZero = scaleImage(Objects.requireNonNull(readImage(BASE_PATH+"facebook.jpg")),WIDTH,HEIGHT,TYPE);
//            BufferedImage imageOne = scaleImage(Objects.requireNonNull(readImage(BASE_PATH+"gmail.jpg")),WIDTH,HEIGHT,TYPE);
//            BufferedImage imageTwo =scaleImage(Objects.requireNonNull(readImage(BASE_PATH+"instagram.jpg")),WIDTH,HEIGHT,TYPE);
//            BufferedImage imageThree =scaleImage(Objects.requireNonNull(readImage(BASE_PATH+"pinterest.jpg")),WIDTH,HEIGHT,TYPE);
//            BufferedImage imageFour =scaleImage(Objects.requireNonNull(readImage(BASE_PATH+"ringtones.jpg")),WIDTH,HEIGHT,TYPE);
//            BufferedImage imageFive =scaleImage(Objects.requireNonNull(readImage(BASE_PATH+"messages.jpg")),WIDTH,HEIGHT,TYPE);
//            BufferedImage[] images = {
//            imageZero,imageOne,imageTwo,imageThree,imageFour,imageFive,
//            };
//            BufferedImage effectImage = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
//            int imageIndex;
//            int colIndex = 0;
//            int rowIndex = 0;
//            for (int row = 0; row < effectImage.getHeight(); row++) {
//                for (int col = 0; col < effectImage.getWidth(); col++) {
//                        imageIndex = getIndex(row,col);
//                        effectImage.setRGB(col,row,images[imageIndex].getRGB(colIndex,rowIndex));
//                        colIndex = colIndex == WIDTH - 1 ? 0 : colIndex + 1;
//                }
//                rowIndex = rowIndex == HEIGHT - 1 ? 0 : rowIndex + 1;
//            }
//            System.out.println(ImageIO.write(effectImage,format,new File(BASE_PATH+"new_image.jpg")) ? "Saved" : "Not Saved");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public static int getIndex(int row , int col) {
//        int index = 0;
//        if(row < 100){
//            if(col < 100){
//                index = 0;
//            }else if(col < 200){
//                index = 1;
//            }else if(col < 300){
//                index = 2;
//            }
//        }else{
//            if(col < 100){
//                index = 3;
//            }else if(col < 200){
//                index = 4;
//            }else if(col < 300){
//                index = 5;
//            }
//        }
//        return index;
//    }
//
//    public static BufferedImage scaleImage(BufferedImage sourceImage , int width , int height , int type){
//        BufferedImage scaledImage = new BufferedImage(width,height,type);
//        Image image = sourceImage.getScaledInstance(width,height,Image.SCALE_DEFAULT);
//        scaledImage.createGraphics().drawImage(image,0,0,null);
//        return scaledImage;
//    }
//
//    public static BufferedImage readImage(String path){
//        try{
//            return ImageIO.read(new File(path));
//        }catch (Exception ex){
//            return null;
//        }
//    }
    }
}