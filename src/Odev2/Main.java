package Odev2;

public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("Kahramanmaraş");
        myList.add("İstanbul");
        myList.add("Karabük");
        myList.add("Ankara");
        myList.add("Elbistan");
        myList.add("Trabzon");

        boolean deger = myList.contains("Karabük");
        System.out.println("Var mıdır : " + deger);

        myList.remove(2);
        myList.remove("Elbistan");


        myList.list();

    }
}

