public class OOPS {
    public static void main(String[] args) {
        Pen p1=new Pen();//created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}
class Pen{
    String color;
    int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setcolor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+math+chem)/3;
    }
}
