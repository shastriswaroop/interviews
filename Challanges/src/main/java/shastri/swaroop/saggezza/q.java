package shastri.swaroop.saggezza;

import java.util.TreeSet;
// Output
/*Exception in thread "main" java.lang.ClassCastException: shastri.swaroop.saggezza.q$Monkey cannot be cast to java.lang.Comparable
        at java.util.TreeMap.compare(TreeMap.java:1294)
        at java.util.TreeMap.put(TreeMap.java:538)
        at java.util.TreeSet.add(TreeSet.java:255)
        at shastri.swaroop.saggezza.q.main(q.java:9)

Explaination: https://www.javacodeexamples.com/java-treeset-fix-java-lang-classcastexception-cannot-be-cast-to-java-lang-comparable/2815
*/
public class q {

    public static void main(String[] args) {

        TreeSet<Monkey> treeSet = new TreeSet<Monkey>();
        treeSet.add(new Monkey(1));
        treeSet.add(new Monkey(2));
        treeSet.add(new Monkey(1));

        System.out.println(treeSet.size());
    }

    static class Monkey {
        Monkey(int i){

        }
    }
}
