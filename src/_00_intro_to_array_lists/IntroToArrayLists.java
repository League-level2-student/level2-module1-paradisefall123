package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
    public static void main(String[] args) {
        int xyz=args.length;
        //1. Create an array list of Strings
        //   Don't forget to import the ArrayList (java.util) class
        ArrayList<String> foods = new ArrayList<String>();
        //2. Add five Strings to your list
        foods.add("pasta");
        foods.add("pizza");
        foods.add("tacos");
        foods.add("hamburger");
        foods.add("mole");
        //3. Print all the Strings using a standard for-loop
        for (int i = 0; i < foods.size(); i++) {
            String f = foods.get(i);
            System.out.println(i + " " + f);
        }
        //4. Print all the Strings using a for-each loop
        for (String s : foods) {
            System.out.println(s);
        }


        //5. Print only the even numbered elements in the list.
        for (int i = 0; i < foods.size(); i++) {
            if (i % 2 == 0) {
                String f = foods.get(i);
                System.out.println(f);
            }
        }


        //6. Print all the Strings in reverse order.
        System.out.println("Step 6");
        for (int i = foods.size() - 1; i >= 0; i--) {
            String f = foods.get(i);
            System.out.println(f);
        }
        //7. Print only the Strings that have the letter 'e' in them.
        System.out.println("Step 7");
        for (int i = 0; i < foods.size(); i++) {
            String f = foods.get(i);
            if (f.contains("e")) {
                System.out.println(f);
            }


        }


    }
}
