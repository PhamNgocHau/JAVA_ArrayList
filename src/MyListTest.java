public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(0);
        list.add(0 , "hello");
        list.add(1,"Nice to meet you");
        list.add("test");
        list.add(2 , "---------->");

        System.out.println(list.print());
        System.out.println(list.size());
        System.out.println(list.clone());
        System.out.println(list.indexOf("test"));
        System.out.println(list.contains("4"));
        System.out.println(list.contains("test"));
        System.out.println(list.get(0));

        list.remove(0);
        System.out.println(list.print());
//        System.out.println(list.get(4));
//        System.out.println("Clear all elements Array: ");
//        list.clear();
//        System.out.println(list.print());
//        list.add(0,"init new element just removed form array ...");
//        System.out.println(list.print());
    }
}
