import java.util.*;

public class T {
    public static void main(String[] args) {
        System.out.println("OK");
        String s= "AA AB BA AC AD AA AB AAB Группы должны быть отсортированы в сапог сарай арбуз бол бокс биржа алфавитном порядке".toLowerCase();

        String ss = "сапог сарай арбуз болт бокс биржа";
        String sm[]= s.split(" ");

        ArrayList<String> fletter = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        TreeMap<String,ArrayList<String>> treeMap = new TreeMap<>();
        // ArrayList<String> listArray = new ArrayList<>();
        Set<String> set = new TreeSet<>();
        //  Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));

        for (int j=0;j<sm.length;j++)
        {
            words.add(sm[j]);
            String word[] =sm[j].split("");
            // listArray.add(sm[0]);
            for (int i=0;i<word.length;i++)
            {
                if (word.length<2) continue;
                if (i==0)
                {
                    fletter.add(word[0]);
                    set.add(word[0]);
                }
                System.out.print(word[i]);
            }
            System.out.println("LEnght of the word " + word.length);
        }
        Collections.sort(words);
        Collections.sort(fletter);

        System.out.println(words);
        System.out.println(fletter);
        System.out.println(set);
        System.out.println(treeMap);
        // listArray.clear();

        // ArrayList<String> listArray = new ArrayList<>();

        for(String sset : set)
        {
            ArrayList<String> listArray = new ArrayList<>();

            for (int i = 0; i <words.size() ; i++) {
                System.out.println(words.get(i));
                String first = words.get(i).substring(0, 1);
                System.out.print("    " + first);

                if (sset.equals(first)) {
                    listArray.add(words.get(i));
                    listArray.sort(Comparator.comparing(String::length).reversed());



                    treeMap.put(first, listArray);
                    System.out.println("OKK" + listArray.size() + words.get(i));
                }
            }
        }

        System.out.println(treeMap);

    }
}