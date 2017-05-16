package cn.edu.zju.gd.i;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * https://leetcode.com/problems/insert-delete-getrandom-o1/#/description
 * 
 * 380. Insert Delete GetRandom O(1)
 * 
 * Design a data structure that supports all following operations in average O(1) time.

   insert(val): Inserts an item val to the set if not already present.
   remove(val): Removes an item val from the set if present.
   getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 * 
 * 
 */
public class InsertDeleteGetRandom {

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet(); boolean param_1 =
     * obj.insert(val); boolean param_2 = obj.remove(val); int param_3 =
     * obj.getRandom();
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	RandomizedSet obj = new RandomizedSet();
	System.out.println(obj.insert(1));
	System.out.println(obj.remove(2));
	System.out.println(obj.insert(2));
	for (int i = 0; i < 10; i++)
	    System.out.println(obj.getRandom());

	System.out.println(obj.remove(1));
	System.out.println(obj.insert(2));
	for (int i = 0; i < 10; i++)
	    System.out.println(obj.getRandom());
    }

}

class RandomizedSet {

    private HashMap<Integer, Integer> hm;
    private ArrayList<Integer> arrayList;

    /** Initialize your data structure here. */
    public RandomizedSet() {
	hm = new HashMap<Integer, Integer>();
	arrayList = new ArrayList<Integer>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already
     * contain the specified element.
     */
    public boolean insert(int val) {
	if (hm.containsKey(val))
	    return false;
	else {
	    hm.put(val, val);
	    arrayList.add(val);
	    return true;
	}
    }

    /**
     * Removes a value from the set. Returns true if the set contained the
     * specified element.
     */
    public boolean remove(int val) {
	if (hm.containsKey(val)) {
	    hm.remove(val);
	    arrayList.remove(val);
	    return true;
	} else {
	    return false;
	}

    }

    /** Get a random element from the set. */
    public int getRandom() {
	int random = (int) (Math.random() * arrayList.size());
	return arrayList.get(random);
    }
}
