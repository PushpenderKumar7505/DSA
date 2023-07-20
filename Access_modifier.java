package oobs;

public class Access_modifier {
    public static void main(String[] args) {
        Bankaccount p2 = new Bankaccount();
       p2.name="pankaj";
       p2.setPassword("1245454");
        System.out.println(p2.name);

    }
}
class Bankaccount {
    public String name ;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
