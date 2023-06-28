import java.util.*;
public class shortest_path {
    public static double shortest_path(String str){
        int x=0;
        int y=0;
        // float dis;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e' || str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='w' || str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='n' || str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='s' || str.charAt(i)=='S'){
                y--;
            }
        }
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    public static void main(String[] args) {
        System.out.println(shortest_path("ns"));
    }
}