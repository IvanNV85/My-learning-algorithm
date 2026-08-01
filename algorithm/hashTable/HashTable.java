package algorithm.hashTable;

import java.lang.reflect.Array;
import java.util.*;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    static class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ": ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("  {" + temp.key + ", " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList getAllkeys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        //xu li phần cộng các số
        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        //xử lí trường hợp thừa so cuối VD như số XIII
        int lastChar = map.get(s.charAt(s.length() - 1));
        total += lastChar;
        return total;
    }

    public int buildLongestPalindrome(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char stringChar = s.charAt(i);
            if (frequency.containsKey(stringChar)) {
                frequency.put(stringChar, frequency.get(stringChar) + 1);
            } else {
                frequency.put(stringChar, 1);
            }
        }
        boolean hasOdd = false;
        for (int count : frequency.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) length += 1;
        return length;
    }

    public boolean itemInCommon(int[] arr1, int[] arr2) {
        Map<Integer, Boolean> seen = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            seen.put(arr1[i], true);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (seen.containsKey(arr2[i])) return true;
        }
        return false;
    }

    public List<Integer> findDuplicates(int[] array) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int j : array) {
            if (seen.containsKey(j)) {
                seen.put(j, seen.get(j) + 1);
            } else {
                seen.put(j, 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Integer key : seen.keySet()) {
            if (seen.get(key) >= 2) {
                result.add(key);
            }
        }
        return result;
    }

    public Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!seen.containsKey(str.charAt(i))) {
                seen.put(str.charAt(i), 1);
            } else {
                seen.put(str.charAt(i), seen.get(str.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (seen.get(c) == 1) return c;
        }
        return null;
    }

    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String string : str) {
            //phan 1: sort cac phan tu trong mang de thanh key vao hashmap
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            //phan 2: kiem tra key trong map
            if (map.containsKey(key)) {

                List<String> existingList = map.get(key); //lay list hien tai va add string moi vao
                existingList.add(string);
            } else {

                List<String> newList = new ArrayList<>(); //tao list moi va add string sau do them vao hashmap
                newList.add(string);
                map.put(key, newList);
            }
        }
        //phan 3: tra ve ket qua
        return new ArrayList<>(map.values());
    }

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (!map.containsKey(s.charAt(i))) {
                count++;
                map.put(s.charAt(i), count);
            } else {
                int currentCount = map.get(s.charAt(i));
                currentCount++;
                map.put(s.charAt(i), currentCount);
            }
        }

        //duyet string t, xem character nao bi thua thi return ra ngoai
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return c;
            }
        }
        return ' ';
    }

    /*
     *     Leetcode 387: Given a string s,
     *     find the first non-repeating character in it and return its index.
     *    If it does not exist, return -1.
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        //duyet cac phan tu trong string vao cho vao hashmap
        for (int i = 0; i < s.length(); i++) {
            char frequency = s.charAt(i);
            if (!map.containsKey(frequency)) {
                map.put(frequency, 1);
            } else {
                map.put(frequency, map.get(frequency) + 1);
            }
        }

        //lay phan tu khong trung lap dau tien
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) return i;
        }
        return -1;
    }

}
