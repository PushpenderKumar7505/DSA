package oobs;

public class classes {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.ame("pankaj");
        System.out.println(p1.name);
        p1.ip(5);
        System.out.println(p1.tip );
    }

}
class Pen {
    String name;
    int tip;

void ame(String names){
    name=names;
}
void ip(int tips){
    tip= tips;
}
}
