/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2ch3p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rant
 */
public class Q2ch3p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner s = new Scanner(new File("C:\\Users\\rant\\Documents\\NetBeansProjects\\Q2ch3p1\\src\\q2ch3p1\\newFile.txt"));
        
        Map<String, Integer> wordeMap = new HashMap<>();
        Map<Character, Integer> characterMap = new HashMap<>();
        
        while (s.hasNext()) {
            String word = s.next();
            Integer wm = wordeMap.get(word);
            if (wm == null) {
                wordeMap.put(word, 1);
            } else {
                wordeMap.put(word, wm + 1);
            }
            char[] arrch = word.toCharArray();
            for (char ch : arrch) {
                if (characterMap.containsKey(ch)) {
                    characterMap.put(ch, characterMap.get(ch) + 1);
                } else {
                    characterMap.put(ch, 1);
                }
            }
        }
        System.out.println(wordeMap.toString());
        System.out.println(characterMap.toString());

    }

}
