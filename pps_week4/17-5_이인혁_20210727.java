package week4;

//17-5
/*
public class IntersectionOfTwoArrays {

}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : nums1) {
            map1.put(i, 0);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums2) {
            map2.put(i, 0);
        }

        if (map1.size() < map2.size()) {
            Iterator it = map1.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (map2.containsKey(entry.getKey())) {
                    list.add((Integer) entry.getKey());
                }
            }
        } else {
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (map1.containsKey(entry.getKey())) {
                    list.add((Integer) entry.getKey());
                }
            }
        }

        result = new int[list.size()];
        for (int i : list) {
            result[index++] = i;
        }
        return result;
    }
}
*/